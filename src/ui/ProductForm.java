package ui;

import model.Product;
import service.ProductService;
import service.ProductServiceImpl;
import util.ValidateUtil;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import exceptions.AppException;
import exceptions.AppExceptionHandler;

import java.awt.*;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Logger;

public class ProductForm extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextField txtId, txtName, txtPrice, txtQuantity, txtUnit, txtCreatedBy;
	
    private JTable table;
    private DefaultTableModel tableModel;


    private ProductService service = new ProductServiceImpl();


    public ProductForm() {
        setTitle("Quản Lý Sản Phẩm");
        setSize(900, 550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        initUI();
        loadDataToTable();
    }

    private void initUI() {
    	setLayout(new BorderLayout());

        
        // Form input
        JPanel inputPanel = new JPanel(new GridLayout(3, 4, 10, 10));
        txtId = new JTextField(); txtName = new JTextField(); txtPrice = new JTextField();
        txtQuantity = new JTextField(); txtUnit = new JTextField(); txtCreatedBy = new JTextField();
       
        inputPanel.add(new JLabel("Mã SP:"));
        txtId.setEnabled(false);
        inputPanel.add(txtId);
        inputPanel.add(new JLabel("Tên SP:"));
        inputPanel.add(txtName);
        inputPanel.add(new JLabel("Giá:"));
        inputPanel.add(txtPrice);
        inputPanel.add(new JLabel("Số lượng:"));
        inputPanel.add(txtQuantity);
        inputPanel.add(new JLabel("Đơn vị:"));
        inputPanel.add(txtUnit);
        inputPanel.add(new JLabel("Người thêm:"));
        inputPanel.add(txtCreatedBy);

        add(inputPanel, BorderLayout.NORTH);

        // Bảng
        tableModel = new DefaultTableModel(new String[]{"ID", "Tên", "Giá", "Số Lượng", "Đơn vị", "Ngày tạo", "Người tạo"}, 0);
        table = new JTable(tableModel);
        add(new JScrollPane(table), BorderLayout.CENTER);

        // Nút
        JPanel buttonPanel = new JPanel();
        JButton btnAdd = new JButton("Thêm");
        JButton btnDelete = new JButton("Xóa");
        JButton btnUpdate = new JButton("Sửa");
        JButton btnSearch = new JButton("Tìm");
        JButton btnLoad = new JButton("Tải lại");
        JButton btnClear = new JButton("🧹 Làm mới");
        buttonPanel.add(btnAdd);
		buttonPanel.add(btnDelete);
		buttonPanel.add(btnUpdate);
		buttonPanel.add(btnSearch);
        buttonPanel.add(btnLoad);
        buttonPanel.add(btnClear);
        add(buttonPanel, BorderLayout.SOUTH);

        // Sự kiện
        btnAdd.addActionListener(e -> addProduct());
        btnDelete.addActionListener(e -> deleteProduct());
        btnUpdate.addActionListener(e -> updateProduct());
        btnSearch.addActionListener(e -> findProduct());
        btnLoad.addActionListener(e -> loadDataToTable());
        btnClear.addActionListener(e -> clearForm());
        
        
        table.getSelectionModel().addListSelectionListener(e -> {
            int row = table.getSelectedRow();
            if (row != -1) {
                txtId.setText(tableModel.getValueAt(row, 0).toString());
                txtName.setText(tableModel.getValueAt(row, 1).toString());
                txtPrice.setText(tableModel.getValueAt(row, 2).toString());
                txtQuantity.setText(tableModel.getValueAt(row, 3).toString());
                txtUnit.setText(tableModel.getValueAt(row, 4).toString());
                txtCreatedBy.setText(tableModel.getValueAt(row, 6).toString());
            }
        });

        
    }

    private void addProduct() {
    	try {
            String name = txtName.getText();
            double price = ValidateUtil.parsePositiveDouble(txtPrice.getText(), "Giá sản phẩm");
            int quantity = ValidateUtil.parsePositiveInt(txtQuantity.getText(), "Số lượng");
            String unit = txtUnit.getText();
            String createdBy = txtCreatedBy.getText();

         // Kiểm tra số âm
            if (price < 0) {
                JOptionPane.showMessageDialog(this, "Giá sản phẩm không được âm!");
                return;
            }
            if (quantity < 0) {
                JOptionPane.showMessageDialog(this, "Số lượng không được âm!");
                return;
            }
            
            Product p = new Product(name, price, quantity, unit, LocalDate.now(), createdBy);
            service.addProduct(p);
            JOptionPane.showMessageDialog(this, "Thêm thành công!");
            loadDataToTable();
        } catch (AppException ex) {
        	AppExceptionHandler.handle(ex, "thêm sản phẩm");
        }
    }
    
    private void deleteProduct() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            int id = (int) tableModel.getValueAt(selectedRow, 0);
            service.deleteProductById(id);
            loadDataToTable();
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sản phẩm để xóa!");
        }
    }
    
    private void updateProduct(){
    	 try {
    	        int id = Integer.parseInt(txtId.getText());
    	        String name = txtName.getText();
    	        double price = ValidateUtil.parsePositiveDouble(txtPrice.getText(), "Giá sản phẩm");
    	        int quantity = ValidateUtil.parsePositiveInt(txtQuantity.getText(), "Số lượng");   	        
    	         	        
    	        String unit = txtUnit.getText();
    	        String createdBy = txtCreatedBy.getText();
    	        
    	        if (price < 0 || quantity < 0) {
    	            JOptionPane.showMessageDialog(this, "Giá và số lượng không được âm!");
    	            return;
    	        }

    	        Product p = new Product(id, name, price, quantity, unit, LocalDate.now(), createdBy);
    	        
    	        service.updateProduct(p);
    	        JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
    	        loadDataToTable();
    	    } catch (AppException ex) {
    	        AppExceptionHandler.handle(ex, "cập nhật sản phẩm");
    	    }
    }
    
    private void findProduct() {
    	String keyword = JOptionPane.showInputDialog(this, "Nhập tên sản phẩm cần tìm:");
        if (keyword != null && !keyword.trim().isEmpty()) {
            tableModel.setRowCount(0); // Xóa dữ liệu bảng cũ
            List<Product> list = service.findProductsByName(keyword);
            if (list.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không tìm thấy sản phẩm nào!");
            }
            for (Product p : list) {
                tableModel.addRow(new Object[]{
                    p.getId(), p.getName(), p.getPrice(), p.getQuantity(), p.getUnit(), p.getCreatedDate(), p.getCreatedBy()
                });
            }
        }
    }

    private void loadDataToTable() {
        tableModel.setRowCount(0);
        List<Product> list = service.getAllProducts();
        for (Product p : list) {
            tableModel.addRow(new Object[]{
                    p.getId(), p.getName(), p.getPrice(), p.getQuantity(), p.getUnit(), p.getCreatedDate(), p.getCreatedBy()
            });
        }
    }
    
    private void clearForm() {
        txtId.setText("");
        txtName.setText("");
        txtPrice.setText("");
        txtQuantity.setText("");
        txtUnit.setText("");
        txtCreatedBy.setText("");
        table.clearSelection(); // bỏ chọn bảng
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ProductForm().setVisible(true));
    }
}

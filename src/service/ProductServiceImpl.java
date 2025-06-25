package service;

import java.util.List;

import dao.ProductDAO;
import exceptions.AppException;
import model.Product;

public class ProductServiceImpl implements ProductService{
	private final ProductDAO dao = new ProductDAO();

	@Override
	public void addProduct(Product p) {
		try {
		    dao.insert(p);
		} catch (Exception ex) {
		    throw new AppException("Không thể thêm sản phẩm", ex);
		}		
	}

	@Override
	public void updateProduct(Product p) {
		try {
            dao.update(p);
        } catch (Exception e) {
            throw new AppException("Lỗi khi cập nhật sản phẩm", e);
        }		
	}

	@Override
	public void deleteProductById(int id) {
		try {
            dao.deleteById(id);
        } catch (Exception e) {
            throw new AppException("Lỗi khi xoá sản phẩm ID = " + id, e);
        }
	}

	@Override
	public List<Product> getAllProducts() {
		try {
            return dao.findAll();
        } catch (Exception e) {
            throw new AppException("Lỗi khi truy vấn danh sách sản phẩm", e);
        }
	}

	@Override
	public List<Product> findProductsByName(String keyword) {
		try {
            return dao.findByName(keyword);
        } catch (Exception e) {
            throw new AppException("Lỗi khi tìm sản phẩm theo tên", e);
        }
	}

	@Override
	public Product findById(int id) {
		try {
            return dao.findById(id);
        } catch (Exception e) {
            throw new AppException("Lỗi khi tìm sản phẩm theo ID", e);
        }
	}

}

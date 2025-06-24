# 🛠️ Product CRUD - Java Swing + JDBC + MySQL

Ứng dụng quản lý sản phẩm sử dụng Java Swing (giao diện), JDBC (kết nối MySQL) theo mô hình MVC đơn giản.

![UML Diagram](./product_crud_uml.png)

---

## ✨ Tính năng

- [x] Thêm sản phẩm mới (ID duy nhất)
- [x] Sửa thông tin sản phẩm
- [x] Xoá sản phẩm khỏi danh sách
- [x] Tìm kiếm sản phẩm theo tên
- [x] Làm mới form nhập liệu
- [x] Tự động hiển thị dữ liệu khi chọn trên bảng
- [x] Kiểm tra trùng mã sản phẩm trước khi thêm

---

## 🧱 Công nghệ sử dụng

| Thành phần     | Công cụ                     |
|----------------|-----------------------------|
| Giao diện      | Java Swing (JFrame, JTable) |
| CSDL           | MySQL                       |
| Kết nối DB     | JDBC                        |
| IDE            | Eclipse                     |
| Thử API        | Không cần (ứng dụng desktop)|
| GitHub         | Quản lý mã nguồn            |

---

## 🗃️ Cấu trúc thư mục
├── dao/
│ └── ProductDAO.java
├── db/
│ └── DBConnect.java
├── model/
│ └── Product.java
├── ui/
│ └── ProductForm.java
├── .gitignore
├── README.md
└── jdbc.jar (đã add vào build path)

---

## 🧪 Cách chạy ứng dụng

1. Mở project trong **Eclipse**
2. Đảm bảo MySQL đã cài & chạy
3. Tạo bảng `products`:

```sql
CREATE DATABASE product_db;

USE product_db;

CREATE TABLE products (
  id INT PRIMARY KEY,
  name VARCHAR(255),
  price DOUBLE,
  quantity INT,
  unit VARCHAR(50),
  created_date DATE,
  created_by VARCHAR(100)
);
4. Cập nhật lại thông tin kết nối trong DBConnect.java

5. Run file ProductForm.java



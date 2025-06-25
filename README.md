
# 🛍️ Quản Lý Sản Phẩm - Java Swing + Hibernate

Dự án CRUD sản phẩm bằng Java Swing, kết nối MySQL thông qua Hibernate ORM. Phù hợp cho sinh viên hoặc lập trình viên học theo lộ trình Fullstack Java Web.

---

## 🚀 Tính năng

- [x] Thêm, sửa, xóa, tìm kiếm sản phẩm
- [x] Giao diện Java Swing thân thiện
- [x] Kết nối MySQL bằng Hibernate ORM
- [x] Quản lý lỗi với `AppException` + `AppExceptionHandler`
- [x] Kiểm tra dữ liệu đầu vào bằng `ValidateUtil`
- [x] Sử dụng `FormMode` để tách luồng thêm/sửa

---

## 🧰 Công nghệ sử dụng

| Layer    | Công nghệ                       |
|----------|---------------------------------|
| UI       | Java Swing                      |
| Logic    | Java 17, Hibernate ORM          |
| Database | MySQL                           |
| Tool     | Eclipse, MySQL Workbench, VSC   |

---

## 🧱 Cấu trúc thư mục

```bash
src/
│
├── dao/
│   └── ProductDAO_Hibernate.java
│
├── model/
│   └── Product.java
│
├── service/
│   └── ProductService.java
│
├── ui/
│   └── ProductForm.java
│
├── util/
│   ├── ValidateUtil.java
│   └── AppExceptionHandler.java
│
├── exception/
│   └── AppException.java
│
└── enum/
    └── FormMode.java
```

---

## 🔐 Quản lý lỗi

- Dùng `AppException` để xử lý nghiệp vụ
- `AppExceptionHandler` kết hợp `JOptionPane` để hiển thị popup lỗi cho người dùng và ghi log bằng `Logger`

---

## 🧠 Kiểm tra dữ liệu đầu vào

- `ValidateUtil` là class tiện ích kiểm tra dữ liệu đầu vào (số âm, sai định dạng, ô trống...)
- Các phương thức được viết dạng `static` hoặc dùng `@UtilityClass` (Lombok)
- Sử dụng `FormMode` để tách rõ logic khi thêm hoặc cập nhật

---

## ⚙️ Cấu hình Hibernate

File `hibernate.cfg.xml`:

```xml
<property name="hibernate.connection.url">jdbc:mysql://localhost:3306/your_database</property>
<property name="hibernate.connection.username">root</property>
<property name="hibernate.connection.password">your_password</property>
<property name="hibernate.hbm2ddl.auto">update</property>
```

---

## ▶️ Cách chạy dự án

1. Clone về máy:
   ```bash
   git clone https://github.com/be-better-be-stronger/product-crud-hibernate.git
   cd product-crud-hibernate
   ```

2. Mở bằng Eclipse → Chạy `ProductForm.java`

3. Đảm bảo MySQL đang chạy và bạn đã cấu hình `hibernate.cfg.xml`

---

## 📌 Lộ trình học Fullstack Java Web

Dự án này ở **Bước 3/6** trong lộ trình:

1. ✅ Java Console  
2. ✅ Java Swing + JDBC  
3. ✅ Java Swing + Hibernate  
4. ⏳ JSP/Servlet + HTML/CSS/JS  
5. ⏳ Spring MVC + AngularJS  
6. ⏳ Spring Boot + Angular + Bootstrap

---

## 📄 Giấy phép

MIT License – Tự do học tập và mở rộng ❤️

---

## 📸 Giao diện ứng dụng

> Giao diện chính sử dụng Java Swing thuần, thao tác nhanh, trực quan

---

## 🧩 Sơ đồ luồng Hibernate

> Dưới đây là sơ đồ thể hiện luồng hoạt động khi thêm sản phẩm:

```
UI (ProductForm)
   ↓ gọi
Service (ProductService)
   ↓ gọi
DAO (ProductDAO_Hibernate)
   ↓
Hibernate session.save(product)
   ↓
MySQL (products table)
```

---

## 🙋‍♂️ Liên hệ / Đóng góp

- 📧 Email: dangquocthanh.la@gmail.com
- 🌐 GitHub: [github.com/be-better-be-stronger](https://github.com/be-better-be-stronger)

> Rất mong nhận được góp ý và đóng góp từ cộng đồng để hoàn thiện dự án!

---

## 🏁 Phiên bản

- **v1.0.0**: Khởi tạo CRUD Swing + Hibernate  
- **v1.1.0**: Tách Service, Exception Handling, ValidateUtil  
- **v1.2.0**: Bổ sung FormMode, ghi log với Logger

---

## 📢 TODO (Bước tiếp theo)

- [ ] Tạo giao diện web bằng JSP/Servlet (Bước 4)  
- [ ] Tách controller riêng cho xử lý web  
- [ ] Tích hợp Spring MVC, chuyển dần sang REST API  

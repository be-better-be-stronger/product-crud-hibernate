
drop database product_db;
-- Tạo database

CREATE DATABASE IF NOT EXISTS product_db CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE product_db;

-- Tạo bảng products
DROP TABLE IF EXISTS products;
CREATE TABLE products (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    price DOUBLE NOT NULL,
    quantity INT NOT NULL,
    unit VARCHAR(30),
    created_date DATE,
    created_by VARCHAR(50)
);

-- Thêm dữ liệu mẫu
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Area executive", 118281.57, 96, "hộp", "2024-07-27", "quyen");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Specific involve", 37173.89, 27, "chai", "2024-10-05", "linh");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Box this", 86116.87, 86, "kg", "2025-06-08", "linh");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Two American", 134848.82, 84, "gói", "2024-11-18", "khoa");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Not or", 199001.48, 38, "chai", "2024-10-31", "thanh");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Grow together", 122460.94, 10, "hộp", "2024-07-14", "admin");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Collection central", 39207.22, 13, "gói", "2024-11-01", "khoa");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Option goal", 123422.8, 92, "kg", "2025-03-23", "quyen");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Else common", 163757.25, 38, "chai", "2024-06-24", "admin");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Western least", 164052.75, 23, "bịch", "2025-04-20", "admin");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Begin unit", 175424.56, 61, "kg", "2025-02-11", "admin");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Huge available", 10702.64, 57, "chai", "2024-06-26", "thanh");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Four sign", 178110.89, 6, "bịch", "2024-12-15", "linh");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Blue western", 142022.89, 72, "gói", "2024-07-11", "linh");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Best region", 80845.54, 2, "hộp", "2024-08-18", "thanh");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Card street", 73298.81, 94, "kg", "2025-06-11", "linh");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Against film", 53064.34, 35, "chai", "2025-06-12", "admin");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Law painting", 98665.77, 18, "gói", "2024-12-26", "thanh");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Evidence manager", 175463.74, 75, "chai", "2025-05-15", "khoa");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Although specific", 36942.21, 52, "gói", "2024-10-20", "admin");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Gun nearly", 188782.04, 30, "kg", "2025-05-01", "linh");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Meeting design", 19449.74, 75, "bịch", "2025-05-08", "linh");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Politics purpose", 23339.27, 91, "kg", "2025-01-14", "admin");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Other table", 44236.62, 27, "kg", "2024-10-24", "khoa");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Actually information", 67489.64, 43, "hộp", "2025-06-05", "khoa");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Specific race", 48121.7, 87, "chai", "2025-01-09", "thanh");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Leader reveal", 53224.38, 94, "hộp", "2025-01-19", "khoa");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Pull style", 87828.41, 74, "kg", "2025-03-09", "thanh");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Pick voice", 178884.54, 50, "kg", "2025-05-13", "admin");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Mention near", 158864.22, 78, "gói", "2025-03-10", "quyen");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Kind house", 36079.12, 63, "kg", "2025-01-08", "linh");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Almost throw", 148835.0, 52, "kg", "2025-04-12", "admin");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Quite course", 179039.76, 45, "bịch", "2025-04-01", "khoa");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Ten beautiful", 199788.76, 41, "hộp", "2025-06-13", "linh");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Message really", 18998.93, 84, "hộp", "2024-10-03", "thanh");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Conference good", 101035.83, 28, "hộp", "2024-11-01", "thanh");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Once include", 178795.53, 62, "kg", "2025-06-02", "thanh");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Back several", 104392.78, 100, "hộp", "2024-12-18", "thanh");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Impact page", 121195.49, 51, "chai", "2025-04-22", "admin");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Great admit", 45045.88, 32, "gói", "2024-09-05", "quyen");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Peace behavior", 153649.14, 97, "kg", "2025-05-12", "linh");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Production himself", 123640.72, 71, "gói", "2024-06-28", "thanh");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("War he", 20213.45, 32, "kg", "2024-09-20", "khoa");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Into night", 189367.67, 66, "chai", "2025-01-04", "linh");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Shake than", 34314.79, 74, "kg", "2025-06-12", "linh");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("As purpose", 19554.33, 4, "bịch", "2024-10-13", "quyen");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Miss south", 66613.54, 74, "hộp", "2025-02-23", "thanh");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Service early", 196549.17, 69, "kg", "2025-01-21", "linh");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Member cost", 130347.05, 69, "kg", "2024-08-22", "quyen");
INSERT INTO products (name, price, quantity, unit, created_date, created_by)
VALUES ("Not light", 93005.94, 10, "bịch", "2024-11-18", "khoa");

select * from products;


CREATE TABLE IF NOT EXISTS products (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    price DOUBLE,
    quantity INT
);

CREATE TABLE IF NOT EXISTS transactions (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    product_id BIGINT,
    inserted_amount DOUBLE,
    change DOUBLE,
    status VARCHAR(255),
    FOREIGN KEY (product_id) REFERENCES products(id)
);







INSERT INTO products (NAME, PRICE, QUANTITY) VALUES ('Coke', 40.0, 10);
INSERT INTO products (NAME, PRICE, QUANTITY) VALUES ('Pepsi', 30.0, 8);
INSERT INTO products (NAME, PRICE, QUANTITY) VALUES ('Water', 20.0, 5);
INSERT INTO products (NAME, PRICE, QUANTITY) VALUES ('Chips', 15.0, 8);
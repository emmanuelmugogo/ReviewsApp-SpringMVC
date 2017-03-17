// initialize customers

INSERT INTO Review(id, title, image_Url, review_Category, content, categories) VALUES(42, 'mama', 'baba', 'dada', 'bibi', 'babu', 'kaka')
INSERT INTO Review(title, image_Url, review_Category, content, categories) VALUES('mama', 'baba', 'dada', 'bibi', 'babu', 'kaka')

// initialize orders

INSERT INTO Category(order_number, customer_id) VALUES('foo', 42)
INSERT INTO Categoty(order_number, customer_id) VALUES('bar', 42)

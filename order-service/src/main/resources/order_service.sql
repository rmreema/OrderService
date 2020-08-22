CREATE TABLE price_matrix (
  matrix_id int(11) NOT NULL AUTO_INCREMENT,
  price int(11)  NULL,
  start_time time NOT NULL,
  end_time time NOT NULL,
  PRIMARY KEY (matrix_id));


CREATE TABLE restaurant (
  restaurant_id int(11) NOT NULL AUTO_INCREMENT,
restaurant_name varchar(200) DEFAULT NULL,
  location varchar(2000) DEFAULT NULL,
  rating int(4) NOT NULL,
  PRIMARY KEY (restaurant_id)
) 

CREATE TABLE restaurant_item (
  item_id int(11) NOT NULL AUTO_INCREMENT,
restaurant_id int(11)  NULL,
  item_name varchar(200) DEFAULT NULL,
  matrix_id int(11)  NULL,
  PRIMARY KEY (item_id),
  CONSTRAINT restaurant_fk FOREIGN KEY (restaurant_id) 
REFERENCES restaurant (restaurant_id),
CONSTRAINT restaurant_mat_fk FOREIGN KEY (matrix_id) 
REFERENCES price_matrix (matrix_id)
) 

CREATE TABLE booking (
  booking_id int(11) NOT NULL AUTO_INCREMENT,
  restaurant_id int(11)  NULL,
  user_name varchar(200) NOT NULL,
  phone_number varchar(10) NOT NULL,
  email_id varchar(200) NOT NULL,
address varchar(1000)NOT NULL,
  PRIMARY KEY (booking_id),
  CONSTRAINT res_book_fk FOREIGN KEY (restaurant_id) 
REFERENCES restaurant (restaurant_id)) 


CREATE TABLE booking_detail (
  detail_id int(11) NOT NULL AUTO_INCREMENT,
  booking_id int(11)  NULL,
  item_id int(11)  NULL,
  quantity int(4) NOT NULL,
  amount double NOT NULL,
  PRIMARY KEY (detail_id),
  CONSTRAINT res_bk_it_fk FOREIGN KEY (booking_id) 
REFERENCES booking (booking_id),
CONSTRAINT res_it_fk FOREIGN KEY (item_id) 
REFERENCES restaurant_item (item_id)

) 


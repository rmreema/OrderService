
INSERT INTO restaurant(restaurant_id,restaurant_name,location,rating)
VALUES(1,"zaitoon","velacherry",2);
INSERT INTO restaurant(restaurant_id,restaurant_name,location,rating)
VALUES(2,"A2B","velacherry",4);
INSERT INTO restaurant(restaurant_id,restaurant_name,location,rating)
VALUES(3,"Akshayam","velacherry",5);
INSERT INTO restaurant(restaurant_id,restaurant_name,location,rating)
VALUES(4,"Metro","velacherry",2);


INSERT INTO restaurant_item(item_id,restaurant_id,item_name,price)
VALUES(1,1,"Parotta",30);
INSERT INTO restaurant_item(item_id,restaurant_id,item_name,price)
VALUES(2,1,"chicken",300);
INSERT INTO restaurant_item(item_id,restaurant_id,item_name,price)
VALUES(3,1,"fish",100);
INSERT INTO restaurant_item(item_id,restaurant_id,item_name,price)
VALUES(4,2,"dosa",30);
INSERT INTO restaurant_item(item_id,restaurant_id,item_name,price)
VALUES(5,2,"pongal",100);
INSERT INTO restaurant_item(item_id,restaurant_id,item_name,price)
VALUES(6,2,"sweets",100);
INSERT INTO restaurant_item(item_id,restaurant_id,item_name,price)
VALUES(7,2,"fried rice",200);

INSERT INTO booking(booking_id,restaurant_id,user_name,phone_number,email_id,address)
VALUES(1,1,"Reema","9710733614","rm@gmail.com","Madipakkam");
INSERT INTO booking(booking_id,restaurant_id,user_name,phone_number,email_id,address)
VALUES(2,2,"krisha","9990733614","kr@gmail.com","pallikaranai");
INSERT INTO booking(booking_id,restaurant_id,user_name,phone_number,email_id,address)
VALUES(3,3,"Pala","8880733614","pa@gmail.com","adambakkam");
INSERT INTO booking(booking_id,restaurant_id,user_name,phone_number,email_id,address)
VALUES(4,4,"Nethra","6670733614","ne@gmail.com","omr");

INSERT INTO booking_detail(detail_id,booking_id,item_id,quantity,amount)
VALUES(1,1,2,2,600);
INSERT INTO booking_detail(detail_id,booking_id,item_id,quantity,amount)
VALUES(2,3,1,5,150);
INSERT INTO customer (id,name,customer_type) VALUES(2,'test_primimum','PREMIMUM');
INSERT INTO customer (id,name,customer_type) VALUES(1,'test_regular','REGULAR');

INSERT INTO discount_slabes (id,customer_type,min_value,max_value,discount) VALUES(1,'REGULAR',0,4999,0);
INSERT INTO discount_slabes (id,customer_type,min_value,max_value,discount) VALUES(2,'REGULAR',5000,9999,10);
INSERT INTO discount_slabes (id,customer_type,min_value,max_value,discount) VALUES(3,'REGULAR',10000,999999999999,20);

INSERT INTO discount_slabes (id,customer_type,min_value,max_value,discount) VALUES(4,'PREMIMUM',0,3999,10);
INSERT INTO discount_slabes (id,customer_type,min_value,max_value,discount) VALUES(5,'PREMIMUM',4000,7999,15);
INSERT INTO discount_slabes (id,customer_type,min_value,max_value,discount) VALUES(6,'PREMIMUM',8000,11999,20);
INSERT INTO discount_slabes (id,customer_type,min_value,max_value,discount) VALUES(7,'PREMIMUM',12000,999999999999,30);


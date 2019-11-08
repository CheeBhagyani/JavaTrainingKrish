ALTER TABLE employee
DROP CONSTRAINT fkcx2bresfc1ram2i4k1rxjp4d7;

INSERT INTO employee (name,address,dob,role,salary,department_dId) VALUES 
				( 'Anna', 'Colombo', '1995-12-05','qa', 1000,1 ),
				( 'John', 'Kandy', '1995-04-04','ba', 2000,1 ),
				( 'Bhagyani', 'Colombo', '1995-02-05','se', 1000,1 ),
				( 'Kasun', 'Colombo', '1995-03-18','ba', 1000,2 ),
				( 'Jane', 'Matale', '1995-07-10','se', 1000,2 ),
				( 'Eddie', 'Colombo', '1995-08-15','se', 1000 ,1),
				( 'Sam', 'Kagalle', '1995-11-05','qa', 1000 ,1),
				( 'Roy', 'Kandy', '1995-05-31','se', 1000,2 ),
				( 'Peter', 'Galle', '1995-06-25','qa', 1000,2 ),
				( 'Jane', 'Matale', '1995-09-15','se', 1000,1 );
				
INSERT INTO department (name) VALUES 
				('IT'),
				('HR');		
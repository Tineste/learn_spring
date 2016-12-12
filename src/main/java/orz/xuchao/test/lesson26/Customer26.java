package orz.xuchao.test.lesson26;

//CREATE TABLE `customer` (

//		  `CUST_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
//		  `NAME` varchar(100) NOT NULL,
//		  `AGE` int(10) unsigned NOT NULL,
//		  PRIMARY KEY (`CUST_ID`)
//		) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

public class Customer26 {
	int custId;
	String name;
	int age;

	public Customer26(int custId, String name, int age) {
		this.custId = custId;
		this.name = name;
		this.age = age;

	}

	public Customer26() {
		// TODO Auto-generated constructor stub
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "custId==>" + custId + " name==>" + name + " age==>" + age;
	}

}
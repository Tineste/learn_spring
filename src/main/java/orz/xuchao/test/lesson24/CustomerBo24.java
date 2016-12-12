package orz.xuchao.test.lesson24;

public interface CustomerBo24 {

	void addCustomer();
	
	String addCustomerReturnValue();
	
	void addCustomerThrowException() throws Exception;
	
	void addCustomerAround(String name);
}
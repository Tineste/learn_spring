package orz.xuchao.test.lesson18;

import org.springframework.beans.factory.annotation.Autowired;

public class CustomerService18 {

	@Autowired
	CustomerDAO18 customerDAO;

	@Override
	public String toString() {
		return "CustomerService [customerDAO=" + customerDAO + "]";
	}
}

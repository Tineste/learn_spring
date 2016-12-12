package orz.xuchao.test.lesson17;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("AAA")
public class CustomerService17 
{
	@Autowired
	CustomerDAO17 customerDAO;

	@Override
	public String toString() {
		return "CustomerService [customerDAO=" + customerDAO + "]";
	}
		
}
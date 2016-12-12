package orz.xuchao.test.lesson26;

import java.util.List;

import orz.xuchao.test.lesson4.CustomerBo;

public interface CustomerDAO26 {
	public void insert(Customer26 customer);
	public Customer26 findByCustomerId(int custId);
	public List<Customer26> findAll();
	public void insertBatch(final List<Customer26> customers);
}

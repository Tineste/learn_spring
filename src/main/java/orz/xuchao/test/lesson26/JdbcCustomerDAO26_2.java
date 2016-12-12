package orz.xuchao.test.lesson26;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class JdbcCustomerDAO26_2 extends JdbcDaoSupport implements CustomerDAO26 {
	private JdbcTemplate jdbcTemplate;
	public void insert(Customer26 customer) {
		String sql = "INSERT INTO CUSTOMER " +
				"(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";
					 
			getJdbcTemplate().update(sql, new Object[] { customer.getCustId(),
					customer.getName(),customer.getAge()  
			});
	}
	public Customer26 findByCustomerId(int custId) {
		String sql = "SELECT * FROM CUSTOMER WHERE CUST_ID = ?";
//		Customer26 customer = (Customer26)getJdbcTemplate().queryForObject(
//				sql, new Object[] { custId }, new CustomerRowMapper26());

		Customer26 customer = (Customer26)getJdbcTemplate().queryForObject(
				sql, new Object[] { custId }, 
				new BeanPropertyRowMapper(Customer26.class));
		
		
		return customer;
	}
	
	public void insertBatch(final List<Customer26> customers){
		
		  String sql = "INSERT INTO CUSTOMER " +
			"(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";
					
		  getJdbcTemplate().batchUpdate(sql, new BatchPreparedStatementSetter() {
					
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				Customer26 customer = customers.get(i);
				ps.setLong(1, customer.getCustId());
				ps.setString(2, customer.getName());
				ps.setInt(3, customer.getAge() );
			}
					
			public int getBatchSize() {
				return customers.size();
			}
		  });
		}
	
	//多行查询1
	//public List<Customer> findAll(){
	//	
//		String sql = "SELECT * FROM CUSTOMER";
//			 
//		List<Customer> customers = new ArrayList<Customer>();
	//	
//		List<Map> rows = getJdbcTemplate().queryForList(sql);
//		for (Map row : rows) {
//			Customer customer = new Customer();
//			customer.setCustId((Long)(row.get("CUST_ID")));
//			customer.setName((String)row.get("NAME"));
//			customer.setAge((Integer)row.get("AGE"));
//			customers.add(customer);
//		}
//			
//		return customers;
	//}

//	多行查询2
	public List<Customer26> findAll(){
		
		String sql = "SELECT * FROM CUSTOMER";
			
		List<Customer26> customers  = getJdbcTemplate().query(sql,
				new BeanPropertyRowMapper(Customer26.class));
			
		return customers;
	}

	//单列名
	//public String findCustomerNameById(int custId){
	//	
//		String sql = "SELECT NAME FROM CUSTOMER WHERE CUST_ID = ?";
//			 
//		String name = (String)getJdbcTemplate().queryForObject(
//				sql, new Object[] { custId }, String.class);
	//	
//		return name;
//			
	//}

	//行总数
	//public int findTotalCustomer(){
	//	
//		String sql = "SELECT COUNT(*) FROM CUSTOMER";
//			 
//		int total = getJdbcTemplate().queryForInt(sql);
//					
//		return total;
	//}
}





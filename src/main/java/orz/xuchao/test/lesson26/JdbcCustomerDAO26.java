package orz.xuchao.test.lesson26;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcCustomerDAO26 implements CustomerDAO26 {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void insert(Customer26 customer) {
		// 初级的
		// String sql = "INSERT INTO CUSTOMER " +
		// "(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";
		// Connection conn = null;
		// try {
		// conn = dataSource.getConnection();
		// PreparedStatement ps = conn.prepareStatement(sql);
		// ps.setInt(1, customer.getCustId());
		// ps.setString(2, customer.getName());
		// ps.setInt(3, customer.getAge());
		// ps.executeUpdate();
		// ps.close();
		// } catch (SQLException e) {
		// throw new RuntimeException(e);
		// } finally {
		// if (conn != null) {
		// try {
		// conn.close();
		// } catch (SQLException e) {}
		// }
		// }

		// 使用JdbcTemplate示例
		String sql = "INSERT INTO CUSTOMER " + "(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";
		jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql, new Object[] { customer.getCustId(), customer.getName(), customer.getAge() });

	}

	public Customer26 findByCustomerId(int custId) {

		String sql = "SELECT * FROM CUSTOMER WHERE CUST_ID = ?";

		Connection conn = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, custId);
			Customer26 customer = null;
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				customer = new Customer26(rs.getInt("CUST_ID"), rs.getString("NAME"), rs.getInt("Age"));
			}
			rs.close();
			ps.close();
			return customer;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}
	}

	public List<Customer26> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void insertBatch(List<Customer26> customers) {
		// TODO Auto-generated method stub
		
	}
}
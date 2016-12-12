package orz.xuchao.test.lesson14;

public class BaseCustomerMalaysia {
	private String country;
	private String action;
	private int type;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Customer [date=" + country +" " +action+" "+type+"]";
	}

}

package orz.xuchao.test.lesson16;

public class Item16 {
	private String name;

	private int qty;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " name==>"+name+" qty==>"+qty;
	}
	
	
}

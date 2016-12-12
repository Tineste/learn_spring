package orz.xuchao.test.lesson16;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("itemBean16_2")
public class Item16_2 {
	
	@Value("itemB")
	private String name;

	@Value("11")
	private int qty;

	private int age;
	
	
	public int getAge(int  n){
		return 12+n;
	}
	
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

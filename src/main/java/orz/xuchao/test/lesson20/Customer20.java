package orz.xuchao.test.lesson20;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer20 {
	@Autowired
	@Qualifier("PersonBean20_2")
	private Person20 person;
	private int type;
	private String action;
	public Person20 getPerson() {
		return person;
	}
	public void setPerson(Person20 person) {
		this.person = person;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "person==>"+person+" type==>"+type+" action==>"+action;
	}
	
	
}

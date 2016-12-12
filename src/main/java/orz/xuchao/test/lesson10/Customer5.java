package orz.xuchao.test.lesson10;

import java.util.List;

public class Customer5 {

	private List lists;

	public List getLists() {
		return lists;
	}

	public void setLists(List lists) {
		this.lists = lists;
	}

	@Override
	public String toString() {
		StringBuffer sb=new StringBuffer();
		for (Object object : lists) {
			sb.append(object.toString());
		}
		return sb.toString();
	}
	
	
	
}

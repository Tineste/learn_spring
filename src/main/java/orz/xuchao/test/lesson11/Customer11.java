package orz.xuchao.test.lesson11;

import java.util.List;
import java.util.Set;

public class Customer11 {

	private Set sets;

	
	public Set getSets() {
		return sets;
	}


	public void setSets(Set sets) {
		this.sets = sets;
	}


	@Override
	public String toString() {
		StringBuffer sb=new StringBuffer();
		for (Object object : sets) {
			sb.append(object.toString());
		}
		return sb.toString();
	}
	
	
	
}

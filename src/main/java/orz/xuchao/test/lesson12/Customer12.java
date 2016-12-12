package orz.xuchao.test.lesson12;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Customer12 {
	private Map maps;

	public Map getMaps() {
		return maps;
	}

	public void setMaps(Map maps) {
		this.maps = maps;
		maps.entrySet();
	}
	
	@Override
	public String toString() {
		StringBuffer sb=new StringBuffer();
	
		Set set = maps.entrySet();     
		Iterator i = set.iterator();     
		while(i.hasNext()){  
		    Map.Entry<String, String> entry1=(Map.Entry<String, String>)i.next(); 
		    sb.append(" "+entry1.getKey()+"=="+entry1.getValue()+" ");
		    
		} 
		
		return sb.toString();
	}
	
	
	
}

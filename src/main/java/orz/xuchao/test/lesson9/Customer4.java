package orz.xuchao.test.lesson9;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Customer4 {
	private List<Object> lists;
	private Set<Object> sets;
	private Map<Object, Object> maps;
	private Properties pros;
	
	public List<Object> getLists() {
		return lists;
	}
	public void setLists(List<Object> lists) {
		this.lists = lists;
	}
	public Set<Object> getSets() {
		return sets;
	}
	public void setSets(Set<Object> sets) {
		this.sets = sets;
	}
	public Map<Object, Object> getMaps() {
		return maps;
	}
	public void setMaps(Map<Object, Object> maps) {
		this.maps = maps;
	}
	public Properties getPros() {
		return pros;
	}
	public void setPros(Properties pros) {
		this.pros = pros;
	}
	@Override
	public String toString() {
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.append("--lists--"));
		for (Object object : lists) {
			sb.append(object.toString()+"\n");
		}
		System.out.println(sb.append("--sets--"));
		for (Object object : sets) {
			sb.append(object.toString()+"\n");
		}
		System.out.println(sb.append("--maps--"));
		sb.append(maps.get("Key 1").toString()+"\n");
		sb.append(maps.get("Key 2").toString()+"\n");
		sb.append(maps.get("Key 3").toString()+"\n");
		System.out.println(sb.append("--pros--"));
		sb.append(pros.get("admin")+"\n");
		sb.append(pros.get("support")+"\n");
		
		return sb.toString();
	}
	

	
	
}

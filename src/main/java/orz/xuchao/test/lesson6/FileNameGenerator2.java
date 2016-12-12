package orz.xuchao.test.lesson6;

public class FileNameGenerator2 
{
	private String name;
	private String type;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	//getter and setter methods
		public String toString(){
			return " name : " +name + "\n type : "
	               + type ;
		}
		
}
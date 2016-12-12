package orz.xuchao.test.lesson4;

public class CustomerBo {
	private String name;
	public void setName(String name){
		this.name=name;
	}
	public void printMsg() {

		System.out.println("CustomerBo : " + name);
	}

}
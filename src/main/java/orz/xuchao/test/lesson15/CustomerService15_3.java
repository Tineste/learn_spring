package orz.xuchao.test.lesson15;



import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class CustomerService15_3
{
String message;
	
	public String getMessage() {
	  return message;
	}

	public void setMessage(String message) {
		System.out.println("3setMessage");
	  this.message = message;
	}
	
	@PostConstruct
	public void initIt() throws Exception {
	  System.out.println("3Init method after properties are set : " + message);
	}
	
	@PreDestroy
	public void cleanUp() throws Exception {
	  System.out.println("3Spring Container is destroy! Customer clean up");
	}
}
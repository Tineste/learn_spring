package orz.xuchao.test.lesson15;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
public class CustomerService15_2
{
	String message;
	
	public String getMessage() {
	  return message;
	}

	public void setMessage(String message) {
		System.out.println("2setMessage");
	  this.message = message;
	}
	
	public void initIt() throws Exception {
	  System.out.println("2Init method after properties are set : " + message);
	}
	
	public void cleanUp() throws Exception {
	  System.out.println("2Spring Container is destroy! Customer clean up");
	}
	
}
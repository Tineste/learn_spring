package orz.xuchao.test.lesson4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SchedulerConfig {
	
	@Bean(name="scheduler")
	public SchedulerBo suchedulerBo(){
		
		return new SchedulerBo();
		
	}
	
}
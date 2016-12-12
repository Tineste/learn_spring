package orz.xuchao.test.lesson3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
    @Bean(name="helloBean2")
    public HelloWorld2 helloWorld() {
        return new HelloWorldImpl();
    }
	
}
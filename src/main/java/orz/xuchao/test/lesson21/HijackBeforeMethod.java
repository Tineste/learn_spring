package orz.xuchao.test.lesson21;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

public class HijackBeforeMethod implements MethodBeforeAdvice,ThrowsAdvice,AfterReturningAdvice
{

	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		        System.out.println("HijackBeforeMethod : Before method hijacked!");
		}

	public void afterThrowing(IllegalArgumentException e) throws Throwable {
		System.out.println("HijackThrowException : Throw exception hijacked!");
	}

	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		  System.out.println("HijackAfterMethod : After method hijacked!");
	}
}
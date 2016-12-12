package orz.xuchao.test;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import orz.xuchao.test.lesson1.HelloWorld;
import orz.xuchao.test.lesson10.Customer5;
import orz.xuchao.test.lesson11.Customer11;
import orz.xuchao.test.lesson12.Customer12;
import orz.xuchao.test.lesson13.Customer13;
import orz.xuchao.test.lesson14.BaseCustomerMalaysia;
import orz.xuchao.test.lesson15.CustomerService15;
import orz.xuchao.test.lesson15.CustomerService15_2;
import orz.xuchao.test.lesson15.CustomerService15_3;
import orz.xuchao.test.lesson16.Customer16;
import orz.xuchao.test.lesson16.Customer16_2;
import orz.xuchao.test.lesson17.CustomerService17;
import orz.xuchao.test.lesson18.CustomerService18;
import orz.xuchao.test.lesson19.Customer19_1;
import orz.xuchao.test.lesson19.Customer19_2;
import orz.xuchao.test.lesson19.Customer19_3;
import orz.xuchao.test.lesson19.Customer19_4;
import orz.xuchao.test.lesson19.Customer19_5;
import orz.xuchao.test.lesson2.OutputHelper;
import orz.xuchao.test.lesson20.Customer20;
import orz.xuchao.test.lesson21.CustomerService21;
import orz.xuchao.test.lesson22.CustomerService22;
import orz.xuchao.test.lesson23.MyCustomerService;
import orz.xuchao.test.lesson24.CustomerBo24;
import orz.xuchao.test.lesson25.Customer25;
import orz.xuchao.test.lesson25.XMLConverter;
import orz.xuchao.test.lesson26.Customer26;
import orz.xuchao.test.lesson26.CustomerDAO26;
import orz.xuchao.test.lesson3.AppConfig;
import orz.xuchao.test.lesson3.HelloWorld2;
import orz.xuchao.test.lesson4.AppConfig2;
import orz.xuchao.test.lesson4.CustomerBo;
import orz.xuchao.test.lesson4.SchedulerBo;
import orz.xuchao.test.lesson5.Customer;
import orz.xuchao.test.lesson6.FileNameGenerator1;
import orz.xuchao.test.lesson6.FileNameGenerator2;
import orz.xuchao.test.lesson6.FileNameGenerator3;
import orz.xuchao.test.lesson7.Customer2;
import orz.xuchao.test.lesson8.CustomerService;
import orz.xuchao.test.lesson8.CustomerService2;
import orz.xuchao.test.lesson8.CustomerService3;
import orz.xuchao.test.lesson9.Customer4;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("--------------------lesson1-----------------------------");
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloBean");
		helloWorld.printHello();
		System.out.println("--------------------lesson2-----------------------------");
		OutputHelper output = (OutputHelper) context.getBean("OutputHelper");
		output.generateOutput();
		System.out.println("--------------------lesson3-----------------------------");
		context = new AnnotationConfigApplicationContext(AppConfig.class);
		HelloWorld2 helloWorld2 = (HelloWorld2) context.getBean("helloBean2");
		helloWorld2.printHelloWorld("Spring Java Config");
		System.out.println("----------------------lesson4---------------------------");
		context = new AnnotationConfigApplicationContext(AppConfig2.class);
		CustomerBo customer = (CustomerBo) context.getBean("customer");
		customer.setName("CustomerBo");
		customer.printMsg();
		SchedulerBo scheduler = (SchedulerBo) context.getBean("scheduler");
		scheduler.printMsg("Hello 22");
		System.out.println("-------------------------------------------------");
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		customer = (CustomerBo) context.getBean("CustomerBo");
		customer.setName("CustomerBo");
		customer.printMsg();
		scheduler = (SchedulerBo) context.getBean("SchedulerBo");
		scheduler.printMsg("Hello 22");
		System.out.println("----------------------lesson5---------------------------");
		context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
		Customer cust = (Customer) context.getBean("CustomerBean");
		System.out.println(cust);
		System.out.println("----------------------lesson6---------------------------");
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		FileNameGenerator1 fileNameGenerator1 = (FileNameGenerator1) context.getBean("FileNameGenerator1");
		FileNameGenerator2 fileNameGenerator2 = (FileNameGenerator2) context.getBean("FileNameGenerator2");
		FileNameGenerator3 fileNameGenerator3 = (FileNameGenerator3) context.getBean("FileNameGenerator3");
		System.out.println(fileNameGenerator1.toString());
		System.out.println(fileNameGenerator2.toString());
		System.out.println(fileNameGenerator3.toString());
		System.out.println("----------------------lesson7---------------------------");
		Customer2 customer2 = (Customer2) context.getBean("CustomerBean2");
		System.out.println(customer2);
		System.out.println("----------------------lesson8---------------------------");
		System.out.println("---单例子---");
		context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
		CustomerService custA = (CustomerService) context.getBean("customerService");
		custA.setMessage("Message by custA");
		System.out.println("Message : " + custA.getMessage());
		CustomerService custB = (CustomerService) context.getBean("customerService");
		System.out.println("Message : " + custB.getMessage());
		System.out.println("---原型---");
		CustomerService2 custA2 = (CustomerService2) context.getBean("customerService2");
		custA2.setMessage("Message by custA");
		System.out.println("Message : " + custA2.getMessage());
		CustomerService2 custB2 = (CustomerService2) context.getBean("customerService2");
		System.out.println("Message : " + custB2.getMessage());
		CustomerService3 custB3 = (CustomerService3) context.getBean("customerService3");
		custB3.setMessage("Message by custB3");
		System.out.println("Message : " + custB3.getMessage());
		System.out.println("----------------------lesson9---------------------------");
		Customer4 cust4 = (Customer4) context.getBean("CustomerBean4");
		System.out.println(cust4);
		System.out.println("----------------------lesson10---------------------------");
		Customer5 cust5 = (Customer5) context.getBean("Customer5");
		System.out.println(cust5.toString());
		System.out.println("----------------------lesson11---------------------------");
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Customer11 cust11 = (Customer11) context.getBean("CustomerBean11");
		System.out.println(cust11);
		System.out.println("----------------------lesson12---------------------------");
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Customer12 cust12 = (Customer12) context.getBean("CustomerBean12");
		System.out.println(cust12);
		System.out.println("----------------------lesson13---------------------------");
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Customer13 cust13 = (Customer13) context.getBean("customer13");
		System.out.println(cust13);
		System.out.println("----------------------lesson14---------------------------");
		BaseCustomerMalaysia cust14 = (BaseCustomerMalaysia) context.getBean("Customer14");
		System.out.println(cust14);
		System.out.println("----------------------lesson15---------------------------");
		ConfigurableApplicationContext context2 = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml" });
		CustomerService15 cust15 = (CustomerService15) context.getBean("customerService15");
		System.out.println(cust15);
		CustomerService15_2 cust15_2 = (CustomerService15_2) context.getBean("customerService15_2");
		System.out.println(cust15_2);
		CustomerService15_3 cust15_3 = (CustomerService15_3) context.getBean("customerService15_3");
		System.out.println(cust15_3);
		// context2.close();
		System.out.println("----------------------lesson16---------------------------");
		Customer16 obj16 = (Customer16) context.getBean("customerBean16");
		System.out.println(obj16);
		Customer16_2 obj16_2 = (Customer16_2) context.getBean("customerBean16_2");
		System.out.println(obj16_2);
		System.out.println("----------------------lesson17---------------------------");
		CustomerService17 cust17 = (CustomerService17) context.getBean("AAA");
		System.out.println(cust17);
		System.out.println("----------------------lesson18---------------------------");
		// "customerService18"类名第一个字母小写也可以和lesson17一样自己定义
		CustomerService18 cust18 = (CustomerService18) context.getBean("customerService18");
		System.out.println(cust18);
		System.out.println("----------------------lesson19---------------------------");
		Customer19_1 cust19_1 = (Customer19_1) context.getBean("Customer19_1");
		System.out.println(cust19_1);
		Customer19_2 cust19_2 = (Customer19_2) context.getBean("Customer19_2");
		System.out.println(cust19_2);
		Customer19_3 cust19_3 = (Customer19_3) context.getBean("Customer19_3");
		System.out.println(cust19_3);
		Customer19_4 cust19_4 = (Customer19_4) context.getBean("Customer19_4");
		System.out.println(cust19_4);
		Customer19_5 cust19_5 = (Customer19_5) context.getBean("Customer19_5");
		System.out.println(cust19_5);
		System.out.println("----------------------lesson20---------------------------");
		Customer20 cust20 = (Customer20) context.getBean("Customer20");
		System.out.println(cust20);
		// System.out.println("----------------------lesson21---------------------------");
		// CustomerService21 cust21 =
		// (CustomerService21)context.getBean("customerServiceProxy21_1");
		// System.out.println("*************************");
		// cust21.printName();
		// System.out.println("*************************");
		// cust21.printURL();
		// System.out.println("*************************");
		// try {
		// cust21.printThrowException();
		// } catch (Exception e) {
		//
		// }
		// System.out.println("-------------");
		// cust21 =
		// (CustomerService21)context.getBean("customerServiceProxy21_2");
		// System.out.println("*************************");
		// cust21.printName();
		// System.out.println("*************************");
		// cust21.printURL();
		// System.out.println("*************************");
		// try {
		// cust21.printThrowException();
		// } catch (Exception e) {
		//
		// }
		// System.out.println("----------------------lesson22---------------------------");
		// CustomerService22 cust22 = (CustomerService22) context
		// .getBean("customerServiceProxy22");
		//
		// System.out.println("*************************");
		// cust22.printName();
		// System.out.println("*************************");
		// cust22.printURL();
		// System.out.println("*************************");
		// try {
		// cust22.printThrowException();
		// } catch (Exception e) {
		// }
		// System.out.println("----------------------lesson23---------------------------");
		// MyCustomerService cust23 = (MyCustomerService) context
		// .getBean("MyCustomerService");
		// System.out.println("*************************");
		// cust23.printName();
		// System.out.println("*************************");
		// cust23.printURL();
		// System.out.println("*************************");
		// try {
		// cust23.printThrowException();
		// } catch (Exception e) {
		// }
		//
		System.out.println("----------------------lesson24---------------------------");
		CustomerBo24 customer24 = (CustomerBo24) context.getBean("customerBo24");
		customer24.addCustomer();
		customer24.addCustomerReturnValue();
		// try {
		// customer24.addCustomerThrowException();
		// } catch (Exception e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		customer24.addCustomerAround("yiibai");

		System.out.println("----------------------lesson25---------------------------");
		String XML_FILE_NAME = "customer25.xml";
		XMLConverter converter = (XMLConverter) context.getBean("XMLConverter");

		Customer25 customer25 = new Customer25();
		customer25.setName("yiibai");
		customer25.setAge(28);
		customer25.setFlag(true);
		customer25.setAddress("Haikou haidiandao");

		System.out.println("Convert Object to XML!");
		// from object to XML file
		try {
			converter.convertFromObjectToXML(customer25, XML_FILE_NAME);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Done \n");

		System.out.println("Convert XML back to Object!");
		// from XML to object
		Customer25 customer25_2;
		try {
			customer25_2 = (Customer25) converter.convertFromXMLToObject(XML_FILE_NAME);
			System.out.println(customer25_2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Done");

		System.out.println("----------------------lesson26---------------------------");
		CustomerDAO26 customerDAO26 = (CustomerDAO26) context.getBean("customerDAO26");
		Customer26 customer26 = new Customer26(1, "yiibai", 29);
		customerDAO26.insert(customer26);
		Customer26 customer26_2 = customerDAO26.findByCustomerId(1);
		System.out.println(customer26_2);
		
		Customer26 Customer26_3=new Customer26(3, "AAAAAA", 1);
		Customer26 Customer26_4=new Customer26(4, "bbbbbb", 2);
		Customer26 Customer26_5=new Customer26(5, "cccccc", 3);
		
		ArrayList<Customer26> list=new ArrayList<Customer26>();
		list.add(Customer26_3);
		list.add(Customer26_4);
		list.add(Customer26_5);
		customerDAO26.insertBatch(list);
		List<Customer26> list2= customerDAO26.findAll();
		
		for (Customer26 customer262 : list2) {
			System.out.println(customer262);
		}
		
		
		
		

	}
}
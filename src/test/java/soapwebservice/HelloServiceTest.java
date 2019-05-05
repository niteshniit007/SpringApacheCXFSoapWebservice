package soapwebservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration({"classpath:cxf-beans.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class HelloServiceTest {

	@Autowired
	HelloServiceImpl helloService;
	
	@Test
	public void testsayHello() {
		//HelloService helloService = new HelloServiceImpl();	
		System.out.println(helloService.sayHello());
		
		//fail("Not yet implemented");
	}

}

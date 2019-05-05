package soapwebservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(endpointInterface="soapwebservice.HelloService", serviceName="HelloServiceImplService")
public interface HelloService {
	
	@WebMethod
	String sayHello();
}

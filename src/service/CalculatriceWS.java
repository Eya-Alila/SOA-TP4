package service;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(name="CalculatriceWS")
public class CalculatriceWS {
	
	@WebMethod(operationName="Somme")
	public double somme(@WebParam(name = "a") double a ,@WebParam(name = "b")double b)
	{
		return a+b;
	}
}


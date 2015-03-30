package bean;

import javax.faces.bean.RequestScoped;
import javax.faces.bean.ManagedBean;

@RequestScoped
@ManagedBean
public class RequestNumberBean {

	private int number = 1;
	
	public int getNumber()
	{
		return number;
	}
	
	public void increase()
	{
		number++;
	}
}

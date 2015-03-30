package bean;

import javax.faces.bean.SessionScoped;
import javax.faces.bean.ManagedBean;

@SessionScoped
@ManagedBean
public class SessionNumberBean {

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

package bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;


@ApplicationScoped
@ManagedBean
public class ApplicationNotebookListBean{
	private List<Notebook> notebooks = new ArrayList<Notebook>();
	private int id = 1;
	private String ok = "OK";
	
	public void increment()
	{
		id ++;
	}
	
	public String getOk()
	{
		return ok;
	}
	public int getId()
	{
		return id;
	}

	//@Override
	public List<Notebook> getAllNotebooks() {
		// TODO Auto-generated method stub
		List<Notebook> returnval;
		returnval = notebooks;
		return returnval;
	}

	//@Override
	public Notebook getNotebook(String id) {
		Notebook returnval;
		for(Notebook notebook: notebooks)
		{
			if(notebook.getId()==id)
			{
				returnval= notebook;
				return returnval;
			}
		}
		return null;
	}

	//@Override
	public String createNotebook(String title, String primaryUrl)
			throws NotebookAlreadyExistsException, BadAddressException {
		// TODO Auto-generated method stub
		for(Notebook notebook:notebooks)
		{
			if(notebook.getTitle().equals(title))
			{
				throw new NotebookAlreadyExistsException();
			}
		}
		String notebookID = String.valueOf(this.getId());
		this.increment();
		Notebook newNotebook = new Notebook();
		newNotebook.setPrimaryNotebookUrl(primaryUrl);
		newNotebook.setTitle(title);
		newNotebook.setId(notebookID);
		
		StringBuilder returnval = new StringBuilder();
		returnval.append("<notebook>");
		returnval.append("<id>");
		returnval.append(notebookID);
		returnval.append("</id>");
		returnval.append("<title>");
		returnval.append(title);
		returnval.append("</title>");
		returnval.append("</notebook>");
		
		return returnval.toString();
		
		
		
	}

	//@Override
	public void deleteNotebook(String id) throws NotebookNotFoundException {
		// TODO Auto-generated method stub
		for(Notebook notebook : notebooks)
		{
			if(notebook.getId()==id)
			{
				notebooks.remove(notebook);
				return;
			}
		}
		throw new NotebookNotFoundException();
	}
}

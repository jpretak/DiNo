package bean;

public class NotebookAlreadyExistsException extends DiNoException {

	private static final long serialVersionUID = -6720196629031561563L;

	public NotebookAlreadyExistsException() {
	}

	public NotebookAlreadyExistsException(String arg0) {
		super(arg0);
	}

	public NotebookAlreadyExistsException(Throwable arg0) {
		super(arg0);
	}

	public NotebookAlreadyExistsException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

}

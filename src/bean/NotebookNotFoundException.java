package bean;

public class NotebookNotFoundException extends DiNoException {

	private static final long serialVersionUID = 6636689138638060759L;

	public NotebookNotFoundException() {
	}

	public NotebookNotFoundException(String arg0) {
		super(arg0);
	}

	public NotebookNotFoundException(Throwable arg0) {
		super(arg0);
	}

	public NotebookNotFoundException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

}

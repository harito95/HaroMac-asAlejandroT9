package exception;

public class ElementNotAllowedException extends NullPointerException{

	public ElementNotAllowedException(String msg) {
		super("Excepcion " + msg);
	}
}

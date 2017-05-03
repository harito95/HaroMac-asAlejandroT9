package exception;

public class ListSizeOverflownException extends RuntimeException{

	public ListSizeOverflownException(String msg) {
		super("Excepcion " + msg);
	}
}

package bancoException;

public class BancoException extends RuntimeException{

	private static final long serialVersionUID = 1l;
	
	public BancoException(String msg) {
		super(msg);
	}
}

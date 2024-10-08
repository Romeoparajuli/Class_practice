package exception;

public class NewException  extends Exception{
	NewException(String message){
		super(message);
		
	}
	protected NewException(){
		super("fucking error ");
	}
	

}

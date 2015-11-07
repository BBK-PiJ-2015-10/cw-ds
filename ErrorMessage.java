/**
 * This is a class ErrorMessage to be used in this assignment # 2.
 *
 * @author YAP
 */
public class ErrorMessage {
	
	/**
	 * This is an element of ErrorMessage that contains the error message in a string
	 */	
	private String message;
	
	/**
	 * This is the constructor of ErrorMesage.
	 */
	public ErrorMessage (String message){
		this.message = message;
	}
	
	/**
	 *This is a getter method to be able to return the error message.
	 *@return the error message in a String.
	 */	
	public String displayErrormessage() {
		return this.message;
	}

	/**
	 *This is a setter method to be able to set and/or change the error message.
	 */
	public void setErrormessage(String message){
		this.message = message;
	}	
		
}
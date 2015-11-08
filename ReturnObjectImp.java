/**
*  ReturnObjectImp is the implementation of interface ReturnObject.
*  @author YAP
*/

public class ReturnObjectImp implements ReturnObject {
	
	/**
	 * This is an element type Object that is wrapped inside the ReturnObject class.
	 */	
	private Object output;
	
	/**
	 * This is an element type ErrorMessage that is wrapped inside the ReturnObject class.
	 */	
	private ErrorMessage message;
	
	/**
	 * This is an element type Object that is being used to read an input and be able to be
	 * leveraged across all the methods of the ReturnObjectImp class.
	 */
	private Object reader;
	
	/**
	 * This is a getter method to be able to see the object wrapped in the ReturnObjectImp class.
	 *@return the object wrapped in the class.
	 */	
	public Object getoutput(){
		return this.output;
	}
	
	public ReturnObjectImp(Object input){
		reader = input;
		this.output = getReturnValue();
		//this.message = null;
		this.message = getError();
	}
	
	/**
	 * This is the implementation of the getReturnValue() method listed in the Interface ReturnObject.
	 *@returns a null Object if the Object being input is empty, otherwise it returns the Object being input.
	 */
	public Object getReturnValue() {
		if (!hasError()) {
			return reader;
		}
		else {
			return null;
		}
	}
	
	/**
	 * This is the implementation of the hasError() method listed in the Interface ReturnObject.
	 *@returns true if the the value in the element reader is null or false otherwise.
	 */	
	public boolean hasError() {
	     if (reader == null) {
			 return true;
		 }
         else {
			 return false;
		 }		 
	}
	
	/**
	 * This is the implementation of the getError() method listed in the Interface ReturnObject.
	 *@return type ErrorMessage an error message "No Error" if the method hasError is false, if hasError is true
	 *then it returns "The list is empty"
	 */
	public ErrorMessage getError(){
		//if (!hasError() ){
			//ErrorMessage out = new ErrorMessage ("NO_ERROR");
			//this.message = out;
		//}
		//return this.message;
		if (!hasError() ){
			ErrorMessage output = new ErrorMessage ("NO_ERROR");
			return output; 
		}	
		else {	
			ErrorMessage output = new ErrorMessage ("The value is empty");
			return output; 
		}	
	}
	
    public void manualsetErrormessage (String newmessage){
		this.message.setErrormessage(newmessage);
	}
	
	public void manualsetoutput (){
		this.output = null;
	}
	
	

}


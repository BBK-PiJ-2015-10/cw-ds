/**
*  ReturnObjectImpl is the implementation of interface ReturnObject.
*  @author YAP
*/

public class ReturnObjectImpl implements ReturnObject {
	
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
	 * This is a getter method to be able to see the object wrapped in the ReturnObjectImpl class.
	 *@return the object wrapped in the class.
	 */	
	public Object getoutput(){
		return this.output;
	}
	
	/**
	 * This is the constructor of ReturnObjectImpl class. If the Object wrapped is not empty then
	 * the error in ReturnObjectImpl is No Error, otherwise, the error is the value is empty.
	 */
	public ReturnObjectImpl(Object input){
		reader = input;
		this.output = getReturnValue();
		if (!hasError() ){
			ErrorMessage output = new ErrorMessage ("NO_ERROR");
			this.message = output; 
		}
		else {
			ErrorMessage output = new ErrorMessage ("The value is empty");
			this.message = output;
		}	
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
	 */
	public ErrorMessage getError(){
		return this.message;
	}
	
    
	/**
	 * This is a method to manually change the error message on this ReturnObjectImpl class.
	 */
	public void manualsetErrormessage (String newmessage){
		this.message.setErrormessage(newmessage);
	}
	
	/**
	 * This is a method to manually set up the output element to null.
	 */
	public void manualsetoutput (){
		this.output = null;
	}
	
}


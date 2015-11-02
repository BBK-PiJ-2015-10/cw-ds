/**
*  Implementation of interface ReturnObject.
*/

public class ReturnObjectImp implements ReturnObject {
	
	private Object output;
	
	private ErrorMessage message;
	
	private Object reader;
	
	public ReturnObjectImp(Object input){
		reader = input;
		this.output = getReturnValue();
		this.message = getError();
	}
	
	
	public Object getReturnValue() {
		if (!hasError()) {
			return reader;
		}
		else {
			return null;
		}
	}
	
	
	public boolean hasError() {
	     if (reader == null) {
			 return true;
		 }
         else {
			 return false;
		 }		 
	}
	
	public ErrorMessage getError(){
		if (!hasError() ){
			ErrorMessage output = new ErrorMessage ("NO_ERROR");
			return output; 
		}	
		else {	
			ErrorMessage output = new ErrorMessage ("The list is empty");
			return output; 
		}	
	}
		
}


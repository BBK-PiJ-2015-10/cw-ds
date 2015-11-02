/**
*  Implementation of interface ReturnObject.
*/

public class ReturnObjectImp2 implements ReturnObject {
	
	private Object head;
	
	private ErrorMessage message;
	
	public ReturnObjectImp2(Object input){
		this.head = input;
		this.message = null;
		
		//this.head = getReturnValue();
		//this.message = getError();
	}
	
	
	public Object getReturnValue() {
		if (!hasError()) {
			return head;
		}
		else {
			return null;
		}
	}
	
	
	public boolean hasError() {
	     if (head == null) {
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
	
	//public static void main ( String [] args) {
		 
		//ReturnObject script2 = new ReturnObjectImp();
		//if (!script2.hasError()) {
			//script2.getReturnValue();
		//}
		//else {
			//script2.getError();
		//}
	//}

		
}


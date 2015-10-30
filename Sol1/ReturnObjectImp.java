/**
*  Implementation of interface ReturnObjectImp using an array as support.
*/

public class ReturnObjectImp implements ReturnObject {
	
	private Object head;
	
	public void insert (Object p) {
		if (head == null) {
			head = p;
		}
		else {
			head.add(p);
		}
	}
	
	public Object getReturnValue() {
		if (!hasError()) {
			Object result = new Object(head.getvalue()*2);
			return result;
		}
		else {
			return null;
		}
	}
	
	public boolean hasError() {
	     if (head.getvalue() >=0 &&  head.getvalue() <=100 ) {
			 return false;
		 }
         else {
			 return true;
		 }		 
	}
	
	public ErrorMessage getError(){
		if (!hasError() ){
			ErrorMessage output = new ErrorMessage ("NO_ERROR");
			return output; 
		}	
		else {	
			if (head.getvalue() < 0) {
				ErrorMessage output = new ErrorMessage ("Value of current selection doesn't meet lower limit of 0");
				return output; 
			}
			else {
				ErrorMessage output = new ErrorMessage ("Value of current selection exceeds upper limit of 100");
				return output; 
			}
		}	
	}
	
	public void alltogether() {
		
		if (head != null) {
			System.out.println();
			System.out.println(" For the current value of " +head.getvalue() +" the result of wrapper is :");
			System.out.println(" Error indicator is equal to: " +hasError());
			System.out.println(" Error message is: " +getError().displaymessage());
			
			if (getReturnValue() == null) {
				System.out.println(" No operation result since input is invalid");
			}
			else {		
				System.out.println(" Result of the operation is: " +getReturnValue().getvalue());
			}
			System.out.println("-------------------------------------------------------------------------");
			head = head.getnextobject();
		}
		else {
			System.out.println(" The list is empty, good bye or enter more values. ");
			System.out.println(" I hope you liked my wrapper ");
		}
		
		
	}
	
	
	
}
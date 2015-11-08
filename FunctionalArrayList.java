/**
 * This is the extension of ArrayList and implementation of FunctionalList using Arrays. 
 */
public class FunctionalArrayList extends ArrayList implements FunctionalList {
	 
	 /**
     * This is the constructor method for FunctionalArrayList. It calls
	 * the constructor of ArrayList.
     */
	 public FunctionalArrayList (){
		 super();
	 }
	 
	 /**
     * This is the implementation of the head() method defined on FunctionalList.
	 * It leverages the get() method from List to return firt item
     * on the list. It has a couple of grayed out println that helped on development.
	 */
	 public ReturnObject head(){
		 ReturnObject result = new ReturnObjectImpl (getObjectArray()[0]);
		 if (!result.hasError()) {	
			 //System.out.println (result.getReturnValue().getstudent());
		 }
		 else {
			  //System.out.println (result.getError().displayErrormessage());
		 } 
		 return result;
	 }
	
	 /**
     * This is the implementation of the rest() method defined on FunctionalList.
	 * It leverages a for loop statement and the get() method from 
	 * List to return the items from the list, from position 1 and forward.
	 */
	public FunctionalList rest(){
		   FunctionalArrayList result = new FunctionalArrayList();
		   for (int i = 1; i < size(); i++) {
			   result.add(getObjectArray()[i]);
		   } 
		 return result;
	 }
	  
	 
} 
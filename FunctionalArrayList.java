/**
 * This is the extension of ArrayList and implementation of FunctionalList using Arrays. 
 *@author YAP
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
     * on the list. 
	 */
	 public ReturnObject head(){
		 if (isEmpty()) {
			ReturnObjectImpl result = new ReturnObjectImpl(null);
			result.manualsetErrormessage("The list is empty");
			return result;
		 }
		 ReturnObject result = new ReturnObjectImpl (getObjectArray()[0]);
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
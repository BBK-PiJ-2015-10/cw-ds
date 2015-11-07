/**
 * This is the extension of LinkedList and implementation of FunctionalList using Linked lists. 
 */
public class FunctionalLinkedList extends LinkedList implements FunctionalList {
	 
	 /**
     * This is the constructor method for FunctionalArrayList. It calls
	 * the constructor of ArrayList.
     */
	 public FunctionalLinkedList (){
		 super();
	 }
	 
	 /**
     * This is the implementation of the head() method defined on FunctionalList.
	 * It leverages the get() method from List to return firt item
     * on the list.
	 */
	 public ReturnObject head(){
		 ReturnObject result = get(0);
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
		 FunctionalLinkedList result = new FunctionalLinkedList();
		 result.setdimension(size()-1); 		
		 result.add(get(1).getReturnValue());
		 return result;
	 }
	  
	 
}
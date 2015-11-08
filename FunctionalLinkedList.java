/**
 * This is the extension of LinkedList and implementation of FunctionalList using Linked lists. 
 *@author YAP.
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
	 * It leverages the get() method from List to return first item
     * on the list.
	 */
	 public ReturnObject head(){
		 if (isEmpty()) {
			ReturnObjectImpl result = new ReturnObjectImpl(null);
			result.manualsetErrormessage("The list is empty");
			return result;
		 }
		 ReturnObject result = get(0);
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
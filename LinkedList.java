/**
 * Implementation of interface list using a linkedlist as a support. 
 */
 public class LinkedList implements List {
	
	/**
     * This is to set the head of the list.
     */	
	private Object lead;
	
	/**
     * The number of Objects currently in the array
     */
	private int dimension;
	
	/**
     * This a setter method to specify the # of objects in the array.
	 * It is useful when an array is set as a copy of another array instead of being
	 * build by the methods specify in this class.
     */
	public void setdimension (int k){
		this.dimension = k;
	}
	 
	/**
	 * This an implementation of add. Read interface for more details on returns.
	 * It leverages if statement for error setting messages. It also leverages for
	 * loops in order to add the Object being given in its proper position. 
	 * It uses a dimension counter to keep track of the elements in the list.
	 * Furthermore, it uses isAlmostFull() method to decide if the array needs to be
	 * made bigger thru the triggering of the reserveMoreMemory method.
	 * It also has a couple of println statements that have been grayed out, but were
	 * useful for development aid.
	 */
	public ReturnObject add(Object item){
		ReturnObjectImp result = new ReturnObjectImp (item);
		if (!result.hasError()) {
			if (lead == null) {
				lead = item;
			}
			else {
				lead.insert(item);
			}
			dimension++;	
			//System.out.println (result.getReturnValue().getstudent());
		}
		else {
			result.manualsetErrormessage("The input provided was empty");
			//System.out.println (result.getError().displayErrormessage());
		} 
		result.manualsetoutput();
		return result;
	}
	
	/**
     * This the implementation of the size() method from the interface.
	 * It leverages the dimension counter to display the # of elements currrently in the array.
     */
	public int size(){
		return dimension;
	}
	
	
	
	
	/**
     * This the implementation of the isEmpty() method from the interface.
	 * It leverages the dimension counter to figure out if the array is empty or not.
     */
	public boolean isEmpty() {
		if (dimension == 0) {
		    return true;
		}	
		else {
		    return false;	
		}				
	}
	
	/**
     * This the implementation of the get method from the interface.
	 * It leverages an if statement to figure out if the input provided is correct.
	 * It uses a for loop to be able able to find the object in the list.
     * It also has a couple of if and println statements that have been grayed out, but were
	 * useful for development aid.
	 */
	public ReturnObject get(int index){
		    Object temp = lead;
		for (int i = 0; i < index ; i++) {
			temp = temp.getnextObject();
			}
		ReturnObjectImp result = new ReturnObjectImp (temp);
		if (index > dimension-1 || index < 0 ) {
			result.manualsetErrormessage("The index selected is out of range");
			//System.out.println ("The index selected is out of range");
		}
		else {
			if (!result.hasError()) {	
				//System.out.println (result.getReturnValue().getstudent());
			}
			else {
				//System.out.println (result.getError().displayErrormessage());
			} 
		}
		return result;
	}
	
	/**
     * This the implementation of the remove method from the interface.
	 * It leverages an if statement to figure out if the input provided is correct.
     * It uses a for loop in order to reset the list order once this element is removed. 
	 * It also has a couple of else and println statements that have been grayed out, but were
	 * useful for development aid.
	 */
	public ReturnObject remove(int index){
		    Object temp = lead;
		for (int i = 0; i < index ; i++) {
			temp = temp.getnextObject();
			}
		ReturnObjectImp result = new ReturnObjectImp (temp);
		if (index > dimension-1 || index < 0 ) {
			result.manualsetErrormessage("The index selected is out of range");
			//System.out.println ("The index selected is out of range");
		}
		else {
			if (!result.hasError()) {	
				//System.out.println (result.getReturnValue().getstudent());
					if (lead == temp) {
						lead = temp.getnextObject();
					}
					else {
						lead.delete(temp);
					}
				dimension--;	
			}
			else {
				//System.out.println (result.getError().displayErrormessage());
			} 
		}
		return result;
	}
	
	/**
	 * This an implementation of add. Read interface for more details on returns.
	 * It leverages if statement for error setting messages. It also leverages for
	 * loops in order to add the Object being given in its proper position. 
	 * It uses a dimension counter to keep track of the elements in the list.
	 * It also has a couple of println statements that have been grayed out, but were
	 * useful for development aid.
	 */
	public ReturnObject add(int index, Object item){
			Object temp = lead;
		for (int i = 0; i < index ; i++) {
			temp = temp.getnextObject();
			}
		ReturnObjectImp result = new ReturnObjectImp (item);
		if (index > dimension-1 || index < 0 ) {
			result.manualsetErrormessage("The index selected is out of range");
			//System.out.println ("The index selected is out of range");
		}
		else {
			if (!result.hasError()) {	
				//System.out.println (result.getReturnValue().getstudent());
					if (lead == temp) {
						lead = item;
						lead.setnextObject(temp);
					}
					else {	
						lead.inject(temp, item);
					}
			    dimension++;		
			}
			else {
				//System.out.println (result.getError().displayErrormessage());
			} 
		}
		result.manualsetoutput();
		return result;
	} 
	 	 
	 
	 
 }
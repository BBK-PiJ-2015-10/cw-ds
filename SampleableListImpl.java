/**
 * This is a class that implements SampleableList. 
 * It will use an array as an underlying data structure for the implementation
 * of interface List.
 *
 * @author YAP.
 */
public class SampleableListImpl implements SampleableList {

	/**
     * This is an array of Objects. When full, a bigger one is created.
     */
	private Object[] ObjectArray;
	
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
     * This a getter method to display the ObjectArray inside the ArrayList class.
	 *@return the ObjectArray inside the ArrayList class.
     */
	public Object[] getObjectArray() {
		return this.ObjectArray;
	}
	
	/**
     * This a getter method to display the ObjectArray inside the ArrayList class.
     */
	public void setObjectArray(Object [] input){
		this.ObjectArray = input;
	}
	
	/**
     * The initial size of the array.
     * (Note: not to be confused with the number of positions in the array , which starts at 0)
     */
	private static int INITIAL_ARRAY_SIZE = 5;
	
	/**
     * This keep track of the size of the ObjectArray size at any given point in time. It is
     * initialize at 5,  but it changes every time the reserveMoreMemory method is executed.
     */
	private int CURRENT_ARRAY_SIZE = 5;
	
    /**
     * This is the constructor method of this SampleableListImpl class.
     */
	public SampleableListImpl(){
		ObjectArray = new Object[INITIAL_ARRAY_SIZE];
		dimension = 0;		
	}
		
	/**
	 * This an implementation of add. Read interface for more details on returns.
	 * It leverages if statement for error setting messages. It also leverages for
	 * loops in order to add the Object being given in its proper position. 
	 * It uses a dimension counter to keep track of the elements in the list.
	 * Furthermore, it uses isAlmostFull() method to decide if the array needs to be
	 * made bigger thru the triggering of the reserveMoreMemory method.
	 *
	 */
	public ReturnObject add(Object item){
		ReturnObjectImpl result = new ReturnObjectImpl (item);
		if (!result.hasError()) {
			if (isAlmostFull()) {
				reserveMoreMemory();			
			}
			ObjectArray [dimension] = item;
			dimension++;	
		}
		else {
			result.manualsetErrormessage("The input provided was empty");
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
	 */
	public ReturnObject get(int index){
		if (index > dimension-1 || index < 0 ) {
			ReturnObjectImpl result = new ReturnObjectImpl(null);
			result.manualsetErrormessage("The index selected is out of range");
			return result;
		}
		else {
			ReturnObjectImpl result = new ReturnObjectImpl (ObjectArray[index]);
			return result;	
		}
	}
	
	/**
     * This is a method to figure out if ObjectArray needs to be increase due to 
	 * being full or not at the moment.
     */
	private boolean isAlmostFull () {
		if (ObjectArray.length - dimension < 2) {
			return true;
		}
		else {
		    return false;	
		}
	}
	
	/**
     * This is a method use to increase the size of the array. It duplicates the Array size 
	 * everytime it runs.
     */
	private void reserveMoreMemory () {	
		Object[] biggerObjectArray = new Object[INITIAL_ARRAY_SIZE*2];
		for (int i = 0; i < dimension ; i++) {
			biggerObjectArray[i] = this.ObjectArray[i];
		}
		this.ObjectArray = biggerObjectArray;
		CURRENT_ARRAY_SIZE = CURRENT_ARRAY_SIZE*2;
	}
	
	/**
     * This the implementation of the remove method from the interface.
	 * It leverages an if statement to figure out if the input provided is correct.
     * It uses a for loop in order to reset the array order once this element is removed. 
	 */
	public ReturnObject remove(int index){	
		if (index > dimension-1 || index < 0 ) {
			ReturnObjectImpl result = new ReturnObjectImpl(null);
			result.manualsetErrormessage("The index selected is out of range");
			return result;
		}
		else {
			ReturnObjectImpl result = new ReturnObjectImpl (ObjectArray[index]);
			if (!result.hasError()) {	
				for (int i = index; i < dimension ; i++) {
					this.ObjectArray[i] = this.ObjectArray[i+1];
				}
				dimension--;
			}
			return result;	
		}
	}
		
	/**
	 * This an implementation of add. Read interface for more details on returns.
	 * It leverages if statement for error setting messages. It also leverages for
	 * loops in order to add the Object being given in its proper position. 
	 * It uses a dimension counter to keep track of the elements in the list.
	 * Furthermore, it uses isAlmostFull() method to decide if the array needs to be
	 * made bigger thru the triggering of the reserveMoreMemory method.
	 */
	public ReturnObject add(int index, Object item) {
		ReturnObjectImpl result = new ReturnObjectImpl (item);
		if (index > dimension-1 || index < 0 ) {
			result.manualsetErrormessage("The index selected is out of range");
		}
		else {
			if (!result.hasError()) {				    					
				dimension++;
				if (isAlmostFull()) {
					reserveMoreMemory();			
				}
				Object[] copyObjectArray = new Object[CURRENT_ARRAY_SIZE];
				for (int i=0; i<index+1; i++) {	
					copyObjectArray[i] = this.ObjectArray[i];
				}
				for (int i=index+1; i<dimension; i++) {	
					copyObjectArray[i] = this.ObjectArray[i-1];
					copyObjectArray[index] = item;
				}	            	
			this.ObjectArray = copyObjectArray;
			}
			else {
				result.manualsetErrormessage("The input provided was empty");
			}
		}		
		result.manualsetoutput();
		return result;
	}

	/**
     * This is the implemenation of the sample() method defined on SampleableList interface.
	 * It leverages a while looping statements to copy the object from the current list that
	 * are in even positions (0,2,4,6, etc), basically the first, trid, fifth, and so on 
	 * elements. It then returns this sample list as a resul.
     */
	public SampleableList sample(){
		SampleableListImpl result = new SampleableListImpl();
		Object[] copyObjectArray = new Object[CURRENT_ARRAY_SIZE];
        int countera = 0;
		int counterb = 0;
		while (counterb < size()){
			copyObjectArray[countera] = this.ObjectArray[counterb];
			countera= countera+1;
			counterb= counterb+2;
		}	
		result.setObjectArray(copyObjectArray);
		result.setdimension (countera);
		return result;
	}
	
}
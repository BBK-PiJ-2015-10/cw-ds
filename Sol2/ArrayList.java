/**
 * Implementation of interface list using an array as support. 
 */
 
 public class ArrayList implements List {
 
	/**
     * The array that contains the Objects. When full, a new one
     * is created.
     */
 
	private Object[] ObjectArray;
	
	/**
     * The number of objects in the array
     */
	private int dimension;
	
	/**
     * The initial size of the array.
     * (Note: not to be confused with the number of positions in the array , which starts at 0)
     */
	
	private static int INITIAL_ARRAY_SIZE = 5;
	
    public ArrayList(){
		ObjectArray = new Object[INITIAL_ARRAY_SIZE];
		dimension = 0;		
	}
		
	
	public ReturnObject add(Object item){
		ReturnObject result = new ReturnObjectImp (item);
		if (!result.hasError()) {
			if (isAlmostFull()) {
				reserveMoreMemory();			
			}
			ObjectArray [dimension] = item;
			dimension++;	
			System.out.println (result.getReturnValue().getstudent());
		}
		else {
			System.out.println (result.getError().displayErrormessage());
		} 
		return result;
	}
	
	
	public int size(){
		return dimension;
	}
	
	public boolean isEmpty() {
		if (dimension == 0) {
		    return true;
		}	
		else {
		    return false;	
		}				
	}
	
	public ReturnObject get(int index){
		ReturnObject result = new ReturnObjectImp (ObjectArray[index]);
		if (index > dimension-1 || index < 0 ) {
			System.out.println ("The index selected is out of range");
		}
		else {
			if (!result.hasError()) {	
				System.out.println (result.getReturnValue().getstudent());
			}
			else {
				System.out.println (result.getError().displayErrormessage());
			} 
		}
		return result;
	}
	
	private boolean isAlmostFull () {
		if (ObjectArray.length - dimension < 1) {
			return true;
		}
		else {
		    return false;	
		}
	}
	
	private void reserveMoreMemory () {	
		Object[] biggerObjectArray = new Object[INITIAL_ARRAY_SIZE*2];
		for (int i = 0; i < dimension ; i++) {
			biggerObjectArray[i] = this.ObjectArray[i];
		}
		this.ObjectArray = biggerObjectArray;
	}
	
	
	public ReturnObject remove(int index){	
		ReturnObject result = new ReturnObjectImp (ObjectArray[index]);
		if (index > dimension-1 || index < 0 ) {
			System.out.println ("The index selected is out of range");
		}
		else {
			if (!result.hasError()) {	
				System.out.println (result.getReturnValue().getstudent());
				for (int i = index; i < dimension ; i++) {
					this.ObjectArray[i] = this.ObjectArray[i+1];
				}
			}
			else {
				System.out.println (result.getError().displayErrormessage());
			} 
		}
		return result;
	}
		
	
	public ReturnObject add(int index, Object item) {
		ReturnObject result = new ReturnObjectImp (item);
		if (index > dimension-1 || index < 0 ) {
			System.out.println ("The index selected is out of range");
		}
		else {
			if (!result.hasError()) {				
				for (int i = index+1; i <= dimension ; i++) {
						this.ObjectArray[i] = this.ObjectArray[i-1];
					}
			this.ObjectArray[index] = item;
			dimension++;	
			System.out.println (result.getReturnValue().getstudent());
			}
			else {
				System.out.println (result.getError().displayErrormessage());
			}
		}		
		return result;
	}
	
 
 
 }
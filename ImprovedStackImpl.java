/**
 * This is the implementation of ImprovedStack. 
 *
 *@author YAP.
 */
public class ImprovedStackImpl implements ImprovedStack {

	/**
     * This is the constructor method. It creates a new empty list for the
     * protected internalList field.	 
     */
	public ImprovedStackImpl() {
	  List kickoff = new ArrayList();
	  this.internalList = kickoff;
    }
		
	/**
     * This is the element that contains the List of values in the stack.	 
     */
	protected List internalList;
	
	/**
     * This is the implementation of the isEmpty() method declared on Stack. 
     * It leverages the isEmpty() method from the List data structure.	 
     */
	public boolean isEmpty(){
		//System.out.println(this.internalList.isEmpty());
		return this.internalList.isEmpty();
	}

	/**
     * This is the implementation of the size() method declared on Stack. 
     * It leverages the size() method from the List data structure.	 
     */
	public int size(){
		//System.out.println(this.internalList.size());
		return this.internalList.size();
	}

	/**
     * This is the implementation of the push() method declared on Stack. 
     * It leverages the add() method from the List data structure and uses. 	 
     * position 0.
	 */
	public void push(Object item){
		if (this.internalList.isEmpty()){
			List temp = new ArrayList();
			temp.add(item);
			this.internalList = temp;
		}
		else {
			this.internalList.add(0,item);
		}
	}

	/**
     * This is the implementation of the top() method declared on Stack. 
     * It leverages the get() method from the List data structure and uses. 	 
     * position 0.
	 */
	public ReturnObject top(){
		return this.internalList.get(0);
	}

	/**
     * This is the implementation of the pop() method declared on Stack. 
     * It leverages the remove() method from the List data structure and uses. 	 
     * position 0.
	 */
	public ReturnObject pop(){
		return this.internalList.remove(0);
	}
	
	/**
     * This is the implementation of the reverse() method declared on ImprovedStack. 
     * It leverages the get() method from the List data structure and also the push() 	 
     * method defined above.
	 */
	public ImprovedStack reverse(){
		ImprovedStackImpl result = new ImprovedStackImpl();
		for (int i = 0; i < this.internalList.size(); i++){
			result.push(this.internalList.get(i).getReturnValue());
		}
		return result;
	}
	
	/**
     * This is the implementation of the remove() method declared on ImprovedStack. 
     * It leverages the get() method from the List data structure and also the remove() 	 
     * method defined above.
	 */
	public void remove(Object object){
		for (int i = 0; i < this.internalList.size(); i++){
			if (this.internalList.get(i).getReturnValue() == object){
				this.internalList.remove(i);
			}
		}
		//for (int i = 0; i < this.internalList.size(); i++){
		    //this.internalList.get(i).getReturnValue().getstudent(); 	
		//}	
	}
	
}
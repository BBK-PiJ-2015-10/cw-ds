/**
 * This is a class that extends AbstractStack. It implements the methods from 
 * interface Stack that were not fully specified in AbstractStack.
 * Since, AbstrackStack is using a data structure List as an underlying data
 * structure. StackImpl class is also leveraging the methods declared on @List.
 *
 * @author YAP.
 */
public class StackImpl extends AbstractStack {

	/**
     * This is a constructor that calls its parent or super class. 
     */
    public StackImpl(List list){
		super(list);
	}
		
	/**
     * This is the implementation of the isEmpty() method declared on Stack. 
     * It leverages the isEmpty() method from the List data structure.	 
     */
	public boolean isEmpty(){
		System.out.println(this.internalList.isEmpty());
		return this.internalList.isEmpty();
	}

	/**
     * This is the implementation of the size() method declared on Stack. 
     * It leverages the size() method from the List data structure.	 
     */
	public int size(){
		System.out.println(this.internalList.size());
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
		if (this.internalList.isEmpty()) {
			ReturnObjectImpl result = new ReturnObjectImpl(null);
			result.manualsetErrormessage("The stack is empty");
			return result;
		}
		else {
		return this.internalList.get(0);
		}
	}

	/**
     * This is the implementation of the pop() method declared on Stack. 
     * It leverages the remove() method from the List data structure and uses. 	 
     * position 0.
	 */
	public ReturnObject pop(){
		if (this.internalList.isEmpty()) {
			ReturnObjectImpl result = new ReturnObjectImpl(null);
			result.manualsetErrormessage("No more items on the stack");
			return result;
		}
		else {
		return this.internalList.remove(0);
		}
	}

}
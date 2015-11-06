public class StackImpl extends AbstractStack {

    public StackImpl(List list){
		super(list);
	}
		
	public boolean isEmpty(){
		System.out.println(this.internalList.isEmpty());
		return this.internalList.isEmpty();
	}

	public int size(){
		System.out.println(this.internalList.size());
		return this.internalList.size();
	}

	public void push(Object item){
		this.internalList.add(0,item);
	}

	public ReturnObject top(){
		return this.internalList.get(0);
	}

	
	public ReturnObject pop(){
		return this.internalList.remove(0);
	}


}
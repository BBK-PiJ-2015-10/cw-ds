public class ImprovedStackImpl implements ImprovedStack {

	public ImprovedStackImpl() {
	  List kickoff = new ArrayList();
	  this.internalList = kickoff;
    }
		
	protected List internalList;
	
	public boolean isEmpty(){
		System.out.println(this.internalList.isEmpty());
		return this.internalList.isEmpty();
	}

	public int size(){
		System.out.println(this.internalList.size());
		return this.internalList.size();
	}

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

	public ReturnObject top(){
		return this.internalList.get(0);
	}

	
	public ReturnObject pop(){
		return this.internalList.remove(0);
	}
	
	public ImprovedStack reverse(){
		ImprovedStackImpl result = new ImprovedStackImpl();
		for (int i = 0; i < this.internalList.size(); i++){
			result.push(this.internalList.get(i).getReturnValue());
		}
		return result;
	}
	
	
	

}
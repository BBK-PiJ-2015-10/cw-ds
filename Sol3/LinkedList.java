

 public class LinkedList implements List {
	 
	private Object lead;
	 
	private int dimension;
	 
	public ReturnObject add(Object item){
		ReturnObject result = new ReturnObjectImp (item);
		if (!result.hasError()) {
			if (lead == null) {
				lead = item;
			}
			else {
				lead.insert(item);
			}
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
		    Object temp = lead;
		for (int i = 0; i < index ; i++) {
			temp = temp.getnextObject();
			}
		ReturnObject result = new ReturnObjectImp (temp);
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
	

	public ReturnObject remove(int index){
		    Object temp = lead;
		for (int i = 0; i < index ; i++) {
			temp = temp.getnextObject();
			}
		ReturnObject result = new ReturnObjectImp (temp);
		if (index > dimension-1 || index < 0 ) {
			System.out.println ("The index selected is out of range");
		}
		else {
			if (!result.hasError()) {	
				System.out.println (result.getReturnValue().getstudent());
					if (lead == temp) {
						lead = temp.getnextObject();
					}
					else {
						lead.delete(temp);
					}
			}
			else {
				System.out.println (result.getError().displayErrormessage());
			} 
		}
		return result;
	}
	
	 
 }
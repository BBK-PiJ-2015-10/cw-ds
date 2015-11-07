public class FunctionalLinkedList extends LinkedList implements FunctionalList {
	 
	 public FunctionalLinkedList (){
		 super();
	 }
	 
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
	 
	public FunctionalList rest(){
		 FunctionalLinkedList result = new FunctionalLinkedList();
		 result.setdimension(size()-1); 		
		 result.add(get(1).getReturnValue());
		 return result;
	 }
	  
	 
}
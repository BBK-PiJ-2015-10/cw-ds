public class FunctionalArrayList extends ArrayList implements FunctionalList {
	 
	 public FunctionalArrayList (){
		 super();
	 }
	 
	 public ReturnObject head(){
		 ReturnObject result = new ReturnObjectImp (getObjectArray()[0]);
		 if (!result.hasError()) {	
			 //System.out.println (result.getReturnValue().getstudent());
		 }
		 else {
			  //System.out.println (result.getError().displayErrormessage());
		 } 
		 return result;
	 }
	 
	public FunctionalList rest(){
		   FunctionalArrayList result = new FunctionalArrayList();
		   for (int i = 1; i < size(); i++) {
			   result.add(getObjectArray()[i]);
		   } 
		 return result;
	 }
	  
	 
} 
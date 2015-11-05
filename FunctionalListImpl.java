public class FunctionalListImpl extends ArrayList implements FunctionalList {
	 
	 public FunctionalListImpl (){
		 super();
	 }
	 
	 public ReturnObject head(){
		 ReturnObject result = new ReturnObjectImp (getObjectArray()[0]);
		 if (!result.hasError()) {	
			 System.out.println (result.getReturnValue().getstudent());
		 }
		 else {
			  System.out.println (result.getError().displayErrormessage());
		 } 
		 return result;
	 }
	 
	public FunctionalList rest(){
		   FunctionalListImpl temp = new FunctionalListImpl();
		   for (int i = 1; i < size(); i++) {
			   temp.add(getObjectArray()[i]);
		   }
		   FunctionalList result = new FunctionalListImpl();
		   result = temp; 
		 return result;
	 }
	  
	 
} 
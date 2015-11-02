public class script {

       public static void main ( String [] args) {
		   
	   script first = new script(); 
	   first.launch();	
		   
	   }
	   
	   public void launch (){
		
       System.out.println("Testing");
       
	   Object S1 = new Object("Bob", 24);  
	   
	   Object S2 = new Object("Martin", 39);
	   
	   Object S3 = new Object("Sam", 45);
	   
	   Object S4 = new Object("Tom", 38);
	   
	   
	   
	   //System.out.println(S1.getstudent());
	   
	   //ReturnObject S2 = new ReturnObjectImp(S1);
	   
	   //System.out.println(S2.hasError());
	   
	   //System.out.println(S2.getReturnValue().getstudent());
	   
	   //System.out.println(S2.getError().displayErrormessage());
	   
	   List first = new ArrayList();
	   
	   first.add(S1);
	   first.add(S2);
	   first.add(S3);
	   first.get(0);
	   first.get(3);
	   first.remove(3);
	   first.add(0, S4);
	   
	   
	   //ReturnObject S2 = new ReturnObject(S1);
	   
	   //System.out.println(S2.getObject().getstudent());
	   
	   //System.out.println(S2.getErrorMessage().displaymessage());
		   
	   }
	   

}
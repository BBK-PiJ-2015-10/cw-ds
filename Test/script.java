public class script {

       public static void main ( String [] args) {
		   
	   script first = new script(); 
	   first.launch();	
		   
	   }
	   
	   public void launch (){
		
       System.out.println("Testing");
       
	   Object S1 = new Object("Bob", 24);  
	   
	   //System.out.println(S1.getstudent());
	   
	   ReturnObject S2 = new ReturnObjectImp(S1);
	   
	   System.out.println(S2.getReturnValue().getstudent());
	   
	   System.out.println(S2.getError().displaymessage());
	   
	   System.out.println(S2.hasError());
	   
	   //ReturnObject S2 = new ReturnObject(S1);
	   
	   //System.out.println(S2.getObject().getstudent());
	   
	   //System.out.println(S2.getErrorMessage().displaymessage());
		   
	   }
	   

}
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
	   Object S5 = new Object("Marco Polo", 37);
	   Object S6 = new Object("Leonel" , 39);
	   Object S7 = new Object("Ale Cane" , 39);
	   
	   //System.out.println(S1.getstudent());
	   //ReturnObject S2 = new ReturnObjectImp(S1);
	   //System.out.println(S2.hasError());
	   //System.out.println(S2.getReturnValue().getstudent());
	   //System.out.println(S2.getError().displayErrormessage());
	   
	   List first = new ArrayList();
	   
	   first.add(S1);
	   first.add(S2);
	   first.add(S3);
	   first.add(S4);
	   first.add(S5);
	   first.add(S6);
	   first.add(S7);
	   System.out.println("-------------------");
	   first.get(0);
	   first.get(1);
	   first.get(2);
	   first.get(3);
	   first.get(4);
	   first.get(5);
	   first.get(6);
	   System.out.println("-------------------");
	   first.remove(1);
	   first.add(0, S7);
	   System.out.println("-------------------");
	   first.get(0);
	   first.get(1);
	   first.get(2);
	   first.get(3);
	   first.get(4);
	   first.get(5);
	   first.get(6);
	   
	   
	   
	   
	   
	   
	   //first.add(S3);
	   //first.add(S4);
	   //first.get(0);
	   //first.remove(0);
	   //first.get(0);
	   //first.add(0, S4);
	   
	   //first.remove(3);
	   //first.add(0, S4);
	   
	   
	   //ReturnObject S2 = new ReturnObject(S1);
	   
	   //System.out.println(S2.getObject().getstudent());
	   
	   //System.out.println(S2.getErrorMessage().displaymessage());
		   
	   }
	   

}
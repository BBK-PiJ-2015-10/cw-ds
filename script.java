public class script {

       public static void main ( String [] args) {
		   
	   script first = new script(); 
	   first.launch();	
		   
	   }
	   
	   public void launch (){
		
       //System.out.println("Testing");
       
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
	   
	   //FunctionalListImpl first = new FunctionalListImpl (null);
	   
	   //first.add(S1);
	   //first.add(S2);
	   //first.add(S3);
	   //first.add(S4);
	   //first.add(S5);
	   //first.add(S6);
	   //first.add(S7);
	   System.out.println("-------------------");
	   //StackImpl second = new StackImpl (first);
	   ImprovedStackImpl second = new ImprovedStackImpl ();
	   //second.size();
	   //second.top();
	   second.push(S1);
	   second.push(S2);
	   second.push(S3);
	   second.push(S4);
	   second.push(S3);
	   second.push(S6); 
	   second.push(S7);
	   //System.out.println("Below is the result of the top");
	   //second.pop();
	   //System.out.println("Below is the result of the top");
	   //second.top();
	   System.out.println("This the result of remove");
	   second.remove(S3);
	   
	   //System.out.println("Below is the result of the reverse");
	   //second.reverse();
	   //second.size();
	   //second.top();
	   //second.isEmpty();
	   //second.pop();
	   //second.size();
	   //second.pop();
	   
	   //first.get(0);
	   //first.get(1);
	   //first.get(2);
	   //first.get(3);
	   //first.get(4);
	   //first.get(5);
	   //first.get(6);
	   //System.out.println("-------------------");
	   //first.remove(0);
	   //first.add(0, S7);
	   //System.out.println("-------------------");
	   //first.get(0);
	   //first.get(1);
	   //first.get(2);
	   //first.get(3);
	   //first.get(4);
	   //first.get(5);
	   //first.get(6);
	   //first.head();
	   
	   //System.out.println("-------------------");
	   //first.sample();
	   //first.head();
	     //first.rest();
	   
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
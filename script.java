public class script {

       public static void main ( String [] args) {
		   
	   script first = new script(); 
	   first.launch();	
		   
	   }
	   
	   public void launch (){
		
	   Object S1 = new Object("Bob", 24);  
	   Object S2 = new Object("Martin", 39);
	   Object S3 = new Object("Sam", 45);
	   Object S4 = new Object("Tom", 38);
	   Object S5 = new Object("Marco Polo", 37);
	   Object S6 = new Object("Leonel" , 39);
	   Object S7 = new Object("Ale Cane" , 39);
	   
	   System.out.println("---------------------------------------------------------------");
	   System.out.println("We are now testing ArrayList");
	   ArrayList fourth = new ArrayList ();
	   fourth.add(S1);
	   fourth.add(S2);
	   fourth.add(S3);
	   fourth.add(S4);
	   fourth.add(S5);
	   fourth.add(S6);
	   fourth.add(S7);
	   
	   System.out.println(fourth.get(2).getReturnValue().getstudent());
	   System.out.println(fourth.get(8).getError().displayErrormessage());
	   
	   System.out.println(fourth.get(0).getReturnValue().getstudent());
	   fourth.add(0,S4);
	   System.out.println(fourth.get(0).getReturnValue().getstudent());
	   System.out.println(fourth.add(10,S4).getError().displayErrormessage());
	   
	   fourth.remove(0);
	   System.out.println(fourth.get(1).getReturnValue().getstudent());
	   System.out.println(fourth.get(12).getError().displayErrormessage());
	   fourth.remove(3);
	   System.out.println(fourth.remove(12).getError().displayErrormessage());
	   

	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
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
	   //StackImpl second = new StackImpl (first);
	   
	   System.out.println("---------------------------------------------------");
	   System.out.println("We are now testing SampleableListImpl");
	   SampleableListImpl third = new SampleableListImpl ();
	   third.add(S1);
	   third.add(S2);
	   third.add(S3);
	   third.add(S4);
	   third.add(S5);
	   third.add(S6);
	   third.add(S7);
	   third.sample();
	   System.out.println(third.sample().get(0).getReturnValue().getstudent());
	   System.out.println(third.sample().get(1).getReturnValue().getstudent());
	   System.out.println(third.sample().get(2).getReturnValue().getstudent());
	   System.out.println(third.sample().get(3).getReturnValue().getstudent());
	   //System.out.println(third.sample().get(4).getReturnValue().getstudent());
	   System.out.println(third.get(4).getError().displayErrormessage());
	   System.out.println("--------------------------------------------------");
	   
	   System.out.println("---------------------------------------------------");
	   System.out.println("We are now testing ImprovedStackImpl");
	   ImprovedStackImpl second = new ImprovedStackImpl ();
	   second.push(S1);
	   second.push(S2);
	   second.push(S3);
	   second.push(S4);
	   second.push(S3);
	   second.push(S6); 
	   second.push(S7);
	   System.out.println("Below is the result of the top");
	   System.out.println(second.top().getReturnValue().getstudent());
	   System.out.println("We are now testing the remove feature, removing S7");
	   second.remove(S7);
	   System.out.println(second.top().getReturnValue().getstudent());
	   System.out.println("We are now testing the reverse feature");
	   second.reverse();
	   System.out.println(second.reverse().top().getReturnValue().getstudent());
	   System.out.println("We are done testing ImprovedStackImpl");
	   System.out.println("--------------------------------------------------");	
	   
	   
	   
	   //System.out.println("Below is the result of the top");
	   //second.top();
	   System.out.println("This the result of remove");
	   //System.out.println(second.top());
	   second.remove(S3);
	   
	   //System.out.println("Below is the result of the reverse");
	   second.reverse();
	   second.size();
	   second.top();
	   second.isEmpty();
	   second.pop();
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
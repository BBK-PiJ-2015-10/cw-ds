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
	   System.out.println("We are now testing all the different type of Lists");
	   FunctionalArrayList fourth = new FunctionalArrayList ();
	   fourth.rest();
	   System.out.println(fourth.head().getError().displayErrormessage());
	   fourth.add(S1);
	   fourth.head();
	   fourth.add(S2);
	   fourth.add(S3);
	   fourth.add(S4);
	   fourth.add(S5);
	   fourth.add(S6);
	   fourth.add(S7);
	   
	   System.out.println(fourth.get(6).getReturnValue().getstudent());
	   fourth.get(8);
	   fourth.add(9,S3);
	   System.out.println(fourth.get(8).getError().displayErrormessage());
	   
	   System.out.println(fourth.get(0).getReturnValue().getstudent());
	   fourth.add(0,S4);
	   System.out.println(fourth.get(0).getReturnValue().getstudent());
	   
	   fourth.remove(0);
	   System.out.println(fourth.get(0).getReturnValue().getstudent());
	   fourth.remove(3);
	   System.out.println(fourth.remove(12).getError().displayErrormessage());
	   
	   
	   System.out.println(fourth.head().getReturnValue().getstudent());
	   System.out.println(fourth.rest().head().getReturnValue().getstudent());

	   
	  
	   
	   
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
	   System.out.println(third.get(9).getError().displayErrormessage());
	   
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
	   
	   List first = new ArrayList();
	   ImprovedStackImpl fifth = new ImprovedStackImpl ();
	   fifth.push(S1);
	   System.out.println(fifth.pop().getReturnValue().getstudent());
	   fifth.pop();
	   fifth.pop();
	   System.out.println(fifth.pop().getError().displayErrormessage());
	   System.out.println(fifth.top().getError().displayErrormessage());
	   fifth.push(S1);
	   fifth.push(S2);
	   fifth.push(S3);
	   fifth.push(S4);
	   fifth.push(S5);
	   fifth.push(S6);
	   fifth.push(S7);
	   System.out.println(fifth.top().getReturnValue().getstudent());
	   System.out.println("Below is the result of the top");
	   //System.out.println(second.top().getReturnValue().getstudent());
	   System.out.println("We are now testing the remove feature, removing S7");
	   //fifth.remove(S7);
	   //System.out.println(fifth.pop().getError().displayErrormessage());
	   //System.out.println(fifth.top().getReturnValue().getstudent());
	   //fifth.pop();
	   System.out.println("We are now testing the reverse feature");
	   System.out.println(fifth.top().getReturnValue().getstudent());
	   System.out.println(fifth.reverse().top().getReturnValue().getstudent());
	   //System.out.println(second.reverse().top().getReturnValue().getstudent());
	   System.out.println("We are done testing ImprovedStackImpl");
	   System.out.println("--------------------------------------------------");
	   
	   
	   
	   
	   //System.out.println("Below is the result of the top");
	   //second.top();
	   System.out.println("This the result of remove");
	   //System.out.println(second.top());
	   //second.remove(S3);
	   
	   //System.out.println("Below is the result of the reverse");
	   //second.reverse();
	   //second.size();
	   //second.top();
	   //second.isEmpty();
	   //second.pop();
		   
	   }
	   

}
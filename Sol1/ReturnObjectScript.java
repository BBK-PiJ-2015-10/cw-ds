public class ReturnObjectScript {

    public static void main ( String [] args) {
		 
		ReturnObjectScript script = new ReturnObjectScript();
		script.launch(); 
		
	}

    public void launch () {
		
		ReturnObjectImp exam1 = new ReturnObjectImp();
		Object first = new Object(250);
		exam1.insert(first);
		Object second = new Object(20);
		exam1.insert(second);
		Object third = new Object(250);
		exam1.insert(third);
		Object fourth = new Object(55);
		exam1.insert(fourth);
		Object fifth = new Object(-200);
		exam1.insert(fifth);
		Object sixth = new Object(65);
		exam1.insert(sixth);
		
		exam1.alltogether();
		exam1.alltogether();
		exam1.alltogether();
		exam1.alltogether();
		exam1.alltogether();
		exam1.alltogether();
		exam1.alltogether();
		
	}
		

}
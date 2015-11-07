/**
 * This is a class Object to be used in this assignment # 2.
 *
 * @author YAP
 */
public class Object {
	
	/**
	 * This is an element of Object that contains the student name
	 */	
	private String student;
	
	/**
	 * This is an element of Object that contains the student ID in an integer format
	 */
	private int id;
	
	/**
	 * This is an element of Object that contains a reference between the Object
	 * and the next Object. This is to be used in LinkedList, Stacks, and Arrays.
	 */
	private Object nextObject;
	 
	/**
	 * This is the constructor of object.
	 */
	public Object(String student, int id){
	    this.student = student;
		this.id = id;
		this.nextObject = null;
	} 
	 
	/**
	 *This is a getter method to be able to return the student string from any given Object.
	 *@return the student name
	 */
	public String getstudent(){
	    return this.student;
	}

	/**
	 * This is a getter method to be able to return the student ID from any given Object.
	 *@return the student ID
	 */
	public int getid(){
	    return this.id;
	}
	
	/**
	 * This is a getter method to be able to return the next object from any given Object.
	 *@return the next Object from this Object.
	 */
	public Object getnextObject(){
	    return this.nextObject;
	}
	 
	
	/**
	 * This is a setter method to be able to change the student name if desired.
	 */
	public void setstudent(String student){
		this.student = student;
	}
	
	/**
	 * This is a setter method to be able to change the student ID if desired.
	 */
	public void setid(int id){
		this.id = id;
	}
		
	/**
	 * This is a setter method to be able to define the next Object of each Object.
	 */
	public void setnextObject(Object nextObject){
		this.nextObject = nextObject;
	}	
	
	/**
	 * This is a method to be able to recursively add elements into a list.
	 */
	public void insert (Object p) {
		if(this.nextObject == null) {
		   this.nextObject = p;
			}
		else {
			this.nextObject.insert(p);
			}
		}


	/**
	 * This is a method to be able to delete a particular Object from a list.
	 *@return true when finished, until then it returns false.
	 */	
	public boolean delete(Object p) {
		if (this.nextObject ==  null ){
			return false;
		} else if (this.nextObject.student.equals(p.student)) {
			this.nextObject = nextObject.nextObject;
			return true;
		} else {
			return this.nextObject.delete(p);
		}
	}	
	
	/**
	 * This is a method to be able to add a particular Object to a list in a particular position
	 *@return true when finished, until then it returns false.
	 */	
	public boolean inject(Object x, Object p) {
		if (this.nextObject ==  null ){
			return false;
		} else if (this.nextObject.student.equals(x.student)) {
			p.setnextObject(this.nextObject);
			this.nextObject = p;
			return true;
		} else {
			return this.nextObject.inject(x,p);
		}
	}
	
}
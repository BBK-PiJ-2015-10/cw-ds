public class Object {
			
	public String student;
	
	public int id;
	
	private Object nextObject;
	
	private Object priorObject;
	 
	public Object(String student, int id){
	    this.student = student;
		this.id = id;
		this.nextObject = null;
		this.priorObject = null;
	} 
	 
	public String getstudent(){
	    return this.student;
	}
	 
	public int getid(){
	    return this.id;
	}
	 
	public Object getnextObject(){
	    return this.nextObject;
	}
	 
	public Object getpriorObject(){
	    return this.priorObject;
	}
	 
	public void setstudent(String student){
		this.student = student;
	}
	 
	public void setid(int id){
		this.id = id;
	}
		
	public void setnextObject(Object nextObject){
		this.nextObject = nextObject;
	}	
	
	public void setpriorObject(Object priorObject){
		this.priorObject = priorObject;
	}
		
	public void insert (Object p) {
		if(this.nextObject == null) {
		   this.nextObject = p;
			}
		else {
			this.nextObject.insert(p);
			}
		}

	}
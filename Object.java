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
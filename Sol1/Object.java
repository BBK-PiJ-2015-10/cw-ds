public class Object {
		
		private int value;
		
		private Object nextobject;
		
		public Object (int x) {
			this.value = x;
			this.nextobject = null;
		}
		
		public void add (Object p) {
			if(this.nextobject == null) {
				this.nextobject = p;
			}
			else {
				this.nextobject.add(p);
			}
		}
		
		public int getvalue(){
			return this.value;
		} 
		
		public Object getnextobject(){
			return this.nextobject;
		}
		
		public void setvalue (int value) {
			this.value = value;
		}
		
		public void setnextobject (Object nextobject) {
			this.nextobject = nextobject;
		}
		
		
	}
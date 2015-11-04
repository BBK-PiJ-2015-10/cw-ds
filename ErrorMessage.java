public class ErrorMessage {
		
		private String message;
		
		public ErrorMessage (String message){
			this.message = message;
		}
		
		public String displayErrormessage() {
			return this.message;
		}
		
		public void setErrormessage(String message){
			this.message = message;
		}
		
	}
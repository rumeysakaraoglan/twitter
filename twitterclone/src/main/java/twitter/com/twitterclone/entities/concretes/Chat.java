package twitter.com.twitterclone.entities.concretes;

public class Chat {
	  private int id;
	    private String text;
	    private String Username;

	    public Chat() {
	    	
	    } 
        public Chat(int id, String text, String Username) {
	 
     	this.id = id;
	    this.text = text;
	    this.Username = Username;
}
        public int getId() {
	      return id;
}
       public void setId(int id) {
	     this.id = id;
}
       public String gettext() {
	     return text;
}
       public void settext(String text) {
	     this.text = text;
}
       public String getUsername() {
	     return Username;
}
       public void setUsername(String Username) {
	     this.Username = Username;
}




}

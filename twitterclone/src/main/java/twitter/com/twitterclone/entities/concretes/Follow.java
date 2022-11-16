package twitter.com.twitterclone.entities.concretes;

public class Follow {
	private int id;
	private String userName;
	public Follow() {
		
	}
	public Follow(int id, String userName) {
		 
		this.id = id;
		this.userName = userName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
 
}

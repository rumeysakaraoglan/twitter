package twitter.com.twitterclone.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import twitter.com.twitterclone.dataAccess.abstracts.UserRepository;
import twitter.com.twitterclone.entities.concretes.User;

@Repository
public class InMemoryUserRepository implements UserRepository{

	private List<User> users;
	
	public InMemoryUserRepository() {
		users = new ArrayList<User>();
		
		users.add(new User(1,"rumeysa","123"));
		users.add(new User(2,"ayse","abc"));
		
		
	}

	@Override
	public List<User> getAll() {		 
		return users;
	}

}

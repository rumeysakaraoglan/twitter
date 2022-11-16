package twitter.com.twitterclone.business.concretes;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import twitter.com.twitterclone.business.abstracts.UserService;
import twitter.com.twitterclone.dataAccess.abstracts.UserRepository;
import twitter.com.twitterclone.entities.concretes.User;

@Service
public class UserManager implements UserService {

	private UserRepository userRepository ;
	
	
	public UserManager(UserRepository userRepository) {
		 
		this.userRepository = userRepository;
	}


	@Override
	public List<User> getAll() {
		 
		return userRepository.getAll();
	}

}  

package twitter.com.twitterclone.dataAccess.abstracts;

import java.util.List;
import twitter.com.twitterclone.entities.concretes.*;

public interface UserRepository {
	List<User> getAll();
}

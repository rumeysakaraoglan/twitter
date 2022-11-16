package twitter.com.twitterclone.dataAccess.abstracts;

import java.util.List;

import twitter.com.twitterclone.entities.concretes.Follow;



public interface FollowRepository {
	List<Follow> getAll();
}
 
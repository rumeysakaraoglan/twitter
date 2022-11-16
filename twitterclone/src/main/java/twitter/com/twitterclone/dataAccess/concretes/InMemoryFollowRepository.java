package twitter.com.twitterclone.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import twitter.com.twitterclone.dataAccess.abstracts.FollowRepository;
import twitter.com.twitterclone.entities.concretes.Follow;


@Repository
public class InMemoryFollowRepository implements FollowRepository {
private List<Follow> follow;
	
	public InMemoryFollowRepository() {
		follow = new ArrayList<Follow>();
		
		follow.add(new Follow(1,"rumeysa"));
		follow.add(new Follow(2,"ayse"));
		

}
	@Override
	public List<Follow> getAll() {		 
		return follow;
	}

} 
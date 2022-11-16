package twitter.com.twitterclone.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import twitter.com.twitterclone.business.abstracts.FollowService;
import twitter.com.twitterclone.dataAccess.abstracts.FollowRepository;
import twitter.com.twitterclone.entities.concretes.Follow;

 

@Service
public class FollowManager implements FollowService {
	
	private FollowRepository followRepository ;
	
	public FollowManager(FollowRepository followRepository) {
		 
		this.followRepository= followRepository;
	}
	@Override
	public List<Follow> getAll(){
		 
		return followRepository.getAll();
	}

}

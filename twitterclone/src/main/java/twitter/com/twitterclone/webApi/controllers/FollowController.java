package twitter.com.twitterclone.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import twitter.com.twitterclone.business.abstracts.FollowService;
import twitter.com.twitterclone.entities.concretes.Follow;


@RestController
@RequestMapping("/api/follow")
public class FollowController {
	private FollowService followService;
	
	@Autowired
	public FollowController(FollowService followService) {
		super();
		this.followService = followService;
	}

	@GetMapping("/getall")
	public List<Follow> getAll() {
		return followService.getAll();
	}
}
 
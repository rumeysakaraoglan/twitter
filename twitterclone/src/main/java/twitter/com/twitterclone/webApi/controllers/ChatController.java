package twitter.com.twitterclone.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import twitter.com.twitterclone.business.abstracts.ChatService;
import twitter.com.twitterclone.entities.concretes.Chat;


@RestController
@RequestMapping("/api/chat")
public class ChatController {
	private ChatService chatService;
	

	@Autowired
	public ChatController(ChatService chatService) {
		super();
		this.chatService = chatService;
	}
	
	@GetMapping("/getall")
	public List<Chat> getAll() {
		return chatService.getAll();
	}

}
 
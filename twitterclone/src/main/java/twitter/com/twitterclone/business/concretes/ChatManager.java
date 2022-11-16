package twitter.com.twitterclone.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import twitter.com.twitterclone.business.abstracts.ChatService;
import twitter.com.twitterclone.dataAccess.abstracts.ChatRepository;

import twitter.com.twitterclone.entities.concretes.Chat;

@Service
public class ChatManager implements ChatService {
	
	private ChatRepository chatRepository ;
	
	
	public ChatManager(ChatRepository chatRepository) {
		 
		this.chatRepository = chatRepository;
	}


	@Override
	public List<Chat> getAll() {		 
		return chatRepository.getAll();
	}

}

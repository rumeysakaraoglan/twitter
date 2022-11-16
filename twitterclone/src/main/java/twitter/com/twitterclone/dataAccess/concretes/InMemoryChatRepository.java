package twitter.com.twitterclone.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import twitter.com.twitterclone.dataAccess.abstracts.ChatRepository;
import twitter.com.twitterclone.entities.concretes.Chat;


@Repository
public class InMemoryChatRepository implements ChatRepository{

	

	private List<Chat> chat;
	
	public InMemoryChatRepository() {
		chat  = new ArrayList<Chat>();
		
		chat.add(new Chat(1,"Merhaba","rumeysa"));
		chat.add(new Chat(2,"Merhaba","ayse"));
	}	
	
	@Override
	public List<Chat> getAll() {		 
		return chat;
	}
} 

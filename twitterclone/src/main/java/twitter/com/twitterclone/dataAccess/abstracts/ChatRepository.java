package twitter.com.twitterclone.dataAccess.abstracts;

import java.util.List;

import twitter.com.twitterclone.entities.concretes.Chat;


public interface ChatRepository {
	List<Chat> getAll();

} 

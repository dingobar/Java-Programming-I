
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author martin
 */
public class MessagingService {

	ArrayList<Message> _messages;

	public MessagingService() {
		_messages = new ArrayList();
	}

	public void add(Message message) {
		if (message.getContent().length() <= 280) {
			_messages.add(message);
		}
	}

	public ArrayList<Message> getMessages() {
		return _messages;
	}
}

package whatsApp.clone.whatsApp.entities;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Rooms")
public class Rooms {
	
	@Id
	private String roomId;
	private String roomName;
	private String discription;
	private List<Messages> chats;
	
	public Rooms() {
		super();
		
	}
	
	public Rooms(String roomId, String roomName, String discription) {
		super();
		this.roomId = roomId;
		this.roomName = roomName;
		this.discription = discription;
		
	}
	
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public List<Messages> getChats() {
		return chats;
	}

	public void setChats(List<Messages> chats) {
		this.chats = chats;
	} 
	
}

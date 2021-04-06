package whatsApp.clone.whatsApp.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.data.annotation.Transient;

public class Messages {

	private String message;
	private String userId;
	
	private String roomId;
	@Transient
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date date = new Date();

	String t = formatter.format(date);
	private String timeStamp = t;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Messages() {
		super();
		
	}
	public Messages(String message, String userId, String roomId, SimpleDateFormat formatter, Date date, String t,
			String timeStamp) {
		super();
		this.message = message;
		this.userId = userId;
		this.setRoomId(roomId);
		this.formatter = formatter;
		this.date = date;
		this.t = t;
		this.setTimeStamp(timeStamp);
	}
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	
	
}

package whatsApp.clone.whatsApp.entities;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Person")
public class Person {

	private String emailId;
	private String useName;
	private String info;
	
	public Person() {
		super();
		
	}
	
	public Person(String emailId, String useName, String info) {
		super();
		this.emailId = emailId;
		this.useName = useName;
		this.info = info;
	}
	
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getUseName() {
		return useName;
	}
	public void setUseName(String useName) {
		this.useName = useName;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
}

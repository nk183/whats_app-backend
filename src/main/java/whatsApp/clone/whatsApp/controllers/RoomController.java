package whatsApp.clone.whatsApp.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import whatsApp.clone.whatsApp.entities.Messages;
import whatsApp.clone.whatsApp.entities.Rooms;
import whatsApp.clone.whatsApp.repositories.RoomRepository;
@CrossOrigin 
@RestController
public class RoomController {
	
	@Autowired
	private RoomRepository repository;
	
	
	@PostMapping("/addRoom")
	public String saveRoom(@RequestBody  Rooms data ) {
		repository.save(data);
		return "Saved";
	}
	
	@PostMapping("/addChat")
	public String saveChat(@RequestBody Messages m) {
		if(m.getRoomId()!=null) {
			Optional<Rooms> temp=repository.findById(m.getRoomId());
			Rooms r = temp.get();
			List<Messages> c = r.getChats();
			
			if(c==null) {
				c=new ArrayList<Messages>();
			}
			c.add(m);
			r.setChats(c);
			repository.save(r);
			return "Saved";
		}
		return "not saved";
	}
	
	@GetMapping("/getChat/{id}")
	public List<Messages>  findChat(@PathVariable String id) {   //@RequestBody int t
//		String i= "1";
		Optional<Rooms> temp= repository.findById(id);
		Rooms r = temp.get();
		return r.getChats();
	}
	
	
	@GetMapping("/getRooms")
	public List<Rooms>  findRooms() {
		return repository.findAll();
	}
	
	@DeleteMapping("/deleteRooms")
	public String deleteRooms(@RequestBody String id) {
		repository.deleteAll();
		return "Deleted";
	}
	
}

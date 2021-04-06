package whatsApp.clone.whatsApp.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import whatsApp.clone.whatsApp.entities.Rooms;

public interface RoomRepository extends MongoRepository<Rooms, String> {

}


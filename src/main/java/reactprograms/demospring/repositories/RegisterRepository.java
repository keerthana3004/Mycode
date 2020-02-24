package reactprograms.demospring.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import reactprograms.demospring.models.Register;

public interface RegisterRepository  extends MongoRepository<Register, String> {

    Register findBy_id(ObjectId _id);

}


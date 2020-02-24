package reactprograms.demospring.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import reactprograms.demospring.models.Employee;
import reactprograms.demospring.models.Login;

public interface LoginRepository extends MongoRepository<Login,String> {
    Login findBy_id(ObjectId _id);
}

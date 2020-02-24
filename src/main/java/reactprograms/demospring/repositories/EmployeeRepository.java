package reactprograms.demospring.repositories;
import reactprograms.demospring.models.Employee;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

    Employee findBy_id(ObjectId _id);

    @org.springframework.data.mongodb.repository.Query(value = "{'points.point_value':{$gt:?0,$lt:?1}}")
    List findByPointValueBetweenQuery(int from, int to);

    @org.springframework.data.mongodb.repository.Query(value = "{'points.point_value':{$gt:?0}}")
    List findByPointValueGreaterThanQuery(int GreaterThanvalue);

    @org.springframework.data.mongodb.repository.Query(value = "{'points.point_value':{$lt:?0}}")
    List findByPointValueLessThanQuery(int LessThanvalue);

    @org.springframework.data.mongodb.repository.Query(value = "{'emp_name' : { $regex : ?0, $options: 'i' } }")
    List findByEmployeeNameIgnoreCase(String emp_name);
}






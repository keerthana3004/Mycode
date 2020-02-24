package reactprograms.demospring.controller;
import org.bson.types.ObjectId;
import org.springframework.http.ResponseEntity;
import reactprograms.demospring.models.Employee;
import reactprograms.demospring.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;


@Component
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;


    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List getByEmployeeName(@RequestParam String emp_name) {
        return employeeRepository.findByEmployeeNameIgnoreCase(emp_name);
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/greater", method = RequestMethod.GET)
    public List getpointvalueGreaterThan(@RequestParam(value = "param1", required = true) int point_value) {
        return employeeRepository.findByPointValueGreaterThanQuery(point_value);
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/lesser", method = RequestMethod.GET)
    public List getpointvalueLesserThan(@RequestParam(value = "param2", required = true) int point_value) {
        return employeeRepository.findByPointValueLessThanQuery(point_value);
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/between", method = RequestMethod.GET)
    public List getpointvalueBetween(@RequestParam(value = "param1", required = true) int point_value1, @RequestParam(value = "param2", required = false) int point_value2) {
        return employeeRepository.findByPointValueBetweenQuery(point_value1, point_value2);
    }

    @CrossOrigin(origins = "*")
        @RequestMapping(value = "/add", method = RequestMethod.POST)
        public Employee save(@Valid @RequestBody Employee employee) {
            employee.set_id(ObjectId.get());
            employeeRepository.save(employee);
            return employee;
    }


    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteEmployee(@PathVariable("id") String id) {
        employeeRepository.deleteById(id);
    }

//    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
//    public String editapl(@PathVariable("id") String id) {
//        employeeRepository.findBy_id(id);
//    }


    @RequestMapping( value="/edit",method=RequestMethod.PUT)
    public Employee update(@RequestParam String id, @RequestBody Employee employee) {
        Optional<Employee> opemployee = employeeRepository.findById(id);
        Employee e = opemployee.get();
        if(employee.getEmp_no() != 0)
            e.setEmp_no(employee.getEmp_no());
        if(employee.getEmp_name() != null)
            e.setEmp_name(employee.getEmp_name());
        if(employee.getPoints() != null)
            e.setPoints(employee.getPoints());
        if(employee.getLast_timestamp() != null)
            e.setLast_timestamp(employee.getLast_timestamp());
        employeeRepository.save(e);
        return e;
    }



}





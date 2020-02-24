package reactprograms.demospring.controller;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import reactprograms.demospring.models.Employee;
import reactprograms.demospring.models.Register;
import reactprograms.demospring.repositories.EmployeeRepository;
import reactprograms.demospring.repositories.RegisterRepository;

import javax.validation.Valid;

@Component
@RestController
public class RegisterController {
    @Autowired
    private RegisterRepository registerRepository;


    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Register save(@Valid @RequestBody Register register) {
        register.set_id(ObjectId.get());
        registerRepository.save(register);
        return register;
    }

}

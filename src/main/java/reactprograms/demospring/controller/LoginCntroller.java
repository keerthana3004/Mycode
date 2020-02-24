package reactprograms.demospring.controller;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import reactprograms.demospring.models.Employee;
import reactprograms.demospring.models.Login;
import reactprograms.demospring.repositories.LoginRepository;

import javax.validation.Valid;

@Component
@RestController
public class LoginCntroller {
    @Autowired
    private LoginRepository loginRepository;
    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Login save(@Valid @RequestBody Login login) {
        login.set_id(ObjectId.get());
        loginRepository.save(login);
        return login;
    }
}

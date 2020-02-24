//package reactprograms.demospring.controller;
//
//import org.apache.catalina.User;
//import org.bson.types.ObjectId;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.*;
//import reactprograms.demospring.models.Register;
//import reactprograms.demospring.repositories.RegisterRepository;
//import reactprograms.demospring.repositories.UserRepository;
//
//import javax.validation.Valid;
//
//
//@Component
//@RestController
//public class UserController {
//    @Autowired
//    private UserRepository userRepository;
//
//
//    @CrossOrigin(origins = "*")
//    @RequestMapping(value = "/create", method = RequestMethod.POST)
//    public User save(@Valid @RequestBody User user) {
//        user.set_id(ObjectId.get());
//        userRepository.save(user);
//        return user;
//    }
//
//}

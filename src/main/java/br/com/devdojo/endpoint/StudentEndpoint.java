package br.com.devdojo.endpoint;

import br.com.devdojo.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("student")
public class StudentEndpoint {

    @RequestMapping(method = RequestMethod.GET, path = "/list")
    public List<Student> listAll() {
        return Arrays.asList(new Student("Ken"), new Student("Ryu"));
    }

}

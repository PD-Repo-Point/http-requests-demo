package pd.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/path")
public class PathVariableController {
    @GetMapping("/users/{id}")
    public String pathVariable(@PathVariable Integer id){
        System.out.println(id);
        return "hi";
    }

    @GetMapping("/userOtherName/{id}")
    public String pathVariableDifferentName(@PathVariable("id") Integer variableNotNamedId){
        System.out.println(variableNotNamedId);
        return "hi";
    }
}

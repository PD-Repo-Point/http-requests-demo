package pd.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/header")
public class RequestHeaderController {
    @GetMapping("/name")
    public void printName(@RequestHeader("user-name") String name){
        System.out.println(name);
    }

    @GetMapping("/required")
    public void listHeader(@RequestHeader Map<String, String> headers){
        headers.forEach((key, value)->{
            System.out.format("header %s : %s %n", key, value);
        });
    }
}

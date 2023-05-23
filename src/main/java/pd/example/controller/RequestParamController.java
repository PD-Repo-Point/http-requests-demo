package pd.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/requestParam")
public class RequestParamController {
    @GetMapping("/required")
    public void requiredRequestParam(@RequestParam String name){
        System.out.println(name);
    }

    @GetMapping("/notRequired")
    public void notRequiredRequestParam(@RequestParam(required = false) String name){
        System.out.println(name);
    }

    @GetMapping("/notRequiredDefault")
    public void notRequiredDefaultValueRequestParam(@RequestParam(defaultValue = "defaultName") String name){
        System.out.println(name);
    }

    @GetMapping("/allParams")
    public void notRequiredOptional(@RequestParam Map<String,String> allParams){
        allParams.forEach((key,value)->{
            System.out.format("Request Param : %s = %s %n", key, value);
        });
    }
}

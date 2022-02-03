package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {

//    @GetMapping("hello")
//    @ResponseBody
//    public String hello(){
//        return "Hello, Spring!";
//    }

    @GetMapping("goodbye")
    public String goodbye(){
        return "Goodbye, Spring!";
    }

    // create handler that handles request of form /hello?name=LaunchCode
    @RequestMapping(method={RequestMethod.GET, RequestMethod.POST})
    public String helloWithQueryParam(@RequestParam String name){
        return "Hello, " + name + "!";

    }

    //Handle requests of the form /hello/LaunchCode
    @GetMapping("{name}")
    public String helloWithPathParam(@PathVariable String name, @PathVariable String friend){
        return "Hello, " + name + "!";
    }

    @GetMapping("form")
    public String helloForm(){
        return "<html>" +
                "<body>" +
                "<form action='/hello' method='post'>" +  //submit a request to /hello
                "<input type='text' name='name'>" +
                "<input type='submit' value='Greet me!'>" +
                "<input type='submit' value='Friend'>" +
                "</form>" +
                "</body>" +
                "</html>";

    }

}

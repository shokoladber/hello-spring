package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping(value="hello")
public class HelloController {

//    @GetMapping("hello")
//    @ResponseBody
//    public String hello(){
//        return "Hello, Spring!";
//    }

//    @GetMapping("goodbye")
//    public String goodbye(){
//        return "Goodbye, Spring!";
//    }

    // create handler that handles request of form /hello?name=LaunchCode
    @GetMapping
    public String helloWithQueryParam(@RequestParam String name, @RequestParam String language){
        String greeting = "";
        if (language.equals("english")) {
            greeting = "Hello, " + name + "!";
        } else if (language.equals("italian")) {
            greeting = "Buongiorno, " + name + "!";
        } else if (language.equals("french")) {
            greeting = "Bonjour, " + name + "!";
        }
        return greeting;
    }

//    //Handle requests of the form /hello/LaunchCode
//    @RequestMapping(method=RequestMethod.GET)
//    public String helloWithPathParam(@RequestParam String name, @RequestParam String friend, @RequestParam String language) {
//
//        String greeting = "";
//
//        if (name == "") {
//            return "World";
//        } else if (language.equals("english")) {
//            greeting = "Hello, " + name + "!";
//        } else if (language.equals("italian")) {
//            greeting = "Buongiorno, " + name + "!";
//        } else if (language.equals("french")) {
//            greeting = "Bonjour, " + name + "!";
//        } else if (language.equals("spanish")) {
//            greeting = "Hola, " + name + "!";
//        } else if (language.equals("german")) {
//            greeting = "Gutentag, " + name + "!";
//        }
//        return greeting;
//
//    }

    @RequestMapping(value="form", method=RequestMethod.GET)
    public String helloForm(){
        return "<html>" +
                    "<body>" +
                        "<form action='/hello' method='get'>" +  //submit a request to /hello
                            "<input type='text' name='name'>" +
                            "<select name='language'>" +
                                "<option value=''>--Please choose an option--</option>" +
                                "<option value='english'>English</option>" +
                                "<option value='italian'>Italian</option>" +
                                "<option value='french'>French</option>" +
                                "<option value='spanish'>Spanish</option>" +
                                "<option value='german'>German</option>" +
                            "</select>" +
                            "<input type='submit' value='Greet me!'>" +
                            "<input type='submit' value='Friend'>" +
                        "</form>" +
                    "</body>" +
                "</html>";

    }

}

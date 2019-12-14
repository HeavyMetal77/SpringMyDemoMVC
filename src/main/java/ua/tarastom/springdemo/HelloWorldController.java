package ua.tarastom.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import javax.servlet.http.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    // need a controller method to show the initial HTML form
    @RequestMapping("/showForm")
    public String showForm() {
        System.out.println("showForm");
        return "helloworld-form";
    }

    // need a controller method to process the HTML form
    @RequestMapping("/processForm")
    public String processForm() {
        System.out.println("helloworld");
        return "helloworld";
    }

    @RequestMapping("/upper")
    public String upper(HttpServletRequest request, Model model) {
        String studentName = request.getParameter("studentName");

        String upperCaseName = studentName.toUpperCase();
        model.addAttribute("upName", upperCaseName);

        return "helloworld";
    }

    @RequestMapping("/processFormThree")
    public String processFormThree(@RequestParam("studentName") String theName, Model model) {

        String upperCaseName = "Yo, " + theName.toUpperCase();
        model.addAttribute("upName", upperCaseName);

        return "helloworld";
    }
}

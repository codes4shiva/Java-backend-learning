package com.shivanshu.Springbootweb1;

import org.springframework.ui.Model;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String home(){
    System.out.println("Home called");
        return "index";
    }

    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView mv){

        int res = num1 + num2;
        System.out.println(res);
        mv.addObject("result",res);
        mv.setViewName("result");
        return mv;

        // model.addAttribute("result",res) return result -> this one refers to the result.jsp
        // .jsp suffix is added in application properties
    }
}

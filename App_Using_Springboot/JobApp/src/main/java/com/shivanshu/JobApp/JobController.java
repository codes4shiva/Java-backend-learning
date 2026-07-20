package com.shivanshu.JobApp;

import com.shivanshu.JobApp.model.JobPost;
import com.shivanshu.JobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobService service;

    @RequestMapping({"/","home"})
    public String home(){
        System.out.println("home");
        return "home";
    }
    @RequestMapping("addjob")
   public String addjob(){
        return "addjob";
   }

   @GetMapping("viewalljobs")
   public String viewalljobs(Model m){
        List<JobPost> jobs = service.getAllJobs();
        m.addAttribute("jobPosts",jobs);
        return "viewalljobs";
   }

    @PostMapping("handleForm")
   public String handleform(JobPost jobPost){
        System.out.println("handleform1");
       service.addJob(jobPost);
        System.out.println(jobPost.getPostProfile());
        System.out.println(jobPost.getPostContent());
        System.out.println(jobPost.getExperience());
        System.out.println(jobPost.getTechStack());

        System.out.println("handleform2");
        return "success";
   }
}

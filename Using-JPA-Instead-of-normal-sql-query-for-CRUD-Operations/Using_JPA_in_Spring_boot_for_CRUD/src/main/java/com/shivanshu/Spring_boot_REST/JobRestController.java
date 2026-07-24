package com.shivanshu.Spring_boot_REST;

import com.shivanshu.Spring_boot_REST.model.JobPost;
import com.shivanshu.Spring_boot_REST.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class JobRestController {
    @Autowired
    private JobService jobService;

    @GetMapping("alljobs")
    public List<JobPost> allJobs() {
        return jobService.getAllJobs();
    }

    @GetMapping("jobpost/{postId1}")
    public JobPost getJob(@PathVariable("postId1") int p1) {
        int postId = p1;
        return jobService.getJobByid(postId);
    }

    @PostMapping("jobpost")
    public JobPost addJob(@RequestBody JobPost jobPost) {
        jobService.addJob(jobPost);
        return jobService.getJobByid(jobPost.getPostId());
    }

    @PutMapping("jobpost")
    public JobPost updateJob(@RequestBody JobPost jobPost){
        jobService.updateJob(jobPost);
        return jobService.getJobByid(jobPost.getPostId());
    }

    @DeleteMapping("jobpost/{postId}")
    public String deleteJob(@PathVariable("postId") int postId){
        jobService.deleteJob(postId);
        return "Deleted";  
    }

    @RequestMapping("load")
    public void load(){
        jobService.load();
    }

@GetMapping("findjob/{keyword}")
    public List<JobPost> findjob(@PathVariable("keyword") String keyword){
        return jobService.find(keyword);
    }
}

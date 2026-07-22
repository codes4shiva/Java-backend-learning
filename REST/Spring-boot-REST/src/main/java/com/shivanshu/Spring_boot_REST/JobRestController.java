package com.shivanshu.Spring_boot_REST;

import com.shivanshu.Spring_boot_REST.model.JobPost;
import com.shivanshu.Spring_boot_REST.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobRestController {
    @Autowired
    private JobService jobService;

    @GetMapping("alljobs")
    public List<JobPost> allJobs() {
        return jobService.getAllJobs();
    }

    @GetMapping("jobpost/{postId1}/{postId2}")
    public JobPost getJob(@PathVariable("postId1") int p1,@PathVariable("postId2") int p2) {
        int postId = p1 + p2;
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
}

package com.shivanshu.Spring_boot_REST.service;

import com.shivanshu.Spring_boot_REST.model.JobPost;
import com.shivanshu.Spring_boot_REST.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    public JobRepo repo;

    public void addJob(JobPost jobPost){
        repo.addJob(jobPost);
    }
    public List<JobPost> getAllJobs() {
        return repo.getAllJobs();
    }

    public JobPost getJobByid(int postId) {
        return repo.getJobById(postId);
    }

    public void updateJob(JobPost jobPost) {
        repo.updateJob(jobPost);
    }

    public void deleteJob(int postId) {
        repo.deleteJob(postId);
    }
}

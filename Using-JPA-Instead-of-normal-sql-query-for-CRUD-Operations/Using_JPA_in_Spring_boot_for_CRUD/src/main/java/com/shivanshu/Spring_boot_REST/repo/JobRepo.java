package com.shivanshu.Spring_boot_REST.repo;

import com.shivanshu.Spring_boot_REST.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public interface JobRepo  extends JpaRepository<JobPost,Integer> {
    List<JobPost> findByPostProfileContainingOrPostContentContaining(String postProfile, String postContent);
}
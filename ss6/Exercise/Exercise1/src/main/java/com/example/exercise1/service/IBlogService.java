package com.example.exercise1.service;

import com.example.exercise1.model.Blog;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();

    void save(Blog blog);

    Blog findById(Integer id);

    void deleteById(Integer id);

    List<Blog> search(String name);

//    void edit(Blog blog);
}

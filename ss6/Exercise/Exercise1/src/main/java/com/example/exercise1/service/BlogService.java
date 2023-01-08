package com.example.exercise1.service;

import com.example.exercise1.model.Blog;
import com.example.exercise1.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BlogService implements IBlogService{
    @Autowired
    IBlogRepository iBlogRepository;
    @Override
    public List<Blog> findAll() {
        return iBlogRepository.findAll();
    }

    @Override
    public void save(Blog blog) {
        iBlogRepository.save(blog);
    }

    @Override
    public Blog findById(Integer id) {
        return iBlogRepository.findById(id).get();
    }

    @Override
    public void deleteById(Integer id) {
        iBlogRepository.deleteById(id);
    }

    @Override
    public List<Blog> search(String name) {
        return iBlogRepository.findAllByName(name);
    }

//    @Override
//    public void edit(Blog blog) {
//        iBlogRepository.u
//    }

}

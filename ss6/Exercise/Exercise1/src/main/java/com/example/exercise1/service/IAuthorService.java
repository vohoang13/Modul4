package com.example.exercise1.service;

import com.example.exercise1.model.Author;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IAuthorService {
    List<Author> findAll();
}

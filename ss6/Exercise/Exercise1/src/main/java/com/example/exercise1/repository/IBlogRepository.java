package com.example.exercise1.repository;

import com.example.exercise1.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface IBlogRepository extends JpaRepository<Blog,Integer>{
    @Query(value = "select * from blog b where b.name like :name",nativeQuery = true)
    List<Blog> findAllByName(@Param("name")String name);

}

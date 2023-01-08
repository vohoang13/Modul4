package com.example.exercise1.controller;

import com.example.exercise1.model.Blog;
import com.example.exercise1.service.IAuthorService;
import com.example.exercise1.service.IBlogService;
import com.example.exercise1.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("blog")
public class BlogController {
    @Autowired
    IBlogService iBlogService;
    @Autowired
    IAuthorService iAuthorService;
    @Autowired
    ICategoryService iCategoryService;

    @GetMapping("")
    public String getList(Model model){
        model.addAttribute("blogList",iBlogService.findAll());
//        model.addAttribute("authorList",iAuthorService.findAll());
//        model.addAttribute("categoryList",iCategoryService.findAll());
        return "list";
    }

    @GetMapping("createBlog")
    public String createBlog(Model model){
        model.addAttribute("blog",new Blog());
        model.addAttribute("author",iAuthorService.findAll());
        model.addAttribute("category",iCategoryService.findAll());
        return "createBlog";
    }

    @PostMapping("doCreateBlog")
    public String doCreateBlog(@ModelAttribute("blog")Blog blog){
        iBlogService.save(blog);
        return "redirect:/blog";
    }

    @GetMapping("/detail/{id}")
    public String getDetail(@PathVariable("id")Integer id,Model model){
        model.addAttribute("blog",iBlogService.findById(id));
        return "detail";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id")Integer id){
        iBlogService.deleteById(id);
        return "redirect:/blog";
    }

    @GetMapping("search")
    public String search(@RequestParam("name")String name,Model model){
        model.addAttribute("blogList",iBlogService.search(name));
        return "list";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id")Integer id,Model model){
        model.addAttribute("blog",iBlogService.findById(id));
        model.addAttribute("author",iAuthorService.findAll());
        model.addAttribute("category",iCategoryService.findAll());
        return "edit";
    }

    @PostMapping("doEdit")
    public String doEdit(@ModelAttribute("blog")Blog blog){
        iBlogService.save(blog);
        return "redirect:/blog";
    }

}

package com.example.furama.controller;

import com.example.furama.model.Customer;
import com.example.furama.service.ICustomerService;
import com.example.furama.service.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("furama")
public class FuramaController {

    @Autowired
    ICustomerService iCustomerService;

    @Autowired
    ICustomerTypeService iCustomerTypeService;

    @GetMapping("")
    public String getHome() {
        return "home";
    }

    @GetMapping("createCustomer")
    public String createCustomer(Model model) {
        model.addAttribute("customer", new Customer());
        model.addAttribute("customerType",iCustomerTypeService.findAll());
        return "createCustomer";
    }

    @PostMapping("doCreateCustomer")
    public String doCreateCustomer(@ModelAttribute("customer")Customer customer){
        iCustomerService.save(customer);
        return "redirect:/furama/listCustomer";
    }

    @GetMapping("listCustomer")
    public String getListCustomer(@RequestParam(value = "page",defaultValue = "0")int page,Model model,
                                  @RequestParam(value = "name", defaultValue = "")String name){
        model.addAttribute("searchByName",name);
        model.addAttribute("listCustomer",iCustomerService.findAllByName(name,PageRequest.of(page,1)));
        return "customer";
    }

    @GetMapping("/deleteCustomer/{id}")
    public String deleteCustomer(@PathVariable("id")Integer id){
        iCustomerService.deleteById(id);
        return "redirect:/furama/listCustomer";
    }

    @GetMapping("/editCustomer/{id}")
    public String editCustomer(@PathVariable("id")Integer id,Model model){
        model.addAttribute("customer",iCustomerService.findById(id));
        model.addAttribute("customerType",iCustomerTypeService.findAll());
        return "editCustomer";
    }

    @PostMapping("doEditCustomer")
    public String doEditCustomer(@ModelAttribute("customer")Customer customer){
        iCustomerService.save(customer);
        return "redirect:/furama/listCustomer";
    }
}

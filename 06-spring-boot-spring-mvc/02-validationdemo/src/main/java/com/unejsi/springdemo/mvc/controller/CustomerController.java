package com.unejsi.springdemo.mvc.controller;

import com.unejsi.springdemo.mvc.Customer;
import jakarta.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {

    //add an initbinder(which pre-processes web reqs sent to this controller)... to trim input strings
    //remove leading and trailing white spaces
    //set string to null if all are white spaces
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){

        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);

        webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @GetMapping("/")
    public String showForm(Model theModel){
        theModel.addAttribute("customer", new Customer());

        return "customer-form";
    }

    @PostMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("customer") Customer theCustomer, BindingResult bindingResult){

        System.out.println("Binding results: " + bindingResult.toString());
        System.out.println("\n\n\n");

        System.out.println("Last name: |" + theCustomer.getLastName() + "|" + " free passes: " + theCustomer.getFreePasses() + " postal: " + theCustomer.getPostalCode()); //just for debug
        if(bindingResult.hasErrors()){
            return "customer-form";
        }
        return "customer-confirmation";

    }
}

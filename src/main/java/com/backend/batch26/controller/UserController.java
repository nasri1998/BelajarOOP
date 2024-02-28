package com.backend.batch26.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.backend.batch26.model.Role;
import com.backend.batch26.model.User;
import com.backend.batch26.repository.RoleRepository;
import com.backend.batch26.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller 
@RequestMapping("user")
public class UserController {
    @Autowired

    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("users", userRepository.findAll());
        return "user/index";
    }

    @GetMapping(value = {"form", "form/{id}"})
    public String form(@PathVariable(required = false) Integer id, Model model) {
        if (id != null) {
            model.addAttribute("user", userRepository.findById(id).orElse(null));
        }else{
            model.addAttribute("user", new User());
        }
        model.addAttribute("roles", roleRepository.findAll());
        return "user/form";
    }
    
    @PostMapping("save")
    public String save(User user) {
        userRepository.save(user);
        Boolean result = userRepository.findById(user.getId()).isPresent();
        if (result) {
            return "redirect:/user";
        }
        return "user/form";
    }

    @PostMapping("delete/{id}")
    public String delete(@PathVariable(required = true) Integer id){
        userRepository.deleteById(id);
        Boolean result = userRepository.findById(id).isPresent();
        if (!result) {
            return "redirect:/user";
        }
        return "redirect:/user";
    }
}

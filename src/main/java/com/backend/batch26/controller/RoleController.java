package com.backend.batch26.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.backend.batch26.model.Role;
import com.backend.batch26.repository.RoleRepository;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RequestMapping("role")
public class RoleController {
    @Autowired   // annotasi untuk instansiasi repo

    private RoleRepository roleRepository; 

    @GetMapping
    public String index(Model model){
        model.addAttribute("roles", roleRepository.findAll());
        return "role/index";
    }
    
    @GetMapping("form")
    public String form(Model model){
        model.addAttribute("role", new Role());
        return "role/form";
    }

    @PostMapping("save")
    public String save(Role role) {
        roleRepository.save(role);
        Boolean result = roleRepository.findById(role.getId()).isPresent();
        if (result) {
            return "redirect:/role";
        }
        return "role/form";
    }
    
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, Model model){
        Role role = roleRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Role id : " + id + "not found"));
        model.addAttribute("edit", role);
        return "role/edit";
    }

    @PostMapping("update")
    public String edit(Role role){
        roleRepository.save(role);
        Boolean result = roleRepository.findById(role.getId()).isPresent();
        if (result) {
            return "redirect:/role";
        }
        return "role/form";
        
    }
    
}

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
    
    @GetMapping(value = {"form", "form/{id}"})
    public String form(@PathVariable(required = false) Integer id, Model model){
        if (id != null) {
            model.addAttribute("role", roleRepository.findById(id).orElse(null));
        }else{
            model.addAttribute("role", new Role());
        }
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

    @PostMapping("delete/{id}")
    public String delete(@PathVariable(required = true) Integer id){
        roleRepository.deleteById(id);
        Boolean result = roleRepository.findById(id).isPresent();
        if (!result) {
            return "redirect:/role";
        }
        return "redirect:/role";
    }
    
}

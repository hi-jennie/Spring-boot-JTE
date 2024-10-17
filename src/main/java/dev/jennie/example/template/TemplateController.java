package dev.jennie.example.template;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class TemplateController {
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("username","Jennie");
        return "pages/home";
    }

    @GetMapping("/team")
    public String team(Model model){
        List<String> teamMembers = Arrays.asList("Rustin","Jennie","Turkey","Aoby");
        model.addAttribute("teamMembers",teamMembers);
        return "pages/team";
    }

    @GetMapping("/projects")
    public String projects(Model model){
        List<String> projects = List.of("SLEEP","EAT","HANG OUT WITH FAMILIES");
        model.addAttribute("username","Jennie");
        model.addAttribute("projects", projects);
        return "pages/projects";
    }
}

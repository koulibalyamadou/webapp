package gn.kinnovate.koulibaly.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Task {

    @RequestMapping("/tasks")
    public String index(Model model){
        model.addAttribute("task", new Task());
        return "tasks/index";
    }

    public String save(){

        return "";
    }
}

package ua.com.mmplus.catalogapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.com.mmplus.catalogapplication.domain.model.Application;
import ua.com.mmplus.catalogapplication.service.ApplicationMongoServiceImpl;

@Controller
public class ApplicationMongoController {
    @Autowired
    ApplicationMongoServiceImpl applicationMongoService;

    @RequestMapping("/home")
    public String home(){

        return "home";
    }

    @RequestMapping("/list")
    public String allApplications(Model model){
        model.addAttribute("applicationList", applicationMongoService.findAll());
        return "list";
    }

    @RequestMapping(value = "/addApplication", method = RequestMethod.POST)
    public String addApplication(@ModelAttribute Application application){
        applicationMongoService.save(application);
        return "redirect:list";
    }

    @RequestMapping(value = "/search")
    public String searchApplication(@RequestParam String search){
        return "list";
    }

}

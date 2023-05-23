package com.example.htmldemo.htmxdemo;

import com.example.htmldemo.htmxdemo.Contact;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/public/components")
public class InputComponent {

    @PostMapping("/input/{id}")
    public String editForm(Contact contact, Model model, @PathVariable String id) {
        //model.addAttribute("contact", contact);
        //model.addAttribute("id", id);
        return "input.html";
    }
}

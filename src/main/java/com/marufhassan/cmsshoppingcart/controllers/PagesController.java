package com.marufhassan.cmsshoppingcart.controllers;

import com.marufhassan.cmsshoppingcart.models.PageRepository;
import com.marufhassan.cmsshoppingcart.models.ProductRepository;
import com.marufhassan.cmsshoppingcart.models.QuestionRepository;
import com.marufhassan.cmsshoppingcart.models.data.Page;
import com.marufhassan.cmsshoppingcart.models.data.Product;
import com.marufhassan.cmsshoppingcart.models.data.Question;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PagesController {
    @Autowired
    private PageRepository pageRepo;

    @Autowired
    private QuestionRepository questionRepo;
    
    @GetMapping
    public String home(Model model) {
        Page page = pageRepo.findBySlug("home");
        model.addAttribute("page", page);
        model.addAttribute("products", page);

        return "page";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }


    @GetMapping("/{slug}")
    public String page(@PathVariable String slug, Model model) {
        Page page = pageRepo.findBySlug(slug);
        if (page == null) {
            return "redirect:/";
        }
        
        List<Question> lstQ = questionRepo.findAllBySlug(slug);
        model.addAttribute("type",slug);
        model.addAttribute("page", page);
        model.addAttribute("lstQ", lstQ);

        return "page";
    }
}

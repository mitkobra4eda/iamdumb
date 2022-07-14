package com.ddimitko.iamdumb.controllers;

import com.ddimitko.iamdumb.objects.Contributor;
import com.ddimitko.iamdumb.objects.Post;
import com.ddimitko.iamdumb.services.ContributorService;
import com.ddimitko.iamdumb.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    PostService postService;

    @Autowired
    ContributorService contributorService;

    @GetMapping("/")
    public String homepage(Model model){

        List<Post> posts = postService.findAll();
        model.addAttribute("posts", posts);

        return "index";
    }

    @GetMapping("/contributors")
    public String contributors(Model model){

        List<Contributor> contributors = contributorService.findAll();
        model.addAttribute("contributors", contributors);

        return "contributors";
    }

    @PostMapping("/post")
    public String post(@RequestParam String name, @RequestParam String content){

        postService.createPost(name, content);

        return "redirect:/";
    }

}

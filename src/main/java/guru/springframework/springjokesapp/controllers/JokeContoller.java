package guru.springframework.springjokesapp.controllers;

import guru.springframework.springjokesapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeContoller {
    private final JokeService jokeService;
    //no need to auto wire as di with constructors spring automatically does
    public JokeContoller(JokeService jokeService) {
        this.jokeService = jokeService;
    }
    @RequestMapping({"/",""})
    public String showJoke(Model model){
        model.addAttribute("joke",jokeService.getJoke());
        return "index";
    }
}

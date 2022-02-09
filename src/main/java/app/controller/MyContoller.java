package app.controller;

import app.Words;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyContoller {
    @Autowired
    public Words words;

    @GetMapping("/")
    public String index(Model model) {
         model.addAttribute("words", words.getRandomWords());        //добавляем, чтобы в jsp можно было юзать
        return "index";
    }
}

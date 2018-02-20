package pl.fotobudka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.fotobudka.entity.User;

@Controller
public class LoginController {

    @RequestMapping(value = "/adminpanel", method = RequestMethod.GET)
    public String loginToAdminPanel(Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "loginPage";
    }
}

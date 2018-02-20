package pl.fotobudka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.fotobudka.entity.User;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @RequestMapping(value = "/adminpanel", method = RequestMethod.GET)
    public String loginToAdminPanelForm(Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "loginPage";
    }

    @RequestMapping(value = "/adminpanel", method = RequestMethod.POST)
    public String loginToAdminPanel(HttpSession session,
                                    @ModelAttribute User user){
        User userToLogin = user;
        if (user.getRole().getAccess() == 6){
            session.setAttribute("admin", userToLogin);
            return "adminPanelPage";
        } else {
            return "loginPage";
        }
    }
}

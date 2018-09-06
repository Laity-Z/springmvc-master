package cap.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("user")
public class LoginController {
    @RequestMapping(value ="login", method = RequestMethod.GET)
    public ModelAndView login(String redirectURL) {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("redrectURL", redirectURL);
        modelAndView.setViewName("login");
        return modelAndView;
    }
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model) {
        if (username.equals("admin") && password.equals("admin")) {
            model.addAttribute("user", username);
            return "/user/admin";
        } else {
            return "login";
        }

    }


}

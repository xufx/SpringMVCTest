package cn.xufx.controller;
import cn.xufx.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
/**
 * Created by xufuxiu on 2017/8/15.
 */
@Controller
public class UserController
{
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ModelAndView user() {
        return new ModelAndView("user", "command", new User());
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("SpringWeb")User user,
                          ModelMap model) {
        model.addAttribute("username", user.getUsername());
        model.addAttribute("password", user.getPassword());
        model.addAttribute("address", user.getAddress());

        return "userlist";
    }
}

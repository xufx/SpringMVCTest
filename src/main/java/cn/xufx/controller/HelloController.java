package cn.xufx.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * Created by xufuxiu on 2017/8/15.
 */
@Controller
public class HelloController
{
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String printHello(ModelMap model)
    {
        model.addAttribute("message","Hello Spring MVC");
        return "hello";
    }
}

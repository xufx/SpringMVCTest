package cn.xufx.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * Created by xufuxiu on 2017/8/15.
 */
@Controller
public class WebController
{
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index()
    {
        return "index";
    }
    @RequestMapping(value = "/staticPage",method = RequestMethod.GET)
    public String staticPage()
    {/*不进入jsp目录寻找*/
        return "redirect:/pages/final.html";
    }
}

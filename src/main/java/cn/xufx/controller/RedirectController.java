package cn.xufx.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * Created by xufuxiu on 2017/8/15.
 */
@Controller
public class RedirectController
{
    @RequestMapping(value = "/index2",method = RequestMethod.GET)
    public String index()
    {
        return "index";/*进入/jsp/index.jsp*/
    }

    @RequestMapping(value = "/redirect",method = RequestMethod.GET)
    public String redirect()
    {
        /*更改请求到/finalPage，称为页面重定向*/
        return "redirect:finalPage";
    }
    @RequestMapping(value = "/finalPage",method = RequestMethod.GET)
    public String finalPage()
    {/*不进入jsp目录寻找*/
        return "final";
    }
}

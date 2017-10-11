package cn.xufx.controller;
import cn.xufx.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
/**
 * Created by xufuxiu on 2017/8/15.
 */
@Controller
public class UserController
{
    @RequestMapping(value = "user/{name}", method = RequestMethod.GET)
    /*public @ResponseBody
    User user(@PathVariable String name)
    {
        User user=new User();
        user.setName(name);
        user.setId(1100);
        return user;*//*不返回任何视图，页面将显示json数据*//*
    }*/
    public ModelAndView user2(@PathVariable String name)
    {
        User user=new User();
        user.setName(name);
        user.setId(1100);
        ModelAndView mv=new ModelAndView("user","user",user);
        return mv;
    }

}

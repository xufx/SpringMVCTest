package cn.xufx.controller;
import cn.xufx.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by xufuxiu on 2017/8/15.
 */
@Controller
public class UserController
{

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ModelAndView user()
    {
        User user=new User();
        user.setFavoriteFrameworks(
                (new String[]{"Spring MVC","Struts 2","java","spring"})
        );

        /*如果在JSP文件中使用<form:form>标签，spring框架需要一个名称为“command”的对象*/
        ModelAndView modelAndView=new ModelAndView("user","command",user);
        return modelAndView;
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("SpringWeb")User user,
                          ModelMap model) {
        model.addAttribute("username", user.getUsername());
        model.addAttribute("password", user.getPassword());
        model.addAttribute("address", user.getAddress());
        model.addAttribute("receivePaper",user.isReceivePaper());
        model.addAttribute("favoriteFrameworks",user.getFavoriteFrameworks());

        /*userlist.jsp可以通过${username}或${SpringWeb.username}获取*/
        return "userlist";
    }
    /*@ModelAttribute("webFrameworkList")
    @RequestMapping(value = "/")
    public List<String> getWebFrameworkList()
    {
        List<String> webFrameworkList = new ArrayList<String>();
        webFrameworkList.add("Spring MVC");
        webFrameworkList.add("Spring Boot");
        webFrameworkList.add("Struts 2");
        webFrameworkList.add("Apache Hadoop");

        return webFrameworkList;
    }*/
    public List<String> getWebFrameworkList()
    {
        List<String> webFrameworkList = new ArrayList<String>();
        webFrameworkList.add("Spring MVC");
        webFrameworkList.add("Spring Boot");
        webFrameworkList.add("Struts 2");
        webFrameworkList.add("Apache Hadoop");
        return webFrameworkList;
    }
}

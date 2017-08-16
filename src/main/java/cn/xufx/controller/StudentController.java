package cn.xufx.controller;
import cn.xufx.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
/**
 * Created by xufuxiu on 2017/8/15.
 */
@Controller
public class StudentController
{
    /*输入http://localhost:8080/student进行测试*/
    @RequestMapping(value = "/student",method = RequestMethod.GET)
    public ModelAndView student()
    {
        return new ModelAndView("student","command",new Student());
    }

    @RequestMapping(value = "/addStudent",method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("springWeb") Student student, ModelMap model)
    {/*将student.jsp输入的数据封装为student对象，要求path和属性名一致*/
        model.addAttribute("name",student.getName());
        model.addAttribute("age",student.getAge());
        model.addAttribute("id",student.getId());
        return "result";
    }

}

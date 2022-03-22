package controller;

import domain.admin;
import domain.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.adminService;
import service.employeeService;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class employeeController {
    @Autowired
    private employeeService employeeService;

    //查询全部产品
    @RequestMapping("/findAll.do")
    public ModelAndView findAll()throws Exception {
        ModelAndView mv = new ModelAndView();
        List<employee> as= employeeService.findAll();
        mv.addObject("employeeList",as);
        mv.setViewName("employee-list");
        return mv;
    }

    //插入
    @RequestMapping("/saveEmployee.do")
    public String save(employee employee) throws Exception {
        employeeService.saveEmployee(employee);
        return "redirect:findAll.do";
    }
    
}

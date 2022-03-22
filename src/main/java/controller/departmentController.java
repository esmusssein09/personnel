package controller;

import domain.admin;
import domain.department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.departmentService;

import java.util.List;

@Controller
@RequestMapping("/department")
public class departmentController {
    @Autowired
    private service.departmentService departmentService;

    //查询全部产品
    @RequestMapping("findAll.do")
    public ModelAndView findAll()throws Exception {
        ModelAndView mv = new ModelAndView();
        List<department> as= departmentService.findAll();
        mv.addObject("departmentList",as);
        mv.setViewName("department-list");
        return mv;
    }
}

package controller;

import domain.admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.adminService;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class adminController {
    @Autowired
    private adminService adminService;

    //查询全部产品
    @RequestMapping("findAll.do")
    public ModelAndView findAll()throws Exception {
        ModelAndView mv = new ModelAndView();
        List<admin> as= adminService.findAll();
        mv.addObject("adminList",as);
        mv.setViewName("admin-list");
        return mv;
    }

    //插入
    @RequestMapping("/saveAdmin.do")
    public String save(admin admin) throws Exception {
        adminService.saveAdmin(admin);
        return "redirect:findAll.do";
    }

}

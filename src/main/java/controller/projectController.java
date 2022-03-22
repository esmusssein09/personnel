package controller;

import domain.admin;
import domain.project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.adminService;
import service.projectService;

import java.util.List;

@Controller
@RequestMapping("/project")
public class projectController {
    @Autowired
    private projectService projectService;

    //查询全部产品
    @RequestMapping("findAll.do")
    public ModelAndView findAll()throws Exception {
        ModelAndView mv = new ModelAndView();
        List<project> as= projectService.findAll();
        mv.addObject("projectList",as);
        mv.setViewName("project-list");
        return mv;
    }

    //插入
    @RequestMapping("/saveProject.do")
    public String save(project project) throws Exception {
        projectService.saveProject(project);
        return "redirect:findAll.do";
    }
    
}

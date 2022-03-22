package controller;

import domain.admin;
import domain.position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.adminService;
import service.positionService;

import java.util.List;

@Controller
@RequestMapping("/position")
public class positionController {
    @Autowired
    private positionService positionService;

    //查询全部产品
    @RequestMapping("findAll.do")
    public ModelAndView findAll()throws Exception {
        ModelAndView mv = new ModelAndView();
        List<position> as= positionService.findAll();
        mv.addObject("positionList",as);
        mv.setViewName("position-list");
        return mv;
    }

    //插入
    @RequestMapping("/savePosition.do")
    public String save(position position) throws Exception {
        positionService.savePosition(position);
        return "redirect:findAll.do";
    }
    
}

package controller;

import domain.admin;
import domain.notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.adminService;
import service.noticeService;

import java.util.List;

@Controller
@RequestMapping("/notice")
public class noticeController {
    @Autowired
    private noticeService noticeService;

    //查询全部产品
    @RequestMapping("findAll.do")
    public ModelAndView findAll()throws Exception {
        ModelAndView mv = new ModelAndView();
        List<notice> as= noticeService.findAll();
        mv.addObject("noticeList",as);
        mv.setViewName("notice-list");
        return mv;
    }

    //插入
    @RequestMapping("/saveNotice.do")
    public String save(notice notice) throws Exception {
        noticeService.saveNotice(notice);
        return "redirect:findAll.do";
    }
    
}

package service.impl;

import dao.projectDao;
import domain.admin;
import domain.project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.projectService;

import java.util.List;

@Service
@Transactional
public class projectServiceImpl implements projectService {
    @Autowired
    private projectDao projectDao;

    @Override
    //查询全部

    public List<project> findAll()throws Exception{
        return projectDao.findAll();
    }

    //插入
    public void saveProject(project project) throws Exception{}
    //删除
    public void deleteProject(Integer id)throws Exception{}
    //id查询
    public project findById(Integer id)throws Exception{
        return projectDao.findById(id);
    }
}

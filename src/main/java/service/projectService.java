package service;

import domain.admin;
import domain.project;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface projectService {
    //查询全部

    public List<project> findAll()throws Exception;

    //插入
    public void saveProject(project project) throws Exception;
    //删除
    public void deleteProject(Integer id)throws Exception;
    //id查询
    public project findById(Integer id)throws Exception;
}

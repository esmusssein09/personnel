package service;

import domain.admin;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface adminService {

    public List<admin>findAll() throws Exception;
    public void saveAdmin(admin admin) throws Exception;
    public void updateAdmin(admin admin)throws Exception;
    public void deleteAdmin(Integer id)throws Exception;
    public admin findById(Integer id)throws Exception;

    //名字查询
    public List<admin> findByName(String name)throws Exception;

    //查询总用户数
    public int findTotal()throws Exception;
}


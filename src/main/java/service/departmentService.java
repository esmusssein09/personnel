package service;

import domain.department;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface departmentService {
    //查询全部
    public List<department> findAll()throws Exception;
    //插入
    public void saveDepartment(department department)throws Exception;

    //更新
    public void updateDepartment(department department)throws Exception;

    //删除
    public void deleteDepartment(Integer id)throws Exception;

    //id查询
    public department findById(Integer id)throws Exception;

    //名字查询
    public List<department> findByName(String name)throws Exception;

    //查询总用户数
    public int findTotal()throws Exception;

}

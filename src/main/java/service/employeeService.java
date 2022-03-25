package service;

import domain.department;
import domain.employee;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface employeeService extends UserDetailsService {
    //查询全部
    public List<employee> findAll()throws Exception;
    //插入
    public void saveEmployee(employee employee)throws Exception;

    //更新
    public void updateEmployee(employee employee)throws Exception;

    //删除
    public void deleteEmployee(Integer id)throws Exception;

    //id查询
    public employee findById(Integer id)throws Exception;

    //名字查询
    public employee findByName(String name)throws Exception;

    //查询总用户数
    public int findTotal()throws Exception;

    //
}

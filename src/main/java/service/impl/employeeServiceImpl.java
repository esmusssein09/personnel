package service.impl;


import dao.employeeDao;
import domain.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.employeeService;

import java.util.List;

@Service
@Transactional
public class employeeServiceImpl implements employeeService {

    @Autowired
    private dao.employeeDao employeeDao;

    @Override
    //查询全部
    public List<employee> findAll()throws Exception{
        return employeeDao.findAll();
    }
    @Override
    //插入
    public void saveEmployee(employee employee)throws Exception{}
    @Override
    //更新
    public void updateEmployee(employee employee)throws Exception{}

    @Override
    //删除
    public void deleteEmployee(Integer id)throws Exception{}
    @Override
    //id查询
    public employee findById(Integer id)throws Exception{
        return employeeDao.findById(id);
    }

    //名字查询
    public List<employee> findByName(String name)throws Exception{
        return employeeDao.findByName(name);
    }

    //查询总用户数
    public int findTotal()throws Exception{
        return employeeDao.findTotal();
    }
}

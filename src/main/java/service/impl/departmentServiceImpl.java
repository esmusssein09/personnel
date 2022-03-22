package service.impl;

import dao.departmentDao;
import domain.department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.departmentService;

import java.util.List;

@Service
@Transactional
public class departmentServiceImpl implements departmentService {

    @Autowired
    private dao.departmentDao departmentDao;

    @Override
    //查询全部
    public List<department> findAll()throws Exception{
        return departmentDao.findAll();
    }
    @Override
    //插入
    public void saveDepartment(department department)throws Exception{}

    @Override
    //更新
    public void updateDepartment(department department)throws Exception{}

    @Override
    //删除
    public void deleteDepartment(Integer id)throws Exception{}

    @Override
    //id查询
    public department findById(Integer id)throws Exception{
        return departmentDao.findById(id);
    }

    @Override
    //名字查询
    public List<department> findByName(String name)throws Exception{
        return departmentDao.findByName(name);
    }

    @Override
    //查询总用户数
    public int findTotal()throws Exception{
        return departmentDao.findTotal();
    }
}

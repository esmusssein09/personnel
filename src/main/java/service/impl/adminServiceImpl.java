package service.impl;

import dao.adminDao;
import domain.admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.adminService;

import java.util.List;
@Service
@Transactional
public class adminServiceImpl implements adminService {

    @Autowired
    private adminDao adminDao;

    @Override
    public List<admin>findAll()throws Exception{
        return adminDao.findAll();
    }

    @Override
    public void saveAdmin(admin admin) throws Exception{}

    @Override
    public void updateAdmin(admin admin)throws Exception{}
    @Override
    public void deleteAdmin(Integer id)throws Exception{}
    @Override
    public admin findById(Integer id)throws Exception{
        return adminDao.findById(id);
    }
    @Override
    public List<admin> findByName(String name)throws Exception{
        return adminDao.findByName(name);
    }
    @Override
    public int findTotal()throws Exception{
        return adminDao.findTotal();
    }


}

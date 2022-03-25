package service.impl;


import dao.employeeDao;
import domain.Role;
import domain.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.employeeService;

import java.util.ArrayList;
import java.util.List;

@Service("userService")
@Transactional
public class employeeServiceImpl implements employeeService{

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
    public employee findByName(String name)throws Exception{
        return employeeDao.findByName(name);
    }

    //查询总用户数
    public int findTotal()throws Exception{
        return employeeDao.findTotal();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        employee userInfo = null;
        try {
            userInfo = employeeDao.findByName(username);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //处理自己的用户对象封装成UserDetails
        //  User user=new User(userInfo.getUsername(),"{noop}"+userInfo.getPassword(),getAuthority(userInfo.getRoles()));

        User user = new User(userInfo.getName(), userInfo.getPassword(), userInfo.getStatus() == 0 ? false : true, true, true, true, getAuthority(userInfo.getRoles()));

        return user;
    }

    //作用就是返回一个List集合，集合中装入的是角色描述
    public List<SimpleGrantedAuthority> getAuthority(List<Role> roles) {

        List<SimpleGrantedAuthority> list = new ArrayList<>();
        for (Role role : roles) {
            list.add(new SimpleGrantedAuthority("ROLE_" + role.getRoleName()));
        }
        return list;
    }
}

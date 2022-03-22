package service.impl;

import dao.noticeDao;
import dao.positionDao;
import domain.position;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.positionService;

import java.util.List;
@Service
@Transactional
public class positionServiceImpl implements positionService {

    @Autowired
    private positionDao positionDao;

    @Override
    //查询全部
    public List<position> findAll()throws Exception{
        return positionDao.findAll();
    }
    @Override
    //插入

    public void savePosition(position position)throws Exception{}
    @Override
    //删除
    public void deletePosition(Integer id)throws Exception{}
    @Override
    //id查询
    public position findById(Integer id)throws Exception{
        return positionDao.findById(id);
    }
    @Override
    //名字查询
    public List<position> findByName(String name)throws Exception{
        return positionDao.findByName(name);

    }
}

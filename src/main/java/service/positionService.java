package service;

import domain.admin;
import domain.position;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface positionService {
    //查询全部
    public List<position> findAll()throws Exception;

    //插入
    public void savePosition(position position)throws Exception;

    //删除
    public void deletePosition(Integer id)throws Exception;

    //id查询
    public position findById(Integer id)throws Exception;

    //名字查询
    public List<position> findByName(String name)throws Exception;
}

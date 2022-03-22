package dao;

import domain.admin;
import domain.position;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface positionDao {
    //查询全部
    @Select("select * from position ")
    public List<position> findAll()throws Exception;

    //插入
    @Insert("insert into position(id,name,belong)values (#{id},#{name},#{belong})")
    public void savePosition(position position)throws Exception;

    //删除
    @Delete("delete from position where id = #{id}")
    public void deletePosition(Integer id)throws Exception;

    //id查询
    @Select("select * from position where id = #{id}")
    public position findById(Integer id)throws Exception;

    //名字查询
    @Select("select * from position where name = #{name}")
    public List<position> findByName(String name)throws Exception;


}

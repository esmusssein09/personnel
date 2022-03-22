package dao;

import domain.admin;
import domain.project;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface projectDao {
    //查询全部
    @Select("select * from project")
    public List<project> findAll()throws Exception;

    //插入
    @Insert("insert into project(id,name,need_people,num,introduction,state,heaf)values (#{id},#{name},#{need_people},#{num},#{introduction},#{state},#{head})")
    public void saveProject(project project) throws Exception;
    //删除
    @Delete("delete from project where id = #{id}")
    public void deleteProject(Integer id)throws Exception;
    //id查询
    @Select("select * from project where id = #{id}")
    public project findById(Integer id)throws Exception;

}

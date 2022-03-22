package dao;

import domain.admin;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/*
接口
 */
public interface adminDao {
    //查询全部
    @Select("select * from admin")
    public List<admin> findAll()throws Exception;
    //插入
    @Insert("insert into admin(id,password,name)values (#{id},#{password},#{name})")
    public void saveAdmin(admin admin)throws Exception;

    //更新
    @Update("update admin set password values #{password}")
    public void updateAdmin(admin admin)throws Exception;

    //删除
    @Delete("delete from admin where id = #{id}")
    public void deleteAdmin(Integer id)throws Exception;

    //id查询
    @Select("select * from admin where id = #{id}")
    public admin findById(Integer id)throws Exception;

    //名字查询
    @Select("select * from admin where name = #{name}")
    public List<admin> findByName(String name)throws Exception;

    //查询总用户数
    @Select("select * from admin")
    public int findTotal()throws Exception;

}

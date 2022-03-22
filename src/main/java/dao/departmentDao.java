package dao;

import domain.department;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface departmentDao {
    //查询全部
    @Select("select * from department")
    public List<department> findAll()throws Exception;
    //插入
    @Insert("insert into department(id,name,people_num)values (#{id},#{name},#{people_num})")
    public void saveDepartment(department department)throws Exception;

    //更新
    @Update("update department set peopele_num values #{people_num}")
    public void updateDepartment(department department)throws Exception;

    //删除
    @Delete("delete from department where id = #{id}")
    void deleteDepartment(Integer id)throws Exception;

    //id查询
    @Select("select * from department where id = #{id}")

    public department findById(Integer id)throws Exception;

    //名字查询
    @Select("select * from department where name = #{name}")

    public List<department> findByName(String name)throws Exception;

    //查询总用户数
    @Select("select * from department")

    public  int findTotal()throws Exception;


}

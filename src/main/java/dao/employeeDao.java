package dao;

import domain.department;
import domain.employee;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface employeeDao {
    //查询全部
    @Select("select *from employee")
    public List<employee> findAll()throws Exception;
    //插入
    @Insert("insert into employee(id,name,sex,address,age,birth,phone,password,state,department_id,position_id, ,salary,performance,mail,education,politics_status)values (#{id},#{name},#{sex},#{address},#{age},#{birth},#{phone},#{password},#{state},#{department_id},#{position_id} ,#{salary},#{performance},#{mail},#{education},#{politics_status})")
    public void saveEmployee(employee employee)throws Exception;

    //更新
    @Update("update employee set password values #{password}")
    public void updateEmployee(employee employee)throws Exception;

    //删除
    @Delete("delete from employee where id = #{id}")

    public void deleteEmployee(Integer id)throws Exception;

    //id查询
    @Select("select * from employee where id = #{id}")

    public employee findById(Integer id)throws Exception;

    //名字查询

    @Select("select * from employee where name=#{name}")
    /*
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "email", column = "email"),
            @Result(property = "password", column = "password"),
            @Result(property = "phoneNum", column = "phoneNum"),
            @Result(property = "status", column = "status"),
            @Result(property = "roles",column = "id",javaType = java.util.List.class,many = @Many(select = "com.itheima.ssm.dao.IRoleDao.findRoleByUserId"))
    })
*/
    public employee findByName(String name)throws Exception;

    //查询总用户数
    @Select("select * from employee")

    public int findTotal()throws Exception;

    //
}

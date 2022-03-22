package dao;

import domain.admin;
import domain.notice;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface noticeDao {
    //查询全部
    @Select("select * from admin")
    public List<notice> findAll()throws Exception;

    //插入
    @Insert("insert into notice(id,scope,creat_time,content,publisher)values (#{id},#{scope},#{creat_time},#{content},#{publisher})")
    public void saveNotice(notice notice)throws Exception;

    //删除
    @Delete("delete from notice where id = #{id}")
    public void deleteNotice(Integer id)throws Exception;
}

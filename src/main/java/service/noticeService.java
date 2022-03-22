package service;

import domain.notice;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface noticeService {
    //查询全部
    public List<notice> findAll()throws Exception;

    //插入
    public void saveNotice(notice notice)throws Exception;

    //删除
    public void deleteNotice(Integer id)throws Exception;
}

package service.impl;

import dao.noticeDao;
import domain.notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.noticeService;

import java.util.List;

@Service
@Transactional
public class noticeServiceImpl implements noticeService {
    @Autowired
    private noticeDao noticeDao;

    @Override
    //查询全部
    public List<notice> findAll()throws Exception{
        return noticeDao.findAll();
    }

    @Override
    //插入
    public void saveNotice(notice notice)throws Exception{}

    @Override
    //删除
    public void deleteNotice(Integer id)throws Exception{}


}

import dao.adminDao;
import domain.admin;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class MybatisTest {

    private InputStream in;
    private SqlSession sqlSession;
    private adminDao adminDao;

    @Before//用于在测试方法执行之前执行
    public void init()throws Exception{
        //1.读取配置文件，生成字节输入流
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.获取SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //3.获取SqlSession对象
        sqlSession = factory.openSession();
        //4.获取dao的代理对象
        adminDao = sqlSession.getMapper(adminDao.class);
    }

    @After//用于在测试方法执行之后执行
    public void destroy()throws Exception{
        //提交事务
        sqlSession.commit();
        //6.释放资源
        sqlSession.close();
        in.close();
    }

    /**
     * 测试查询所有
     */
    @Test
    public void testFindAll() throws Exception {
        //5.执行查询所有方法
        List<admin> admins = adminDao.findAll();
        for(admin admin : admins){
            System.out.println(admin);
        }

    }

    /**
     * 测试保存操作
     */
    @Test
    public void testSave() throws Exception {
        admin admin = new admin();
        admin.setPassword("123456");
        admin.setName("小丑");

        //5.执行保存方法
        adminDao.saveAdmin(admin);

        System.out.println("保存操作之后："+admin);
    }


}

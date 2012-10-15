package info.lotharschulz.mybatisMappingTest01;

import info.lotharschulz.mybatisMappingTest01.ThingsMapper;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;


public class ThingsDAO {
    private SqlSessionFactory sqlSessionFactory;

    public ThingsDAO() {
        org.apache.ibatis.logging.LogFactory.useLog4JLogging();
        sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
    }

    public List selectAll() {
        System.out.print(sqlSessionFactory);
        SqlSession session = sqlSessionFactory.openSession();
        System.out.print(session);
        try {
            ThingsMapper mapper = session.getMapper(ThingsMapper.class);
            List list = mapper.selectAll();
            System.out.print(list);
            return list;
        } finally {
            session.close();
        }
    }
    
}

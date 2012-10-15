package info.lotharschulz.mybatisMappingTest01;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

public class MyBatisConnectionFactory {
    private static SqlSessionFactory sqlSessionFactory = null;
    private static final Logger log = Logger.getLogger(MyBatisConnectionFactory.class);

    static {
        try {
            String resource = "SqlMapConfig.xml";
            Reader reader = Resources.getResourceAsReader(resource);

            if (null == sqlSessionFactory) {
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
                sqlSessionFactory.getConfiguration().addMapper(ThingsMapper.class);
            }
        } catch (FileNotFoundException fnfExc) {
            log.error("file not found: " + fnfExc.getMessage() + "\n" + fnfExc.toString());  // fileNotFoundException.printStackTrace();
        } catch (IOException iOExc) {
            log.error("i/o error: " + iOExc.getMessage() + "\n" + iOExc.toString());  // iOException.printStackTrace();
        }
    }

    public static SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }
}

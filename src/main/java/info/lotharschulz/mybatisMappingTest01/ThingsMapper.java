package info.lotharschulz.mybatisMappingTest01;

import java.util.List;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface ThingsMapper {
    final String SELECTALL = "SELECT * FROM things";
    
    @Select(SELECTALL)
    @Results(value = {
        @Result(property="ID", column="ID"),
        @Result(property="column_one", column="column_one"),
        @Result(property="prop2", column="column_B")
    })
    List<Things> selectAll();
    
}

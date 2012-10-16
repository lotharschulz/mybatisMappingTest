package info.lotharschulz.mybatisMappingTest01;

import java.util.List;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface ThingsMapper {
    final String SELECTALL = "SELECT * FROM things";
    
    @Select(SELECTALL)
    
    /**
     * @todo
     * 
     * properties müssen gleich heißen, dann kein @results nötig, 
     * bei default einstellung
     * <setting name="autoMappingBehavior" value="PARTIAL"/>
     * 
     * wenn nicht default, sondern
     * <setting name="autoMappingBehavior" value="NONE"/>
     * 
     * @results nötig
     * 
     * für beide fälle ein branch
     * 
     */
    
    @Results(value = {
        @Result(property="ID", column="ID"),
        @Result(property="column_one", column="column_one"),
        @Result(property="column_B", column="column_B")
    })
    List<Things> selectAll();
    
}

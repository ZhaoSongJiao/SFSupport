package support.sf.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import support.sf.entity.BaseEntity;

import java.util.ArrayList;

/**
 * Created by 11544 on 2017/8/17.
 */

@Mapper
public interface BaseMapper {

    @Select("select * from student")
    ArrayList<BaseEntity> getAllEntity();

}

package support.sf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import support.sf.entity.BaseEntity;
import support.sf.mapper.BaseMapper;

import java.util.ArrayList;

/**
 * Created by 11544 on 2017/8/17.
 */
@Service
public class BaseService {

    @Autowired
    private BaseMapper mapper;

    public ArrayList<BaseEntity> getAllBaseEntity()
    {
        return mapper.getAllEntity();
    }
}

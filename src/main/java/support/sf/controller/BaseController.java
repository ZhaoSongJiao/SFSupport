package support.sf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import support.sf.entity.BaseEntity;
import support.sf.service.BaseService;

import java.util.ArrayList;

/**
 * Created by 11544 on 2017/8/17.
 */
@Controller
public class BaseController {

    @Autowired
    private BaseService service;

    @RequestMapping("/base/showall")
    @ResponseBody
    public ArrayList<BaseEntity> getAllBaseEntity()
    {
        return service.getAllBaseEntity();
    }
}

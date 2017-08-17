package support.sf;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 11544 on 2017/8/17.
 */
@SpringBootApplication
@RestController
@MapperScan("support.sf.mapper")
public class Application {

    public static  void main(String[] args)
    {
        SpringApplication.run(Application.class,args);
    }
}

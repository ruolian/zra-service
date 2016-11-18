import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by xiaona on 15/11/22.
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.zra.service.business")
@MapperScan(basePackages = "com.zra.service.business.dao")
public class BusinessServiceApplication {
  public static void main(String[] args) {
    SpringApplication.run(BusinessServiceApplication.class, args);
  }
}

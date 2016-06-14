import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * @version Ver 1.0
 * @Author <a href="mailto:jeffreyji@yeah.net">jeffrey</a>
 * @Date 2016/6/14 18:00.
 */
@SpringBootApplication
@ComponentScan("com.spring.service")
@ImportResource("classpath:dubbo.xml")
public class Client {
    public static void main(String[] args) {
        SpringApplication.run(Client.class,args) ;
    }
}

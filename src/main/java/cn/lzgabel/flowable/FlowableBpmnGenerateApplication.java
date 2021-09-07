package cn.lzgabel.flowable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 〈功能简述〉<br>
 * 〈〉
 *
 * @author lizhi
 * @date 2021-09-07
 * @since 1.0.0
 */

@SpringBootApplication
@ComponentScan(basePackages = "cn.lzgabel")
public class FlowableBpmnGenerateApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlowableBpmnGenerateApplication.class, args);
    }

}

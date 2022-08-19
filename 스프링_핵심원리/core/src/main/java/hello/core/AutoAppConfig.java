package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
//        basePackages = "hello.core", //basePackages: 어디서부터 탐색을 시작할지 지정. 지정하지 않으면 default는 ComponentScan을 붙인 클래스 여기서는 hello.core 부터 뒤지기 시작한다.
        excludeFilters =  @ComponentScan.Filter(type = FilterType.ANNOTATION, classes =  Configuration.class)
)
public class AutoAppConfig {

}

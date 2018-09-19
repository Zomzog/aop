package bzh.zomzog.prez.aop.config;

import bzh.zomzog.prez.aop.aspect.LoggingAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Profile;

@Configuration
@EnableAspectJAutoProxy
public class AopConfiguration {

    @Bean
    @Profile("verbose")
    public LoggingAspect loggingAspect() {
        return new LoggingAspect();
    }
}

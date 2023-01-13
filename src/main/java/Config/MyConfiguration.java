package Config;

import org.example.B;
import org.example.C;
import org.example.F;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean
    public F myF() {
        return new F();
    }

    @Bean
    public B myB() {
        return new B();
    }

    @Bean
    public C myC() {
        return new C();
    }
}

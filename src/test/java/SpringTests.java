import org.example.*;
import Config.MyConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

public class SpringTests {

    @Test
    public void testClassA() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.example");
        A aElement = context.getBean(A.class);
        assertInstanceOf(B.class, aElement.getElement1());
        assertInstanceOf(C.class, aElement.getElement2());
        assertInstanceOf(D.class, aElement.getElement3());
    }

    @Test
    public void testClassB() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        F element = context.getBean(F.class);

        assertEquals("Safet", element.getName());
    }

    @Test
    public void testService() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.example");
        Service service = context.getBean(Service.class);
        AbstractService service1 = context.getBean((AbstractService.class));
        System.out.println(service1.run());
    }

    //Test ideas:
    //todo: 1-test should fail if we try to add couple from package and config.class
    //todo:2- test will fail while using interface and we dont specify which one to use with @Primary
    //todo: 3- test will fail if we set @Qualifier("someName") and bean with this someName doesnt exist
    //todo: 4- test will fail if we set @Autowired and class with this bean doesnt exist
    //todo: 5- test will fail if we set more than one @Primary classes in interface classes
    //todo: 6- test will fail in abstract classes in same scenarios like interfaces (if dont specify one @Primary class or we have more than one @Primary classes
}

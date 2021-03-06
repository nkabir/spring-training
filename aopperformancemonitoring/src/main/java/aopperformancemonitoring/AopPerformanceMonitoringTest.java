package aopperformancemonitoring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ufuk on 18-06-15.
 */
public class AopPerformanceMonitoringTest {

    @Test
    public void aop_performance_monitoring_test() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("aopperformancemonitoringconf.xml");
        MagnitudeComparison mc = context.getBean("magnitudeComparison", MagnitudeComparison.class);

        String max = (mc.maxBrightness(Star.SIRIUS, Star.ALPHA_CENTAURI, Star.RIGEL)).toString();
        System.out.printf("%s has the maximum brightness\n\n", max);

        String min = (mc.minBrightness(Star.SIRIUS, Star.ALPHA_CENTAURI, Star.RIGEL)).toString();
        System.out.printf("%s has the minimum brightness\n\n", min);
    }
}

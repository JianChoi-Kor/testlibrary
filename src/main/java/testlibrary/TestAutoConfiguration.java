package testlibrary;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class TestAutoConfiguration {

    @Bean
    public TestUtils testUtils() {
        return new TestUtils();
    }
}

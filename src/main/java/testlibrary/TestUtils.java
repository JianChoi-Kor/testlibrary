package testlibrary;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;

@Slf4j
public class TestUtils {

    @Value("${test.library.id}")
    private String id;

    @PostConstruct
    public void init() {
        log.info("===== init testUtils =====");
    }

    public String something() {
        log.info("===== something method =====");
        return "something";
    }
}

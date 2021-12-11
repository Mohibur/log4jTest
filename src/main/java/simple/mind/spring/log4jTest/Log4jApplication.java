package simple.mind.spring.log4jTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.log4j.Log4j2;

@SpringBootApplication
@Log4j2
public class Log4jApplication {

  public static void main(String[] args) {
    log.info("I am here");
    SpringApplication.run(Log4jApplication.class, args);
  }

}

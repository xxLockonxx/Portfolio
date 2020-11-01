package kr.co.jessiemarket;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("kr.co.jessiemarket")
public class JessiemarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(JessiemarketApplication.class, args);
	}

}

package za.co.bbd.cloneme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages = {"za.co.bbd.cloneme"},
		exclude = {DataSourceAutoConfiguration.class })
public class ClonemeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClonemeApplication.class, args);
	}

}

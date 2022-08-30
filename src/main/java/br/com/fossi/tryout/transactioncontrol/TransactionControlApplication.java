package br.com.fossi.tryout.transactioncontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class TransactionControlApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionControlApplication.class, args);
	}

}

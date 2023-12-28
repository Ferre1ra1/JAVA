package br.com.alura.screenmatch;

import br.com.alura.screenmatch.Service.ConsumoAPI;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//CommandLineRunner: Interface que permite realizar chamads no metodo principal
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String apiKey = "ab2be20e";
		var comsumoAPI = new ConsumoAPI();
		var json = comsumoAPI.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey="+apiKey);
		System.out.println(json);
	}
}

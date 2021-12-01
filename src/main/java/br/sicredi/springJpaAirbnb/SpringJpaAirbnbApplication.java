package br.sicredi.springJpaAirbnb;

import br.sicredi.springJpaAirbnb.domain.Imovel;
import br.sicredi.springJpaAirbnb.domain.TiposImovel;
import br.sicredi.springJpaAirbnb.repository.ImovelRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringJpaAirbnbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaAirbnbApplication.class, args);

	}
//
//	@Bean
//	public CommandLineRunner demo(ImovelRepository repository) {
//
//		return (args) -> {
//			// save a few customers
//			repository.save(new Imovel("Jack", 200, TiposImovel.CASA));
//			repository.save(new Imovel("Chloe", 678, TiposImovel.CASA));
//			repository.save(new Imovel("Kim", 345, TiposImovel.APARTAMENTO));
//		};
//	}
}

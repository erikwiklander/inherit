package io.wiklandia.inherite;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.hateoas.RelProvider;

import java.util.Arrays;

@Slf4j
@SpringBootApplication
public class InheriteApplication {

	public static void main(String[] args) {
		SpringApplication.run(InheriteApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(BaseRepository baseRepository) {
		return args -> {
			Car c = new Car();
			baseRepository.saveAll(Arrays.asList(new Car(), new Bike(), new Car()));
		};
	}

	@Bean
	public RelProvider relProvider() {
		return new RelProvider() {
			@Override
			public String getItemResourceRelFor(Class<?> aClass) {
				return "property";
			}

			@Override
			public String getCollectionResourceRelFor(Class<?> aClass) {
				return "properties";
			}

			@Override
			public boolean supports(Class<?> delimiter) {
				log.info("Awesome! {}", delimiter);
				return delimiter.isAssignableFrom(Base.class);
			}
		};
	}

}

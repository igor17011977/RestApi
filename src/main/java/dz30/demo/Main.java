package dz30.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Main {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product(1, "Car", 25000));
		list.add(new Product(2, "Motobike", 10000));
		list.add(new Product(3, "Bike", 5000));
		SpringApplication.run(Main.class, args);
	}

}

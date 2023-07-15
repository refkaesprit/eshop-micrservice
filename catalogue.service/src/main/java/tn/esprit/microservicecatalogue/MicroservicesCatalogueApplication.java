package tn.esprit.microservicecatalogue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroservicesCatalogueApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicesCatalogueApplication.class, args);
    }

}

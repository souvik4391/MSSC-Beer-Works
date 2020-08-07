package com.example.msscbeerservice.bootstrap;

import com.example.msscbeerservice.domain.Beer;
import com.example.msscbeerservice.repository.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {

        if(beerRepository.count()==0){

            beerRepository.save(Beer.builder()
                    .beerName("Corona")
                    .beerStyle("Draught")
                    .quantityToBrew(200)
                    .minOnHand(12)
                    .upc(21378720021L)
                    .price(new BigDecimal("12.35"))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Peter Ale")
                    .beerStyle("Wheat")
                    .quantityToBrew(100)
                    .minOnHand(13)
                    .upc(21378239021L)
                    .price(new BigDecimal("19.35"))
                    .build());
        }

    }
}

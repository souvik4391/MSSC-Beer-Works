package com.example.msscbeerservice.web.controller;

import com.example.msscbeerservice.web.model.BeerDto;
import com.example.msscbeerservice.web.model.BeerStyleEnum;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

//    @GetMapping("/{beerId}")
//    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId){
//        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
//    }

    @GetMapping("/{beerId}")
    public BeerDto getBeerById(@PathVariable("beerId") UUID beerId){

        return  BeerDto.builder().id(beerId)
                .beerName("Test Beer")
                .beerStyle(BeerStyleEnum.DRAUGHT)
                .build();

    }


//    @PostMapping
//    public  ResponseEntity saveNewBeer(@RequestBody BeerDto beerDto)
//    {
//        return new ResponseEntity(HttpStatus.CREATED);
//    }

    @PostMapping
    public  BeerDto saveNewBeer(@RequestBody BeerDto beerDto)
    {
        return BeerDto.builder().id(UUID.randomUUID()).build();
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerById(@PathVariable("beerId") UUID beerId){
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{beerId}")
    public ResponseEntity deleteBeerById(@PathVariable("beerId") UUID beerId){
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}

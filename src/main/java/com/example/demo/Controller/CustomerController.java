package com.example.demo.Controller;


import com.example.demo.Entities.CustomerEntity;
import com.example.demo.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    CustomerService service;

    @PostMapping
    public ResponseEntity save(@RequestBody CustomerEntity customer){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(customer));
    }

    @GetMapping
    public ResponseEntity findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.findById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity update(@RequestBody CustomerEntity customer, @PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body(service.update(id,customer));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body(service.delete(id));
    }

}

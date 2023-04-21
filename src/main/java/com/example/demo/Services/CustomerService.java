package com.example.demo.Services;

import com.example.demo.Entities.CustomerEntity;
import com.example.demo.Repositories.CustomerReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    CustomerReposity reposity;

    public CustomerEntity save(CustomerEntity customer){
        if (reposity.findById(customer.getIdCustomer()).isPresent()){
            return null;
        }else {
            return reposity.save(customer);
        }
    }

    public List<CustomerEntity> findAll(){
        return  reposity.findAll();
    }

    public  CustomerEntity findById(int id){
        Optional<CustomerEntity> optional = reposity.findById(id);

        if (optional.isPresent()){
            return optional.get();
        }else{
            return null;
        }
    }

    public  CustomerEntity update(int id, CustomerEntity newCustomer){
        CustomerEntity customer = reposity.findById(id).get();

        if (customer!=null){
            customer.setBirthday(newCustomer.getBirthday());
            customer.setGender(newCustomer.getGender());
            customer.setName(newCustomer.getName());
            return reposity.save(customer);
        }else{
            return null;
        }
    }

    public boolean delete(int id){
        Optional<CustomerEntity> optional = reposity.findById(id);

        if (optional.isPresent()){
            reposity.delete(optional.get());
            return true;
        }else{
            return false;
        }
    }

}

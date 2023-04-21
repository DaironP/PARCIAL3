package com.example.demo.Repositories;

import com.example.demo.Entities.BillEntity;
import com.example.demo.Entities.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BillRepository extends JpaRepository<BillEntity,String> {

    //List<BillEntity> findByType_pay(Pay type_pay);
    List<BillEntity> findByCustomer(CustomerEntity customer);
    //List<BillEntity> findByDate_billBetween(LocalDate startDate, LocalDate endDate);



    //@Query("SELECT b FROM Bill b WHERE b.fecha BETWEEN :start AND :end")
    //List<BillEntity> findBillsByDateRange(@Param("start") LocalDate start, @Param("end") LocalDate end);

}

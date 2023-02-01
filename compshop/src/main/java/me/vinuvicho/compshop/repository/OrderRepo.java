package me.vinuvicho.compshop.repository;

import me.vinuvicho.compshop.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer> {

    @Modifying
    @Transactional
    @Query("update Computer set stock = stock - 1 where computerId = ?1")
    void decreaseComputerStock(Integer computerId);
}

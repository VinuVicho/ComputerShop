package me.vinuvicho.compshop.service;

import lombok.AllArgsConstructor;
import me.vinuvicho.compshop.entity.Order;
import me.vinuvicho.compshop.entity.computer.Computer;
import me.vinuvicho.compshop.repository.ComputerRepo;
import me.vinuvicho.compshop.repository.OrderRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderService {

    private final OrderRepo orderRepo;
    private final ComputerRepo<? extends Computer> computerRepo;

    public String orderComputer(Order order, Integer computerId) {
        if (isValidEmailAddress(order.getUserEmail())) {
            Computer computer = computerRepo.findByComputerId(computerId);
            if (computer.getStock() > 0) {
                orderRepo.decreaseComputerStock(computerId);
                order.setComputer(computer);
                orderRepo.save(order);
                return "Order created, wait for email with further instructions";
            }
            return "No Computer in Stock";
        }
        return "Email validation failed";
    }

    public List<Order> getAllOrders() {
        return orderRepo.findAll();
    }

    public boolean isValidEmailAddress(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }
}

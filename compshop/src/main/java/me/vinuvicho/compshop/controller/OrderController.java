package me.vinuvicho.compshop.controller;

import lombok.AllArgsConstructor;
import me.vinuvicho.compshop.entity.Computer;
import me.vinuvicho.compshop.entity.Order;
import me.vinuvicho.compshop.entity.Smartphone;
import me.vinuvicho.compshop.service.ComputerService;
import me.vinuvicho.compshop.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/shop")
@AllArgsConstructor
public class OrderController {

    private ComputerService computerService;
    private OrderService orderService;

    @GetMapping()
    public String displayAllProducts(Model model) {
        List<Computer> computers = computerService.getAllComputers();
        model.addAttribute("computers", computers);
        return "all-computers";
    }

    @GetMapping("/{computerId}")
    public String viewComputer(@PathVariable Long computerId, Model model) {
        model.addAttribute("newOrder", new Order());
        Computer computer = computerService.getComputerById(computerId);
        model.addAttribute("computer", computer);
//        if (computer instanceof Smartphone smartphone) {
//            model.addAttribute("smartphone", smartphone);
//            model.addAttribute("type", "Smartphone");
//        }
        return "computer";
    }
}

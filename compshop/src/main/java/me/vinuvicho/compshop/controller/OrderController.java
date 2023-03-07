package me.vinuvicho.compshop.controller;

import lombok.AllArgsConstructor;
import me.vinuvicho.compshop.entity.computer.Computer;
import me.vinuvicho.compshop.entity.Order;
import me.vinuvicho.compshop.service.ComputerService;
import me.vinuvicho.compshop.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/shop")
@AllArgsConstructor
public class OrderController {

    private ComputerService computerService;
    private OrderService orderService;

    @GetMapping()
    public String displayAllProducts(Model model) {
        model.addAttribute("computers", computerService.getAllComputers());
        return "all-computers";
    }

    @GetMapping("/orders")
    public String viewOrders(Model model) {
        model.addAttribute("orders", orderService.getAllOrders());
        return "all-orders";
    }

    @GetMapping("/{computerId}")
    public String viewComputer(@PathVariable Integer computerId, Model model) {
        model.addAttribute("newOrder", new Order());
        Computer computer = computerService.getComputerById(computerId);
        model.addAttribute("computer", computer);
        return "computer";
    }

    @PostMapping("/{computerId}/buy")
    public String orderComputer(@PathVariable Integer computerId, @ModelAttribute Order order, Model model) {
        model.addAttribute("response", orderService.orderComputer(order, computerId));
        return "order-response";
    }

    @GetMapping("/desktop_computers")
    public String displayAllDesktopComputers(Model model) {
        model.addAttribute("computers", computerService.getAllDesktops());
        return "all-computers";
    }

    @GetMapping("/laptops")
    public String displayAllLaptops(Model model) {
        model.addAttribute("computers", computerService.getAllLaptops());
        return "all-computers";
    }

    @GetMapping("/smartphones")
    public String displayAllSmartphones(Model model) {
        model.addAttribute("computers", computerService.getAllSmartphones());
        return "all-computers";
    }
}

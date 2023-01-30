package me.vinuvicho.compshop.controller;

import lombok.AllArgsConstructor;
import me.vinuvicho.compshop.entity.Computer;
import me.vinuvicho.compshop.entity.Smartphone;
import me.vinuvicho.compshop.service.ComputerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.TransactionSystemException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/computer")
public class ComputerController {
    private final ComputerService computerService;

    @GetMapping("/all")
    public ResponseEntity<List<Computer>> getAllComputers() {
        return new ResponseEntity<>(computerService.getAllComputers(), HttpStatus.OK);
    }

    @PostMapping("/new")
    public ResponseEntity<Computer> addSmartphone(@RequestBody Smartphone smartphone) {
        Smartphone createdSmartphone = computerService.createSmartphone(smartphone);
        return new ResponseEntity<>(createdSmartphone, HttpStatus.CREATED);
    }

    @GetMapping("/{computerId}")
    public ResponseEntity<Computer> findById(@PathVariable Long computerId) {
        return new ResponseEntity<>(computerService.getComputerById(computerId), HttpStatus.OK);
    }
}

package me.vinuvicho.compshop.service;

import lombok.AllArgsConstructor;
import me.vinuvicho.compshop.entity.Computer;
import me.vinuvicho.compshop.entity.Laptop;
import me.vinuvicho.compshop.entity.Smartphone;
import me.vinuvicho.compshop.repository.ComputerRepo;
import me.vinuvicho.compshop.repository.LaptopRepo;
import me.vinuvicho.compshop.repository.SmartphoneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ComputerService {

    private final ComputerRepo<? extends Computer> computerRepo;
    private final LaptopRepo laptopRepo;
    private final SmartphoneRepo smartphoneRepo;

    public Computer getComputerById(Long id) {
        return computerRepo.findByComputerId(id);
    }

    public boolean createLaptop(Long cores, Long screen) {
        try {
            Laptop laptop = new Laptop();
            laptop.setCores(cores);
            laptop.setScreen(screen);
            laptopRepo.save(laptop);
        } catch (Exception exception) {
            return false;
        }
        return true;
    }

    public Smartphone createSmartphone(Smartphone smartphone) {
        try {
            return smartphoneRepo.save(smartphone);
        } catch (Exception exception) {
            System.out.println("ERROR");
        }
        return null;
    }

    public List<Computer> getAllComputers() {
        List<Computer> computers = new ArrayList<>(computerRepo.findAll());
        System.out.println(computers);
        return computers;
    }

}

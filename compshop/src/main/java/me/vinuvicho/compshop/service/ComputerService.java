package me.vinuvicho.compshop.service;

import lombok.AllArgsConstructor;
import me.vinuvicho.compshop.entity.computer.*;
import me.vinuvicho.compshop.repository.ComputerRepo;
import me.vinuvicho.compshop.repository.DesktopComputerRepo;
import me.vinuvicho.compshop.repository.LaptopRepo;
import me.vinuvicho.compshop.repository.SmartphoneRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ComputerService {

    private final ComputerRepo<? extends Computer> computerRepo;
    private final LaptopRepo laptopRepo;
    private final SmartphoneRepo smartphoneRepo;
    private final DesktopComputerRepo desktopComputerRepo;

    public Computer getComputerById(Integer id) {
        return computerRepo.findByComputerId(id);
    }

    public List<Computer> getAllComputers() {
        ArrayList<Computer> computers = new ArrayList<>(computerRepo.findAll());
        if (computers.size() == 0) return fillDatabase();
        return computers;
    }

    public List<DesktopComputer> getAllDesktops() {
        return new ArrayList<>(desktopComputerRepo.findAll());
    }

    public List<Laptop> getAllLaptops() {
        return new ArrayList<>(laptopRepo.findAll());
    }

    public List<Smartphone> getAllSmartphones() {
        return new ArrayList<>(smartphoneRepo.findAll());
    }

    public Smartphone createSmartphone(Smartphone smartphone) {
        return smartphoneRepo.save(smartphone);
    }

    public List<Computer> fillDatabase() {
        List<Computer> allDevices = new ArrayList<>();
        Smartphone smartphone = new Smartphone("Xiaomi Mi Mix 3", "Cool smartphone without camera on display", 300.0, 3);
        smartphone.setMemory(new ComputerProperty("Memory", "128GB", 20.20));
        smartphone.setProcessor(new ComputerProperty("Processor", "Qualcomm Snapdragon 845", 169.96));
        smartphone.setCamera(new ComputerProperty("Camera", "12MP + 12MP", 78.0));
        allDevices.add(smartphone);
        smartphone = new Smartphone("Iphone X", "Smartphone with huge eyebrow", 380.85, 2);
        smartphone.setMemory(new ComputerProperty("Memory", "64GB", 10.10));
        smartphone.setProcessor(new ComputerProperty("Processor", "Apple A11 Bionic Neural", 120.01));
        smartphone.setCamera(new ComputerProperty("Camera", "12MP + 12MP", 78.0));
        allDevices.add(smartphone);
        String description = "ASUS S500MC is a powerful, stylish and versatile PC suitable for a wide range of tasks, " +
                "from ubiquitous content creation and working from home to online learning and light gaming.";
        DesktopComputer desktopComputer = new DesktopComputer("Asus S500MC-5114000460", description, 1090.77, 4);
        desktopComputer.setProcessor(new ComputerProperty("Processor", "Intel Core i5-11400 (2.6 — 4.4 GHz)", 173.95));
        desktopComputer.setMemory(new ComputerProperty("Memory", "SSD 512Gb", 34.09));
        desktopComputer.setMotherboard(new ComputerProperty("Motherboard", "Asus Intel® B560", 148.62));
        desktopComputer.setGraphicCard(new ComputerProperty("GraphicCard", "Asus GeForce RTX 3060 12GB GDDR6", 463.58));
        allDevices.add(desktopComputer);
        description = "`ARTLINE Gaming` personal computers are created specifically for those who want to personally create a real home entertainment center on their basis.";
        desktopComputer = new DesktopComputer("ARTLINE Gaming X57 v37", description, 1134.37, 1);
        desktopComputer.setProcessor(new ComputerProperty("Processor", "Intel Core i5-11400 (2.6 — 4.4 GHz)", 173.95));
        desktopComputer.setMemory(new ComputerProperty("Memory", "SSD 480Gb + HDD 2Tb", 128.14));
        desktopComputer.setMotherboard(new ComputerProperty("Motherboard", "Intel B560 (PRIME B560M-A)", 119.96));
        desktopComputer.setGraphicCard(new ComputerProperty("GraphicCard", "GeForce RTX 3060 Ti", 550.81));
        allDevices.add(desktopComputer);
        description = "This Chromebook is light, portable, durable, and productive—the perfect everyday study aid.";
        Laptop laptop = new Laptop("Lenovo Chromebook 100e", description, 182.78, 2);
        laptop.setProcessor(new ComputerProperty("Processor", "AMD Dual-Core A4-9120 (2.2 - 2.5 GHz)", 38.18));
        laptop.setMemory(new ComputerProperty("Memory", "HDD 32Gb", 21.87));
        laptop.setWeight(new ComputerProperty("Weight", "1.26 kg", 0.0));
        allDevices.add(laptop);
        description = "The Lenovo ThinkPad E550 is a laptop designed for everyday use that has powerful processing and plenty of features.";
        laptop = new Laptop("Lenovo Thinkpad E550", description, 248.00, 6);
        laptop.setProcessor(new ComputerProperty("Processor", "Intel Core i3-5005u", 137.0));
        laptop.setMemory(new ComputerProperty("Memory", "SSD 250GB", 59.99));
        laptop.setWeight(new ComputerProperty("Weight", "2.35 kg", 0.0));
        allDevices.add(laptop);
        return computerRepo.saveAll(allDevices);
    }
}

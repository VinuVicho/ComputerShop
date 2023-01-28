package me.vinuvicho.compshop;

import me.vinuvicho.compshop.entity.Computer;
import me.vinuvicho.compshop.entity.Laptop;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Laptop();
        System.out.println(computer.getId());
    }
}

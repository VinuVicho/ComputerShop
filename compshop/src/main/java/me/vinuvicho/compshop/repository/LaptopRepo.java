package me.vinuvicho.compshop.repository;

import me.vinuvicho.compshop.entity.computer.Laptop;

import javax.transaction.Transactional;

@Transactional
public interface LaptopRepo extends ComputerBaseRepo<Laptop> {
}

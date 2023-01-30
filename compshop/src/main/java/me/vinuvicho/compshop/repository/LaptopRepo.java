package me.vinuvicho.compshop.repository;

import me.vinuvicho.compshop.entity.Laptop;

import javax.transaction.Transactional;

@Transactional
public interface LaptopRepo extends ComputerBaseRepo<Laptop> {
}

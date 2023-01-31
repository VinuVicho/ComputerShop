package me.vinuvicho.compshop.repository;

import me.vinuvicho.compshop.entity.computer.Smartphone;

import javax.transaction.Transactional;

@Transactional
public interface SmartphoneRepo extends ComputerBaseRepo<Smartphone> {
}

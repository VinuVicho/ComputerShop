package me.vinuvicho.compshop.repository;

import me.vinuvicho.compshop.entity.Smartphone;

import javax.transaction.Transactional;

@Transactional
public interface SmartphoneRepo extends ComputerBaseRepo<Smartphone> {
}

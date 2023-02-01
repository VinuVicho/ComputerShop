package me.vinuvicho.compshop.repository;

import me.vinuvicho.compshop.entity.computer.Computer;

import javax.transaction.Transactional;

@Transactional
public interface ComputerRepo<T extends Computer> extends ComputerBaseRepo<Computer> {

}

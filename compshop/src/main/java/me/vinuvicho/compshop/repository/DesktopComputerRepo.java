package me.vinuvicho.compshop.repository;

import me.vinuvicho.compshop.entity.computer.DesktopComputer;

import javax.transaction.Transactional;

@Transactional
public interface DesktopComputerRepo extends ComputerBaseRepo<DesktopComputer> {

}

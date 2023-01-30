package me.vinuvicho.compshop.repository;

import me.vinuvicho.compshop.entity.Computer;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface ComputerRepo<T extends Computer> extends ComputerBaseRepo<Computer> {
//    List<Computer> getAll();

}

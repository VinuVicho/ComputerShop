package me.vinuvicho.compshop.repository;

import me.vinuvicho.compshop.entity.Computer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface ComputerBaseRepo <T extends Computer> extends JpaRepository<T, Long> {
    T findByComputerId(Long Id);
}

package br.com.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.springboot.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

    public List<User> findByIdGreaterThan(Long id);

    public List<User> findByNameIgnoreCase(String name);

}

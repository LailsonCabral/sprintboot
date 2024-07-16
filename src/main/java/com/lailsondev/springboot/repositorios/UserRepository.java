package com.lailsondev.springboot.repositorios;

import com.lailsondev.springboot.entidades.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}

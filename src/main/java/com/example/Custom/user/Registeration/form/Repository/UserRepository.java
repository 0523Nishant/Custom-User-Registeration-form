package com.example.Custom.user.Registeration.form.Repository;

import com.example.Custom.user.Registeration.form.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

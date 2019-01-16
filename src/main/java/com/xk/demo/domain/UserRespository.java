package com.xk.demo.domain;


import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<User, Long> {
    User findByUserName(String userName);

    User findByUserNameOrId(String userName, Long id);
}

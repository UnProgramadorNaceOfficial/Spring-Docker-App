package com.example.repository;

import com.example.entity.User;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends ListCrudRepository<User, Long> {
}

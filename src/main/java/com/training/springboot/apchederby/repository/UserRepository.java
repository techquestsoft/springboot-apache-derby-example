package com.training.springboot.apchederby.repository;

import com.training.springboot.apchederby.model.UserRecord;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserRecord, String> {
}

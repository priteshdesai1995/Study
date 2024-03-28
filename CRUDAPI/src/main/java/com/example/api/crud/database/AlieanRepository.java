package com.example.api.crud.database;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.api.crud.model.Aliean;

@Repository
public interface AlieanRepository extends CrudRepository<Aliean, Long> {

}

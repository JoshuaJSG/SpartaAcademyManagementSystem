package com.sparta.e44.repositories;

import com.sparta.e44.entities.ModuleEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModuleRepository extends CrudRepository<ModuleEntity,Integer> {
}
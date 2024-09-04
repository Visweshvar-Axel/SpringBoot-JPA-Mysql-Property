package com.property.JPAPropertyArrayList.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.property.JPAPropertyArrayList.entity.Property;

@Repository
public interface PropertyRepo extends JpaRepository<Property, Long> {
}

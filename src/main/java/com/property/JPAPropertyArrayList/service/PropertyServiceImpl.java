package com.property.JPAPropertyArrayList.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.property.JPAPropertyArrayList.entity.Property;
import com.property.JPAPropertyArrayList.repository.PropertyRepo;

@Service
public class PropertyServiceImpl implements PropertyService {
    @Autowired
    private PropertyRepo propertyRepo;

    @Override
    public Property addProperty(Property property) {
        return propertyRepo.save(property);
    }

    @Override
    public List<Property> getAll() {
        return propertyRepo.findAll();
    }
}

package com.property.JPAPropertyArrayList.service;

import java.util.List;

import com.property.JPAPropertyArrayList.entity.Property;

public interface PropertyService {

    Property addProperty(Property property);

    List<Property> getAll();

}
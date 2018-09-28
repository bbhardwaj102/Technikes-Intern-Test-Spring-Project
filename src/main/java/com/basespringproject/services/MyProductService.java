package com.basespringproject.services;

import java.util.List;

import org.springframework.context.annotation.Scope;

import com.basespringproject.entities.MyProduct;


@Scope(value = "request")

public interface MyProductService {

public MyProduct findOne(Long pid);

public void save(MyProduct registrations);

List<MyProduct> findAll();

public void delete(Long pid);
}


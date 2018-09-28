package com.basespringproject.repositories;

import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.basespringproject.entities.MyProduct;

@Repository
@Scope(value = "request")

public interface MyProductRepository extends JpaRepository<MyProduct, Long> {
}


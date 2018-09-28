package com.basespringproject.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.basespringproject.entities.MyProduct;
import com.basespringproject.repositories.MyProductRepository;
import com.basespringproject.services.MyProductService;

@Service
@Transactional
@Scope(value = "request")

public class MyProductServiceImpl implements MyProductService {

    @Resource
    private MyProductRepository myProductRepository;

	public MyProduct findOne(Long pid) {
		return myProductRepository.findOne(pid);
	}

	public void save(MyProduct registrations) {
		myProductRepository.save(registrations);
	}

	public List<MyProduct> findAll() {
		return myProductRepository.findAll();
	}

	public void delete(Long pid) {
		myProductRepository.delete(pid);
	}
}

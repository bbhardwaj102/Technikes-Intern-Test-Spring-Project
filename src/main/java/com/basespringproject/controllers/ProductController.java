package com.basespringproject.controllers;

import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.basespringproject.entities.MyProduct;
import com.basespringproject.services.MyProductService;
import com.basespringproject.utils.SortMyProductByPIdAsc;

@Scope("request")
@RequestMapping(value = "/")
@Controller
public class ProductController {

    @Autowired
    MyProductService myProductService;
    
    @Autowired
    ThreadPoolTaskExecutor taskExecutor;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String register(Model model, HttpServletRequest request) {
    	
    	List<MyProduct> list = myProductService.findAll();
    	Collections.sort(list, new SortMyProductByPIdAsc());
    	model.addAttribute("listOfProducts", list);
        return "index";
    }
}
package com.nestdigital.reciepebackendapp1.controller;

import com.nestdigital.reciepebackendapp1.dao.ReciepeDao;
import com.nestdigital.reciepebackendapp1.model.ReciepeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReciepeController {
    @Autowired
    private ReciepeDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path="/addreciepe",consumes = "application/json",produces = "application/json")
    public String reciepe(@RequestBody ReciepeModel reciepe){
        dao.save(reciepe);
        return "{status:'success'}";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewreciepe")
    public List<ReciepeModel> viewreciepe(){
        return (List<ReciepeModel>) dao.findAll();
    }
}

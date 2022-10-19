package com.nestdigital.reciepebackendapp1.dao;

import com.nestdigital.reciepebackendapp1.model.ReciepeModel;
import org.springframework.data.repository.CrudRepository;

public interface ReciepeDao extends CrudRepository<ReciepeModel,Integer> {
}

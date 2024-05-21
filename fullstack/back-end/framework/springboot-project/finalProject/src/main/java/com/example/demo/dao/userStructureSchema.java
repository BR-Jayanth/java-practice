package com.example.demo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.modal.userInfo;

public interface userStructureSchema extends MongoRepository<userInfo,String> {

}

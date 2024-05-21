package com.example.demo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.modal.client;

public interface ClientStructureSchema extends MongoRepository<client,Integer> {

}

package com.example.demo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.modal.StudentInfo;

public interface StudentStructureSchemaofDb extends MongoRepository<StudentInfo,Integer>  {

}

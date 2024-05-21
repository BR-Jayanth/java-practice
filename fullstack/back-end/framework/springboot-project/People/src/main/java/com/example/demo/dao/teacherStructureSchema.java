package com.example.demo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.modal.teacher;

public interface teacherStructureSchema extends MongoRepository<teacher,Integer> {

}

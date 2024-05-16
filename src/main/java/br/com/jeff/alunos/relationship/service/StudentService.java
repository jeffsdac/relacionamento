package br.com.jeff.alunos.relationship.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.jeff.alunos.relationship.models.Student;
import jakarta.transaction.Transactional;

@Component
public class StudentService {
    @Autowired
    StudentDb db;

    @Autowired
    ClassDb cdb;

    @Transactional
    public List<Student> getAll(){
        return db.findAll();
    }

    public List<Student> getByClassId(int id){
        br.com.jeff.alunos.relationship.models.Class c = cdb.findById(id).get();
        return db.findByIdc(c);
    }
}

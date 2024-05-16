package br.com.jeff.alunos.relationship.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.jeff.alunos.relationship.models.Class;

@Component
public class ClassService {
    @Autowired
    ClassDb db;

    public List<br.com.jeff.alunos.relationship.models.Class> getAll(){
        return db.findAll();
    }

    public Class getById(int id){
        db.findById(id).get();
        return db.findById(id).get();
    }
}

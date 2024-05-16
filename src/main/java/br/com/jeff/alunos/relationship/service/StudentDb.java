package br.com.jeff.alunos.relationship.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jeff.alunos.relationship.models.Class;
import br.com.jeff.alunos.relationship.models.Student;

@Repository
public interface StudentDb extends JpaRepository<Student, Integer>{
    List<Student> findByIdc(Class c);
}

package br.com.jeff.alunos.relationship.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassDb  extends JpaRepository<br.com.jeff.alunos.relationship.models.Class, Integer>{
}

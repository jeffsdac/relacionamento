package br.com.jeff.alunos.relationship.models;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="T_SCHOOL_CLASSES")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Class {
    @Id
    @Column(name="CLASSID")
    private int classId;

    @Column(name="CLASSNAME")
    private String className;

}

package br.com.jeff.alunos.relationship.models;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="T_SCHOOL_STUDENTS")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {
    @Id    
    private int id;

    private String name;

    private int age;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="CLASSID",referencedColumnName = "CLASSID")
    private Class idc;
}

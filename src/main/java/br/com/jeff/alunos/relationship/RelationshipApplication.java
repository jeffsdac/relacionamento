package br.com.jeff.alunos.relationship;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import br.com.jeff.alunos.relationship.models.Student;
import br.com.jeff.alunos.relationship.service.StudentService;

@SpringBootApplication
public class RelationshipApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(RelationshipApplication.class, args);

		StudentService service = context.getBean(StudentService.class);

		List<Student> estudantes = service.getByClassId(3);
		
		for(Student estudante : estudantes){
			System.out.println(estudante);
		}
	}

}

package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestaCurso {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		cursos.sort(Comparator.comparingInt(Curso::getAlunos));

		cursos.forEach(curso -> System.out
				.println(String.format("Curso: %s, Alunos: %s ", curso.getNome(), curso.getAlunos())));

		cursos.stream().filter(curso -> curso.getAlunos() > 50).forEach(curso -> System.out
				.println(String.format("Curso: %s, Alunos: %s ", curso.getNome(), curso.getAlunos())));

		Stream<String> nomesCurso = cursos.stream().map(Curso::getNome);

		nomesCurso.forEach(System.out::println);

		cursos.stream().filter(c -> c.getAlunos() > 50).map(Curso::getAlunos).forEach(System.out::println);

		Optional<Curso> optionalPrimeiro = cursos.stream().filter(c -> c.getAlunos() > 50).findFirst();

		System.out.println(optionalPrimeiro.get().getNome());
		
		Stream<Curso> stream = cursos.stream()
				   .filter(c -> c.getAlunos() > 50);
		
		List<Curso> collect = stream.collect(Collectors.toList());
		
		System.out.println(collect.getClass());
		

	}

}

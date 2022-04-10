package java8;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class TestaDataHora {

	public static void main(String[] args) {

		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);

		LocalDate futuro = LocalDate.of(2099, 1, 25);
		System.out.println(futuro);

		Period period = Period.between(hoje, futuro);
		System.out.println(period);

		System.out.println(hoje.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

	}

}

package hr_05_fizzBuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import hr_05_fizzBuzz.Solution;
import hr_05_fizzBuzz.Solution.Mapper;

class TestSolution {

	Mapper[] mapForLambda = { new Mapper(105, "FizzBuzzPlat"), new Mapper(35, "BuzzPlat"),
			new Mapper(21, "FizzPlat"), new Mapper(15, "FizzBuzz"), new Mapper(7, "Plat"), new Mapper(5, "Buzz"),
			new Mapper(3, "Fizz") };
	
	@Test
	void shouldReturn1() {
		StringBuilder sb = new StringBuilder();
		Solution.fizzBuzzPlatWithLambda(mapForLambda, 2L).forEach(sb::append);
		assertEquals("1, ", sb.toString() );
	}

	@Test
	void shouldReturnFirstFizz() {
		StringBuilder sb = new StringBuilder();
		Solution.fizzBuzzPlatWithLambda(mapForLambda, 4L).forEach(sb::append);
		assertEquals("1, 2, Fizz, ", sb.toString() );
	}
	
	@Test
	void shouldReturnFirstBuzz() {
		StringBuilder sb = new StringBuilder();
		Solution.fizzBuzzPlatWithLambda(mapForLambda, 6L).forEach(sb::append);
		assertEquals("1, 2, Fizz, 4, Buzz, ", sb.toString() );
	}
	
	@Test
	void shouldReturnFirstPlat() {
		StringBuilder sb = new StringBuilder();
		Solution.fizzBuzzPlatWithLambda(mapForLambda, 8L).forEach(sb::append);
		assertEquals("1, 2, Fizz, 4, Buzz, Fizz, Plat, ", sb.toString() );
	}
	
	@Test
	void shouldReturnFirstFizzBuzz() {
		StringBuilder sb = new StringBuilder();
		Solution.fizzBuzzPlatWithLambda(mapForLambda, 16L).forEach(sb::append);
		assertEquals("1, 2, Fizz, 4, Buzz, Fizz, Plat, 8, Fizz, Buzz, 11, Fizz, 13, Plat, FizzBuzz, ", sb.toString() );
	}
}

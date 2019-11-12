package hr_05_fizzBuzz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 1)
 * 
 * Write a short program that prints each number from 1 to 100 on a new line.
 * 
 * For each multiple of 3, print "Fizz" instead of the number.
 * 
 * For each multiple of 5, print "Buzz" instead of the number.
 * 
 * For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of
 * the number.
 * 
 * 2)
 * 
 * Add now for each multiple of 7, print "Plat" instead of the number.
 * 
 * For numbers which are multiples of both 3, 5 and 7 print "FizzBuzzPlat"
 * instead of the number.
 * 
 * For numbers which are multiples of both 3 and 7 print "FizzPlat" instead of
 * the number.
 * 
 * For numbers which are multiples of both 5 and 7 print "BuzzPlat" instead of
 * the number.
 * 
 * 3)
 * 
 * How can it be made scalable?
 * 
 * @author Alberto
 *
 */
public class Solution {

	static void fizzBuzz(long n) {

		for (int i = 1; i < n; i++) {

			if (i % 5 == 0 && i % 3 == 0) {
				System.out.print("FizzBuzz, ");
				continue;
			}
			if (i % 3 == 0) {
				System.out.print("Fizz, ");
				continue;
			}
			if (i % 5 == 0) {
				System.out.print("Buzz, ");
				continue;
			}

			System.out.print(i + ", ");
		}
	}

	static void fizzBuzzPlat(long n) {

		for (int i = 1; i < n; i++) {

			if (i % 7 == 0 && i % 5 == 0 && i % 3 == 0) {
				System.out.print("FizzBuzzPlat, ");
				continue;
			}

			if (i % 7 == 0 && i % 5 == 0) {
				System.out.print("BuzzPlat, ");
				continue;
			}

			if (i % 7 == 0 && i % 3 == 0) {
				System.out.print("FizzPlat, ");
				continue;
			}

			if (i % 5 == 0 && i % 3 == 0) {
				System.out.print("FizzBuzz, ");
				continue;
			}

			if (i % 3 == 0) {
				System.out.print("Fizz, ");
				continue;
			}

			if (i % 5 == 0) {
				System.out.print("Buzz, ");
				continue;
			}

			if (i % 7 == 0) {
				System.out.print("Plat, ");
				continue;
			}

			System.out.print(i + ", ");
		}
	}

	static void fizzBuzzPlatScalable(long n) {

		for (int i = 1; i < n; i++) {

			if (i % 105 == 0) { // 3*5*7
				System.out.print("FizzBuzzPlat, ");
				continue;
			}

			if (i % 35 == 0) { // 5*7
				System.out.print("BuzzPlat, ");
				continue;
			}

			if (i % 21 == 0) { // 3*7
				System.out.print("FizzPlat, ");
				continue;
			}

			if (i % 15 == 0) { // 3*5
				System.out.print("FizzBuzz, ");
				continue;
			}

			if (i % 3 == 0) {
				System.out.print("Fizz, ");
				continue;
			}

			if (i % 5 == 0) {
				System.out.print("Buzz, ");
				continue;
			}

			if (i % 7 == 0) {
				System.out.print("Plat, ");
				continue;
			}

			System.out.print(i + ", ");
		}
	}

	static boolean compute(int d, String s, int i) {
		if (i % d == 0) {
			System.out.print(s + ", ");
			return true;
		}
		return false;
	}

	static void fizzBuzzPlatMoreScalable(long n) {

		for (int i = 1; i < n; i++) {
			if (compute(105, "FizzBuzzPlat", i))
				continue;
			if (compute(35, "BuzzPlat", i))
				continue;
			if (compute(21, "FizzPlat", i))
				continue;
			if (compute(15, "FizzBuzz", i))
				continue;
			if (compute(7, "plat", i))
				continue;
			if (compute(5, "Buzz", i))
				continue;
			if (compute(3, "Fizz", i))
				continue;

			System.out.print(Integer.toString(i) + ", ");
		}
	}

	static class Mapper {
		@Override
		public String toString() {
			return "Mapper [d=" + d + ", s=" + s + "]";
		}

		public int getD() {
			return d;
		}

		public String getS() {
			return s;
		}

		private int d;
		private String s;

		public Mapper(int d, String s) {
			this.d = d;
			this.s = s;
		}
	}

	static Stream<Object> fizzBuzzPlatWithLambda(Mapper[] mapForLambda, long n) {

		return IntStream.range(1, (int) n).boxed().map(i -> {
			List<Mapper> mapper = Arrays.stream(mapForLambda).filter(m -> {
				return i % m.getD() == 0;
			}).collect(Collectors.toList());

			// System.out.println("mapper=" + mapper);

			return (mapper.size() == 0 ? i : mapper.get(0).getS()) + ", ";
		});
	}

	public static void main(String[] args) {
		fizzBuzz(1000L);

		System.out.println();

		fizzBuzzPlat(1000L);

		System.out.println();

		fizzBuzzPlatScalable(1000L);

		System.out.println();

		fizzBuzzPlatMoreScalable(1000L);

		System.out.println();

		Mapper[] mapForLambda = { new Mapper(105, "FizzBuzzPlat"), new Mapper(35, "BuzzPlat"),
				new Mapper(21, "FizzPlat"), new Mapper(15, "FizzBuzz"), new Mapper(7, "Plat"), new Mapper(5, "Buzz"),
				new Mapper(3, "Fizz") };
		fizzBuzzPlatWithLambda(mapForLambda, 1000L).forEach(System.out::print);
	}
}

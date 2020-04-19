package co;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.jupiter.api.Test;

class TestSolution {

//	@BeforeAll
//	static void init() throws IOException {
//		System.out.println("init!");
//		Runtime.getRuntime()
//				.exec("C:\\ProgramFilesMy\\eclipse\\eclipse\\plugins\\org.apache.ant_1.10.5.v20190526-1402\\bin\\ant");
//	}

	@Test
	void testCase0() {
		try {
			Process p = Runtime.getRuntime()
					.exec("python interactive_runner.py python testing_tool.py 0 -- java -jar test.jar");

			BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String s;
			int i = 0;
			String result = null;
			while ((s = reader.readLine()) != null) {

				System.out.println("The in/out stream is " + s);
				if (i == 1) {
					result = s;
				}
				i++;
			}
			
			String r = "Judge return code: 0";
			assertEquals(r, result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	void testCase1() {
		try {
			Process p = Runtime.getRuntime()
					.exec("python interactive_runner.py python testing_tool.py 1 -- java -jar test.jar");

			BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String s;
			int i = 0;
			String result = null;
			while ((s = reader.readLine()) != null) {

				System.out.println("The in/out stream is " + s);
				if (i == 1) {
					result = s;
				}
				i++;
			}
			
			String r = "Judge return code: 0";
			assertEquals(r, result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

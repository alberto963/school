package co;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.jupiter.api.BeforeAll;

class TestSolution {

	@BeforeAll
	static void init() throws IOException {
		System.out.println("init!");
		// Process process =
		// Runtime.getRuntime().exec("C:\\ProgramFilesMy\\eclipse\\eclipse\\plugins\\org.apache.ant_1.10.5.v20190526-1402\\bin\\ant");
		Process process = Runtime.getRuntime()
				.exec("python interactive_runner.py python testing_tool.py 0 -- java -jar test.jar");
		BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
		String s;
		while ((s = reader.readLine()) != null) {
			System.out.println("The inout stream is " + s);
		}
	}

}

package dg;

import java.util.Optional;
import java.util.stream.Collectors;

// https://devgym.oracle.com/ quiz on Optional - OptionalChallenge

public class OptionalChallenge {

    static String finalZionValue = "";
    static int matrixCount = 0;

    public static void main(String... matrix) {
        Optional<String> optFromMatrix = Optional.ofNullable(finalZionValue);

        // var agentSmith = "Virus"; // Original code not been able to remove syntax error
        String agentSmith = "Virus";

        finalZionValue += Optional.ofNullable(agentSmith).orElse(getVisionFromOracle());
        finalZionValue += optFromMatrix.orElseGet(OptionalChallenge::getVisionFromOracle);

        finalZionValue += matrixCount;
        String neo = null;

        try {
            Optional.ofNullable(neo).orElseThrow(IllegalArgumentException::new);
        } catch (Exception exception) {
            finalZionValue += Optional.ofNullable(neo).or(() -> Optional.of("theOne")).get();
        }

        finalZionValue += Optional.of("trinity").stream().map(String::toUpperCase)
                .filter(trinity -> trinity.equals("TRINITY")).collect(Collectors.joining());

        System.out.println(finalZionValue);
    }

    static String getVisionFromOracle() {
        matrixCount++;
        finalZionValue = "KeyMaker";
        return "Architect";
    }

}
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ListTests {

    @Test
    public void testFilter() {
        List<String> input = new ArrayList<String>();
        input.add("a");
        input.add("a");
        input.add("b");
        StringChecker sc = new StringCheck();

        List<String> actualOutput = ListExamples.filter(input, sc);

        List<String> output = new ArrayList<String>();
        input.add("a");
        input.add("a");
        assertEquals(actualOutput, output);
    }

    @Test
    public void testMerge() {
        List<String> input1 = new ArrayList<String>();
        input1.add("a");
        input1.add("c");
        List<String> input2 = new ArrayList<String>();
        input2.add("b");
        input2.add("d");

        List<String> actualOutput = ListExamples.merge(input1, input2);

        List<String> output = new ArrayList<String>();
        output.add("a");
        output.add("b");
        output.add("c");
        output.add("d");
        assertEquals(output, actualOutput);

    }

}
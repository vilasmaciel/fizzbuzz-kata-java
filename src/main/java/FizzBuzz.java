import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by fer on 5/05/17.
 */
public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZBUZZ = FIZZ + BUZZ;
    public static final int THREE = 3;
    public static final int FIVE = 5;
    public static final int ZERO = 0;
    public static final int VALUES_SIZE = 100;

    public String[] values() {
        String[] values = new String[VALUES_SIZE];
        for (Integer i = 0; i < VALUES_SIZE; i++) {
            values[i] = value(i + 1);
        }

        return values;
    }

    private String value(Integer i) {
        if (isFizzBuzz(i)) return FIZZBUZZ;
        if (isFizz(i)) return FIZZ;
        if (isBuzz(i)) return BUZZ;
        return i.toString();
    }

    private boolean isFizzBuzz(Integer i) {
        return isFizz(i) && isBuzz(i);
    }

    private boolean isBuzz(Integer i) {
        return isMultipleOf(i, FIVE) || containsNumber(i, FIVE);
    }

    private boolean isFizz(Integer i) {
        return containsNumber(i, THREE) || isMultipleOf(i, THREE);
    }

    private boolean isMultipleOf(Integer i, Integer number) {
        return i % number == ZERO;
    }

    private boolean containsNumber(Integer i, Integer number) {
        Pattern pat = Pattern.compile(".*" + number + ".*");
        Matcher mat = pat.matcher(i.toString());
        return mat.matches();
    }

}

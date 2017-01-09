package pl.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-01-05.
 */
public class Math {
    public static List<Factors> getFactors(int number) {

        List<Factors> factors = new ArrayList<Factors>();

        for (int x = 1; x <= number; x++) {
            if (number % x == 0) {
                int y = number / x;
                factors.add(new Factors(x, y));
            }
        }

        return factors;
    }
}

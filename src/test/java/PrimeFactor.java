import java.util.List;

import com.google.common.collect.Lists;

public class PrimeFactor {

    public static List<Integer> generate(final int number) {
        final List<Integer> primeFactors = Lists.newArrayList();
        if (isOne(number)) {
            return primeFactors;
        }

        if (isPrimeNumber(number)) {
            primeFactors.add(number);
        } else {
            for (int i = 2; i < number; i++) {
                final int modulo = number % i;
                if (isPrimeNumber(i) && modulo == 0) {
                    primeFactors.addAll(generate(number / i));
                }
            }
        }
        return primeFactors;
    }

    private static boolean isPrimeNumber(final int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isOne(final int number) {
        return number == 1;
    }

}

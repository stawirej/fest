import static org.fest.assertions.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;

public class PrimeFactorScenario {

    @Test
    public void shouldRetrunOneForOne() {
        // Given
        final int one = 1;

        // When
        final List<Integer> primeFactors = PrimeFactor.generate(one);

        // Then
        assertThat(primeFactors).isEmpty();
    }

    @Test
    public void shouldReturnOneElementListForPrimeNumber() {
        // Given
        final int primeNumber = 7;

        // When
        final List<Integer> primeFactors = PrimeFactor.generate(primeNumber);

        // Then
        assertThat(primeFactors).contains(7);
    }

    @Test
    public void shouldReturnListForNonPrimeNumber() {
        // Given
        final int nonPrimeNumber = 6;

        // When
        final List<Integer> primeFactors = PrimeFactor.generate(nonPrimeNumber);

        // Then
        assertThat(primeFactors).contains(2, 3).hasSize(2);
    }

    @Test
    public void shouldReturnListForNonPrimeNumberWithMultipleFactors() {
        // Given
        final int nonPrimeNumber = 20;

        // When
        final List<Integer> primeFactors = PrimeFactor.generate(nonPrimeNumber);

        // Then
        assertThat(primeFactors).contains(2, 2, 5).hasSize(3);
    }

}

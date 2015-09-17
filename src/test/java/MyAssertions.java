import org.fest.assertions.api.Assertions;

public class MyAssertions extends Assertions {

    public static PersonAssert assertThat(final Person actual) {
        return new PersonAssert(actual);
    }
}

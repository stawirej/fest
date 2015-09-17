import org.fest.assertions.api.AbstractAssert;

public class PersonAssert extends AbstractAssert<PersonAssert, Person> {

    public PersonAssert(final Person actual) {
        super(actual, PersonAssert.class);
    }

    public static PersonAssert assertThat(final Person actual) {
        return new PersonAssert(actual);
    }

    public PersonAssert hasAge(final int age) {
        final String errorMessage = String.format("Expected Person age to be <%s> but was <%s>", age, actual.getAge());
        if (actual.getAge() != age) {
            throw new AssertionError(errorMessage);
        }
        return this;
    }

    public PersonAssert hasName(final String name) {
        final String errorMessage = String.format("Expected Person name to be <%s> but was <%s>", name, actual.getName());
        if (actual.getName() != name) {
            throw new AssertionError(errorMessage);
        }
        return this;
    }
}

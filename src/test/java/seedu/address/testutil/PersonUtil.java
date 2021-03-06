package seedu.address.testutil;

import seedu.address.model.person.Person;

/**
 * A utility class for Person.
 */
public class PersonUtil {

    /**
     * Returns an add command string for adding the {@code person}.
     */
    public static String getAddCommand(Person person) {
        StringBuilder sb = new StringBuilder();
        sb.append("add " + person.getName().fullName + " ");
        sb.append("a/" + person.getAddress().value + " ");
        sb.append("p/" + person.getPhone().value + " ");
        sb.append("e/" + person.getEmail().value + " ");
        person.getTags().stream().forEach(s -> sb.append("t/" + s.tagName + " "));
        return sb.toString();
    }
}

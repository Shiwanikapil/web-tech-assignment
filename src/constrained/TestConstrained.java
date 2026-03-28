package constrained;

public class TestConstrained {
    public static void main(String[] args) {

        ConstrainedPerson person = new ConstrainedPerson();
        AgeValidator validator = new AgeValidator();

        person.addVetoableChangeListener(validator);

        try {
            person.setAge(16);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            person.setAge(20);
            System.out.println("Age set to: " + person.getAge());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
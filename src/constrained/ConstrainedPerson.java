package constrained;

import java.beans.*;

public class ConstrainedPerson {

    private int age;
    private VetoableChangeSupport support;

    public ConstrainedPerson() {
        support = new VetoableChangeSupport(this);
    }

    public void addVetoableChangeListener(VetoableChangeListener listener) {
        support.addVetoableChangeListener(listener);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws PropertyVetoException {
        support.fireVetoableChange("age", this.age, age);
        this.age = age;
    }
}
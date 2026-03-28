package constrained;

import java.beans.*;

public class AgeValidator implements VetoableChangeListener {

    @Override
    public void vetoableChange(PropertyChangeEvent evt) throws PropertyVetoException {

        int newAge = (int) evt.getNewValue();

        if (newAge < 18) {
            throw new PropertyVetoException("Age cannot be less than 18", evt);
        }
    }
}
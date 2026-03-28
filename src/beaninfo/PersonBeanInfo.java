package beaninfo;

import beans.Person;
import java.beans.*;   // ✅ ye line add karni hai

public class PersonBeanInfo extends SimpleBeanInfo {

    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        try {
            PropertyDescriptor name = new PropertyDescriptor("name", Person.class);
            PropertyDescriptor age = new PropertyDescriptor("age", Person.class);

            return new PropertyDescriptor[]{name, age};

        } catch (IntrospectionException e) {
            e.printStackTrace();
            return null;
        }
    } 
}
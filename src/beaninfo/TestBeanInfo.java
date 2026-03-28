package beaninfo;

import beans.Person;
import java.beans.*;   // ✅ ye line add karo

public class TestBeanInfo {
    public static void main(String[] args) throws Exception {

        BeanInfo info = Introspector.getBeanInfo(Person.class);

        for (PropertyDescriptor pd : info.getPropertyDescriptors()) {
            System.out.println("Property: " + pd.getName());
        }
    }
} 
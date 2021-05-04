package p3;

import java.util.LinkedList;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        GenericClass<Integer> integerGenericClass = new GenericClass<>();
        Long value = integerGenericClass.<Long>getValue(12L);
        System.out.println(value.toString());
        List<Number> list = new LinkedList<>();
        list.add(11);
        integerGenericClass.listSupersExample(list);


        NewGeneric newGeneric = new NewGeneric();
        System.out.println((Integer) newGeneric.getValue(123));

    }
}

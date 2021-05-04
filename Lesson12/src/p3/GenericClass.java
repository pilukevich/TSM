package p3;

import java.util.List;

public class GenericClass<T> {

//    static private T stat;//  нельзя? статика принадлежит классу.

    public <A> A getValue(Object obj) {
        //new A(); //нельзя
        return (A) obj;
    }

    /**
     * Object
     * - Transport
     * -- AirTransport
     * --- Military
     * <p>
     * extends - ниже AirTransport включая его (AirTransport, Military)
     *
     * @param list
     */
    public void listExtendsExample(List<? extends Number> list) {
        System.out.println(list.get(0).doubleValue());
//        list.add(new Integer(1));//compilation error
//        Number integer = new Integer(1);
//        list.add(integer);
    }


    /**
     * Object
     * - Transport
     * -- AirTransport
     * --- Military
     * <p>
     * super - выше AirTransport (AirTransport, Transport, Object)
     *
     * @param list
     */
    public void listSupersExample(List<? super Number> list) {
//        list.add(11);
//        list.add(23.23);
        System.out.println(((Number) list.get(0)).intValue());
    }
}

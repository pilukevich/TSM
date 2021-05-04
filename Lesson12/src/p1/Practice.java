package p1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Practice {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>(); //generics
        List<Integer> listInteger = new ArrayList<>();

        List objList = new ArrayList();
        objList.add("asd");
        objList.add(12);
//        objList.add(12.34);
        System.out.println((String) objList.get(0) + objList.get(1));

        //interface
        List<Marker> markers = new ArrayList<>();
        markers.add(new M1());
        markers.add(null);
        markers.add(new M2());

        for (Marker marker : markers) {
            if (marker != null) {
                marker.test();
            }
        }

        String s = markers.stream()
                .filter(Objects::nonNull)
                .map(Marker::toString)
                .findFirst()
                .get();
        System.out.println(s);
        //.test();// не забываем про оформления кода!
    }
}

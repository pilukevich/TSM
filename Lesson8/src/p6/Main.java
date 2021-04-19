package p6;

import static p6.Season.ЗИМА;

public class Main {
    public static void main(String[] args) {
        DayOfWeek dayOfWeek = new DayOfWeek("Суббота");
        System.out.println(dayOfWeek);
        System.out.println(DayOfWeek2.SUNDAY);

        int value = 1;
        Season season = getaVoid(value);
        switch (season) {
            case ЛЕТО:
                System.out.println("sdfsdf");
        }

        System.out.println(ЗИМА.myValue);

        System.out.println(new Main().getClass().getSimpleName());

//        System.out.println(Season.ЗИМА);
//        Season season = Season.ЗИМА;
//        switch (season) {
//            case ЗИМА:
//                System.out.println("");
//                break;
//            case ЛЕТО:
//                System.out.println("");
//                break;
//        }
    }

    private static Season getaVoid(int value) {
        for (Season season : Season.values()) {
            if (season.myValue == value) {
                return season;
            }
        }
        return null;
    }
}

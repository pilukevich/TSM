package a1;

public class MyMain {
    public static void main(String[] args) {
        MyRunnable run2 = new MyRunnable() {
            @Override
            public void myRun() {
                System.out.println("sdfdf");
            }

            @Override
            public int hashCode() {
                return 12;
            }
        };

        MyRunnable run = () -> System.out.println("sfdsf");
        System.out.println(run.method());
        System.out.println(run2.hashCode());

        Person person = new Person();
        System.out.println(person.hashCode());


//        MyRunnable myRunnable = () -> System.out.println("t");
//        myRunnable.myRun();
//        System.out.println(MyRunnable.method2());
    }
}

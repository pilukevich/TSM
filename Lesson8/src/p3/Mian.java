package p3;

public class Mian {
    public static void main(String[] args) {
        final String name = "Nikolai";

        //1 вариант
        {
            Printer.Printable printable = new Printer.Printable() {//сгенерировать лямда и показать
                @Override
                public void print() {
                    System.out.println("print " + name);
                }
            };
            printable.print();
        }

        //2 вариант
        Printer.Printable printer = new Journal(name);
        printer.print();

        //3 вариант
        {
            Printer.Printable printable = () -> System.out.println("sdfsd " + name);
            printable.print();
        }
    }
}

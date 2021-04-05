/**
 * https://metanit.com/java/tutorial/3.1.php
 */
public class SimplePerson {

    //схема трактора, и конкретный экземляр который ездит по полю
    //Класс это шаблон, схема, описание, a объект представляет экземпляр этого класса
    String name; //характиристики, свойства
    int age;

    //поведение, способность дать информацию о себе
    void info() {
        System.out.println("Привет меня зовут "+name);
    }

//    void securedInfo() {
//        System.out.println(name + " " + age);
//    }
}

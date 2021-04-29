package a1;

/**
 * https://javarush.ru/groups/posts/592-java-functional-interfaces
 * https://www.examclouds.com/ru/java/java-core-russian/functional-interface-russian
 */
@FunctionalInterface
public interface MyRunnable {
    void myRun();

    default String method() {
        return "1";
    }

    static String method2() {
        return "2";
    }

    int hashCode();
}

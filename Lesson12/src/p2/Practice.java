package p2;

/**
 * Generics custom
 */
public class Practice {
    private String name;

    public Practice(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        //1
        Generic<String> generic = new Generic<>();
        Object obj = "123";
        String value = generic.getValue(obj);
        System.out.println(value.replace("1", "0"));
        //2
        Generic<Integer> integerGeneric = new Generic<>(18888);
        integerGeneric.print();
        //3
        Generic<Practice> practiceGeneric = new Generic<>();
        practiceGeneric.print(new Practice("name"));
    }

    @Override
    public String toString() {
        return "Practice{" +
                "name='" + name + '\'' +
                '}';
    }
}

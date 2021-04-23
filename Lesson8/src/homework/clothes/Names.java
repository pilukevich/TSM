package homework.clothes;

public enum Names {
    IVAN("Иван"), ARKADY("Аркадий"), FEDOR("Фёдор"), SLAVA("Вячеслав"), YAN("Ян");

    private final String myName;

    public String getMyName() {
        return myName;
    }

    Names(String name) {
        this.myName = name;
    }

    @Override
    public String toString() {
        return myName;
    }
}

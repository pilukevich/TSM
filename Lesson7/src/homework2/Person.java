package homework2;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Person {
    private final String name;
    private final int age;
}

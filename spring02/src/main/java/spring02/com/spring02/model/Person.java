package spring02.com.spring02.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String name;
    private int age;
    private int id;

    // Usando @AllArgsConstructor não precisa de construtor
//    public Person(String name, int age, int id) {
//        this.name = name;
//        this.age = age;
//        this.id = id;
//    }
}

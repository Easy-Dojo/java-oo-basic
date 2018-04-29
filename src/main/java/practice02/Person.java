package practice02;

public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person(String name, Integer age) {

        this.name = name;
        this.age = age;
    }

    private Integer age;

    public String introduce(){
        return String.format("My name is %s. I am %d years old.", this.name, this.age);
    }
}

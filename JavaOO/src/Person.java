public class Person implements IPerson {
    private String name;
    private Integer age;
    private String cpf;

    public Person() {}

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) { // the method argument type needs to be the same as its attribute
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

//    public void say() {
//        System.out.println("I'm saying something...");
//    }
//
//    public static String walk() {
//        return "I'm walking...";
//    }

    public String walk(String msg) {
        return msg;
    }

    // Overloading
    public String walk(String msg, Integer number) {
        return msg + " " + number.toString();
    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }
}

public class User {
    private String name;
    private String surname;
    private int age;
    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;

        System.out.println();

    }
    public User(){

    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}

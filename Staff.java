package lesson5;

public class Staff {

    public String firstname;
    public String surname;
    public String positio;
    public String email;
    public String phoneNumber;
    public int salary;
    public int age;

    public Staff(String firstname, String surname, String positio, String email, String phoneNumber, int salary, int age){
        this.firstname = firstname;
        this.surname = surname;
        this.positio = positio;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Staff{" +
                "firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", positio='" + positio + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}

package lesson5;

public class Search {

    private static final int AGE = 40;
    private static final int ARRAY = 5;

    public static void main(String[] args) {
        Staff[] staffs = new Staff[ARRAY];
        staffs[0] = new Staff("Ivan", "ivanov", "Engineer", "Ivanov@test.ru", "+79169161616", 30000, 30);
        staffs[1] = new Staff("Petr", "ivanov", "Engineer", "Ivanov@test.ru", "+79169161616", 30000, 41);
        staffs[2] = new Staff("Sidr", "ivanov", "Engineer", "Ivanov@test.ru", "+79169161616", 30000, 35);
        staffs[3] = new Staff("Kolia", "ivanov", "Engineer", "Ivanov@test.ru", "+79169161616", 30000, 45);
        staffs[4] = new Staff("Tolia", "ivanov", "Engineer", "Ivanov@test.ru", "+79169161616", 30000, 25);

        for (Staff staff : staffs) {
            if (staff.getAge() > AGE){
                staff.printInfo();
            }
        }
    }

}

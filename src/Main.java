import java.util.Locale;

public class Main {
    public static void main(String[] args) {

// Task 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

// Task 2
        System.out.println("Данные ФИО сотрудника для  заполнения отчета - " + fullName.toUpperCase(Locale.ROOT));


// Task 3
        String firstName1 = "Семён";
        String middleName1 = "Семёнович";
        String lastName1 = "Иванов";
        String fullName1 = lastName1 + " " + firstName1 + " " + middleName1;
        fullName1 = fullName1.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + fullName1);
    }
}
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("Задача 1.");
//        Напишите четыре строки:
//                С именем firstName — для хранения имени.
//                С именем middleName — для хранения отчества.
//                С именем lastName — для хранения фамилии.
//                С именем fullName — для хранения Ф. И. О. сотрудника в формате "Фамилия Имя Отчество".
//        В качестве данных для задачи используйте "Ivanov Ivan Ivanovich".
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
//        Выведите в консоль фразу: «ФИО сотрудника — …».
        System.out.println("ФИО сотрудника - " + fullName);
    }
    public static void task2() {
        System.out.println("Задача 2");
        //        Напишите программу, которая изменит написание Ф. И. О. сотрудника с "Ivanov Ivan Ivanovich" на полностью заглавные буквы.
        String fullName = "Ivanov Ivan Ivanovich";
        String fullNameForReport = fullName.toUpperCase();
//        Результат программы выведите в консоль в формате: "Данные ФИО сотрудника для заполнения отчета — …"
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameForReport);
    }
    public static void task3(){
        System.out.println("Задача 3");
//        Напишите программу, которая заменяет символ «ё» на символ «е»
//        В качестве исходных данных используйте строку fullName и данные в ней — "Иванов Семён Семёнович".
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё', 'е');
//        Выведите результат программы в консоль в формате: «Данные ФИО сотрудника — ...».
        System.out.println("Данные сотрудника - " + fullName);
    }
}
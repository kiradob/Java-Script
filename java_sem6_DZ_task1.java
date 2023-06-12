package sem1;


// Создать класс Person.
// У класса должны быть поля:
// 1. Имя (String)
// 2. Фамилия (String)
// 3. Возраст (продумать тип)
// 4. Пол
// 5*. Придумать свои собственные поля

// Для этого класса
// 1. Реализовать методы toString, equals и hashCode.
// 2*. Придумать собственные методы и реализовать их

// В мейне создать массив Person'ов. В цикле отобрать Person'ов старше 20 лет и вывести их на экран.

public class java_sem6_DZ_task1 {
    public static void main(String[] args) {
        Person[] people = new Person[7];
        people[0] = new Person("Кира", "Добрынина", 29, "жен", "Tomsk Polytechnic University");
        people[1] = new Person("Маша", "Соболева", 18, "жен", "Tomsk State University");
        people[2] = new Person("Саша", "Песцов", 32, "муж", "Tomsk State University");
        people[3] = new Person("Паша", "Белкин", 19, "муж", "Tomsk Polytechnic University");
        people[4] = new Person("Даша", "Боброва", 25, "жен", "Tomsk Polytechnic University");
        people[5] = new Person("Нюша", "Мышкина", 44, "жен", "Tomsk State University of Control Systems and Radioelectronics");
        people[6] = new Person("Ксюша", "Суркова", 34, "жен", "Tomsk State University of Control Systems and Radioelectronics");

        for (Person person : people) {
            if (person.getAge() >= 20) {
                System.out.println("ФИО: " + person.getFirstName() + " " + person.getLastName() + ", Возраст: " + person.getAge() + " лет");
            }
        }
    }
}
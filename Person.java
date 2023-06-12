package sem1;

import java.util.Objects;

// В классе Person определяются пять полей: firstName, lastName, age, sex и university,
// а также конструктор, который принимает значения для всех этих полей.


public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String sex;
    private String university;

    public Person(String firstName, String lastName, int age, String sex, String university) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.sex=sex;
        this.university=university;
    }
// Строковое занчение Имени
// (get - метод для получения значения поля)
    public String getFirstName() {
        return firstName;
    }
// (set - метод для установки значения поля)
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
// Строковое значение Фамилии
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
// Численное значение Возраста (int)
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
// Строковое значение Пола
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
// Строковое значение Учебного заведения
    public String getUiversity() {
        return university;
    }

    public void setProfession(String university) {
        this.university = university;
    }
//  Реализация методов `toString`, `equals` и `hashCode`, чтобы мы могли
//  легко преобразовывать объекты Person в строки, сравнивать их и использовать
//  их в качестве ключей в HashMap.
//   
//  Мы также создаем метод `sayHello`, который просто выводит на экран
//  приветствие с именем и профессией человека.

    @Override
    public String toString() {
        return String.format("Person{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", age=" + age + ", sex='" + sex + '\'' + ", education institution='" + university + '\'' + '}');
    }

    @Override
    public boolean equals(Object О) {
        if (this == О)
            return true;
        if (О == null || getClass() != О.getClass())
            return false;
        Person person = (Person) О;
        return age == person.age &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(sex, person.sex) &&
                Objects.equals(university, person.university);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, sex, university);
    }

    public void sayHelloUni() {
         System.out.println("Привет " + firstName + " " + lastName + ", студент/выпускник ВУЗа: " + university + ".");
    }
}
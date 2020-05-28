public class Employee
{
/*
Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
Конструктор класса должен заполнять эти поля при создании объекта;
Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
 */

    private String fullName;
    private String position;
    private String mail;
    private String phone;
    private int salary;
    private int age;



    Employee (String fullName, String position, String eMail, String phone, int salary, int age)

    {
        this.fullName = fullName;
        this.position = position;
        this.mail = eMail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    void print()
    {
        System.out.println("ФИО: " + getFullName() + ". " + "Должность: " + getPosition() + ". " + "eMail: " + getMail() + ". " + "Телефон: " + getPhone() + ". " + "Зарплата: " + getSalary() + ". " + "Возраст: " + getAge() + ".");
    }

    public String getFullName()
    {
        return fullName;
    }
    public String getPosition()
    {
        return position;
    }
    public String getMail()
    {
        return mail;
    }
    public String getPhone()
    {
        return phone;
    }
    public int getSalary()
    {
        return salary;
    }

    public int getAge()
    {
        return age;
    }
}

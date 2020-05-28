public class Main {
    public static void main (String[] args)
/*
*Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
*Конструктор класса должен заполнять эти поля при создании объекта;
*Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
*/
    {
        Employee employee1 = new Employee("Ivanov Ivan Ivanovich", "Director", "ivanov@gmail.com", "88005553535", 300000, 40);
        employee1.print();
        Employee employee2 = new Employee("Nikolaev Nikolai Nikolaevich", "Executive Director", "nikolaev@gmail.com", "88005553536", 200000, 35);
        employee2.print();
        Employee employee3 = new Employee("Aleksandrov Aleksandr Aleksandrovich", "Manager", "ivanov@gmail.com", "88005553537", 100000, 30);
        employee3.print();
        Employee employee4 = new Employee("Kirillov Kirill Kirillovich", "Waterman", "ivanov@gmail.com", "88005553538", 50000, 25);
        employee4.print();
        Employee employee5 = new Employee("Olegov Oleg Olegovich", "Mascot", "ivanov@gmail.com", "88005553539", 30000, 50);
        employee5.print();

/*
Создать массив из 5 сотрудников
С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
 */

        Employee[] member = new Employee[5];
        member[0] = new Employee("Ivanov Ivan", "Manager", "1@mailbox.com", "88000000001",50000,45);
        member[1] = new Employee("Nikolaev Nikolai", "Manager", "2@mailbox.com", "88000000002",50000,37);
        member[2] = new Employee("Aleksandrov Aleksandr", "WManager", "3@mailbox.com", "88000000003",50000,48);
        member[3] = new Employee("Kirillov Kirill", "Manager", "4@mailbox.com", "88000000004",50000,55);
        member[4] = new Employee("Olegov Oleg", "Manager", "5@mailbox.com", "88000000005",50000,21);
        for (int i=0; i < member.length; i++)
            if (member[i].getAge() > 40) member[i].print();
    }
}

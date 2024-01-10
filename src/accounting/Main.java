package accounting;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    /*
    Создать программу для бухгалтерии, которая сможет делать следующее:
    1. добавлять сотрудников в штат
    2. удалять сотрудников из штата
    3. рассчитывать зарплату для двух категорий сотрудников
    -сотрудник с почасовой оплатой
    - менеджер по продажам
    4. добавление и удаление сотрудников, а так же методы для вывода на экран списка сотруднико
    и суммирования зарплат всех сотрудников должны находиться в классе Company
    5. в программе должны так же быть классы WageEmployee и SalesManager с поями id, name, sacondName,
    количество проработанных часов, а так же метод для расчета разплаты
    6. у сотрудников с почасовой оплатой  должно быть поле - ставка за час. Метод расчета его зарплаты
    должен учитывать минимальный размер оплаты труда
    7. у менеджера по продажам нет фиксированной оплаты. Его зарплата рассчитывается, как процент
    объема продаж. Но его метод оплаты труда так же должен учитывать минимальный размер оплаты труда
    8. программа должна быть написана с использованием свойств наследования
     */

    public static void main(String[] args) {

        Company company = new Company(10);

        Employee salesManager1 = new SalesManager
                (12345, "Kate", "Smith",40,80,15 );
        Employee salesManager2 = new SalesManager
                (12346, "Bob", "Dillan", 40, 60, 15);
        Employee wageEmployee1 = new WageEmployee
                (05432, "James", "Bond", 8, 8);
        Employee wageEmployee2 = new WageEmployee
                (07635, "John", "Snow", 10, 8);
        Employee salesManager3 = new SalesManager
                (18876, "Barbara", "Streisand", 35, 60, 15);
        Employee salesManager4 = new SalesManager
                (12335, "Kate", "Middleton", 35, 70, 15);

        company.addEmployee(salesManager1);
        company.addEmployee(salesManager2);
        company.addEmployee(wageEmployee1);
        company.addEmployee(wageEmployee2);
        company.addEmployee(salesManager3);
        company.addEmployee(salesManager4);
         System.out.println();

       company.display();
        System.out.println();
       System.out.println("Total salaries of the company = " +company.sumSalary());
        System.out.println();
       company.removeEmployee(salesManager3);
        System.out.println();
       company.display();
        System.out.println();
        System.out.println("Total salaries of the company = " +company.sumSalary());

        company.sortEmplyees();
        System.out.println("Sort by Last name:");
        company.display();
        System.out.println();

        System.out.println("Sort by First name and by ID:");
        Arrays.sort(company.getEmployees(),0, company.getCompanySize(), new FirstNameComparator());
        company.display();
        System.out.println();

        System.out.println("Sort by ID:");
        Arrays.sort(company.getEmployees(),0,company.getCompanySize(), new IDComparator());
        company.display();
        System.out.println();









    }
}

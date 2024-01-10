package accounting;

import java.util.Arrays;

public class Company {

    private int companySize;
    private Employee[] employees;

    public Company(int capacity) {
        employees = new Employee[capacity];
        companySize = 0; // можно не обозначать
    }

    public boolean addEmployee(Employee employee) {
        // можно сделать через void с выводом строки на печать, что сотрудник добавлен
        if (companySize < employees.length){
            employees [companySize] = employee;
            //companySize здесь это последний заполненный элемент массива
            companySize++;
            return true;
        }
        return false;
    }

    public boolean removeEmployee(Employee employee){
        for (int i = 0; i < companySize; i ++){
            if (employees[i].equals(employee)){
                employees[i] = employees [companySize-1];
                //на место удаленного сотрудника ставим последнего, чтобы не перелистывать весть массив
                companySize--;
                return true;
            }
        }
        return false;
    }

    public void display(){
        for (int i =0; i < companySize; i++){
            System.out.println(employees[i]);
        }
    }

    public double sumSalary(){
        double sum = 0;
        for (int i = 0; i < companySize; i++){
            sum = sum + employees[i].calculateSalary();
        }
        return sum;
    }

    public void sortEmplyees (){
        Arrays.sort(employees, 0, companySize);
    }

}
package com.bq;

class Employee {
    private String id;
    private String name;
    private double salary;

    public void setInfo(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void show() {
        System.out.println("员工号: " + id + ", 姓名: " + name + ", 工资: " + salary);
    }

    public void raiseSalary(double percent) {
        this.salary += this.salary * (percent / 100.0);
    }
}

public class Test6 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        // 创建3名员工对象
        employees[0] = new Employee();
        employees[0].setInfo("E001", "赵一", 5000);

        employees[1] = new Employee();
        employees[1].setInfo("E002", "钱二", 6000);

        employees[2] = new Employee();
        employees[2].setInfo("E003", "孙三", 7000);

        // 统一涨薪5%
        System.out.println("--- 涨薪前 ---");
        for (Employee e : employees) {
            e.show();
        }

        for (Employee e : employees) {
            e.raiseSalary(5.0);
        }

        System.out.println("\n--- 涨薪5%后 ---");
        for (Employee e : employees) {
            e.show();
        }
    }
}
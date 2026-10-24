package com.bq;

class Student {
    private String name;
    private int age;
    private double score;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) {
        if (age >= 0 && age <= 150) {
            this.age = age;
        } else {
            System.out.println("错误：年龄不合法！");
        }
    }

    public double getScore() { return score; }
    public void setScore(double score) {
        if (score >= 0 && score <= 100) {
            this.score = score;
        } else {
            System.out.println("错误：成绩不合法！");
        }
    }

    public void showInfo() {
        System.out.println("姓名: " + name + ", 年龄: " + age + ", 成绩: " + score);
    }
}

public class data10153 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(20);
        s1.setScore(95.5);
        s1.showInfo();

        Student s2 = new Student();
        s2.setName("李四");
        s2.setAge(200);
        s2.setScore(105);
        s2.showInfo();
    }
}
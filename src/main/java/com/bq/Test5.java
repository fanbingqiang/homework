package com.bq;

class Student5 {
    String id;
    String name;
    int score;

    public Student5(String id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public void show() {
        System.out.println("学号:" + id + ", 姓名:" + name + ", 成绩:" + score);
    }
}

public class Test5 {
    // 定义修改成绩的方法
    public static void updateScore(Student5 stu, int newScore) {
        if (stu != null) {
            stu.score = newScore;
        }
    }

    public static void main(String[] args) {
        Student5 student = new Student5("1001", "王五", 80);
        System.out.print("修改前: ");
        student.show();

        // 调用方法修改成绩
        updateScore(student, 95);

        System.out.print("修改后: ");
        student.show();
        // 观察结果：成绩会发生变化，因为传递的是对象引用，方法内修改会影响原对象
    }
}
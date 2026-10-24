package com.bq;

class Circle {
    private double radius;

    public void setRadius(double r) {
        if (r < 0) {
            this.radius = 0;
        } else {
            this.radius = r;
        }
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getGirth() {
        return 2 * Math.PI * radius;
    }
}

public class Test4 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(3.0);
        System.out.println("圆1 - 半径: " + 3.0 + ", 面积: " + c1.getArea() + ", 周长: " + c1.getGirth());

        Circle c2 = new Circle();
        c2.setRadius(-5.0); // 非法半径，会被设为0
        System.out.println("圆2 - 半径: 0.0 (非法值已归零), 面积: " + c2.getArea() + ", 周长: " + c2.getGirth());
    }
}
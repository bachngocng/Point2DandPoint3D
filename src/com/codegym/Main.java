package com.codegym;

public class Main {

    public static void main(String[] args) {
        Point2D p1 = new Point2D();
        System.out.println(p1);
        Point2D p2 = new Point2D(3,4.142f);
        System.out.println(p2);

        Point3D p3 = new Point3D();
        System.out.println(p3);
        Point3D p4 = new Point3D(1,2,3.4f);
        System.out.println(p4);

        Point2D p5 = new Point3D(4.5f, 4.6f, 7);
        System.out.println(p5);
//        p5.getZ()  ==> lỗi  : p5 là Point2D nên không truy cập được getZ()
//        phải cast về 3D như dòng dưới
        System.out.println(((Point3D) p5).getZ()) ;
    }
}

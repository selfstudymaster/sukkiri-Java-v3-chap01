package main;

// chap01-01
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("RPG:スッキリ魔王征伐");
//        System.out.println("Ver.0.1 bt 湊");
//        System.out.println("<ただいま鋭意製作中です>");
//        System.out.println("プログラムを終了します");
//    }
//}

// chap01-02
//public class Main {
//    public static void main(String[] args) {
//        int age;
//        age = 30;
//        System.out.println(age);
//    }
//}

// chap01-03
//public class Main {
//    public static void main(String[] args) {
//        int age = 20;
//        System.out.println("私の年齢は" + age);
//        age = 31;
//        System.out.println("...いや、本当の年齢は" + age);
//    }
//}

// chap01-04
//public class Main {
//    public static void main(String[] args) {
//        double pi = 3.14;
//        int pie = 5;
//        System.out.println("半径" + pie + "cmのパイの面積は、");
//        System.out.println(pie * pie * pi);
//        System.out.println("パイの半径を倍にします");
//        pi = 10;
//        System.out.println("半径" + pie + "cmのパイの面積は、");
//        System.out.println(pie * pie * pi);
//    }
//}

// chap01-05
// final変数PIに値の再代入はできないため、エラーになります
//public class Main {
//    public static void main(String[] args) {
//        final double PI = 3.14; // finalをつけて変数名を大文字で書く
//        int pie = 5;
//        System.out.println("半径" + pie + "cmのパイの面積は、");
//        System.out.println(pie * pie * PI);
//        System.out.println("パイの半径を倍にします");
//        PI = 10; // pieをPIと書き間違えると、final変数PIに値の再代入はできないためエラーになる
//        System.out.println("半径" + pie + "cmのパイの面積は、");
//        System.out.println(pie * pie * PI);
//    }
//}

// chap01-05 正しいコード
//public class Main {
//    public static void main(String[] args) {
//        final double PI = 3.14; // finalをつけて変更不可にする(final変数は大文字で記述)
//        int pie = 5;
//        System.out.println("半径" + pie + "cmのパイの面積は、");
//        System.out.println(pie * pie * PI);
//        System.out.println("パイの半径を倍にします");
//        pie = 10;
//        System.out.println("半径" + pie + "cmのパイの面積は、");
//        System.out.println(pie * pie * PI);
//    }
//}

// chap01
// quizans01-02 // v2 practice01-02と同一問題
public class Main {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = a * b;
        System.out.println("縦幅3横幅5の長方形の面積は" + c);
    }
}

//package org.example;
//
//import org.w3c.dom.ls.LSOutput;
//
//import java.util.Locale;
//import java.util.Scanner;
//public class tapsiriq4 {
//    public static void main(String[] args) {
//
//        int secim = 4;
//
//        switch (secim) {
//            case 1:
//                System.out.println("1");
//
//            case 2:
//                System.out.println("2");
//
//            case 3:
//                System.out.println("3");
//
//            case 4:
//                System.out.println("4");
//            case 5:
//                System.out.println("5");
//
//        }
//
//        /*
//
//1.Sadə kalkulyator —switch/case
//İstifadəçidən:
//• birinci ədəd
//• ikinci ədəd
//• operator (+,-,*,/)
//al.
//switch istifadə edərək nəticəni hesabla.
//Məsələn:
//First number: 20 Second number: 5 Operator: /
//Result: 4
//         */
//
////        Scanner input = new Scanner(System.in);
////        System.out.println("Ilk ededi daxil et");
////        int a = input.nextInt();
////        System.out.println("Ikinci ededi daxil et");
////        int b = input.nextInt();
////        System.out.println("Operatoru daxil et");
////        char c = input.next().charAt(0);
////
////        switch (c){
////            case '+':
////                System.out.println(a+b);
////                break;
////            case '-':
////                System.out.println(a-b);
////                break;
////            case '*':
////                System.out.println(a*b);
////                break;
////            case '/':
////                System.out.println(a/b);
////                break;
////            default:
////                System.out.println("Operatorda yanlisliq var");
////                break;
////        }
//
//        /*
//2. Login sistemi —while+if
//Sistemdə əvvəlcədən:
//username = "admin"
//password = "12345"
//olsun.
//İstifadəçiyə maksimum 3 login cəhdi ver.
//Düzgündürsə:
//'Login successful'
//Yanlışdırsa:
//Invalid username or password
//Attempts remaining: 2
//3 uğursuz cəhddən sonra:
//'Account locked'
//         */
//
//        input.nextLine();
//
//        int cehd=3;
//        while (cehd>0) {
//            System.out.println("User name daxil edin");
//            String username = input.nextLine();
//            System.out.println("Password  dail edin");
//            String password = input.nextLine();
//            if (username.equals("admin") && password.equals("12345")) {
//                System.out.println("Login successful");
//                break;
//            } else {
//                cehd--;
//                if (cehd > 0) {
//                    System.out.println("Invalid username or password");
//                    System.out.println("Attempts remaining: " + cehd);
//                } else {
//                    System.out.println("Account locked");
//                }
//            }
//        }
//    }
//}
//
//
//
//
//
//
//

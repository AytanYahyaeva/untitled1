package org.example;

public class tapsiriq5 {
    public static void main(String[] args) {
//
//        1. continue ilə tək ədədləri keç(3 xal)
//        1-dən 20-yə qədər ədədləri çap et, amma tək ədədləri çap etmə.
//        Bu tapşırıqda mütləq continueistifadə et.
        for(int i=1;i<20;i++){
            if (i%2==1){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("1-ci tapsiriq bitti");
//        2. break ilə axtarış(3 xal)
//        1-dən 100-ə qədər ədədləri yoxla.
//        50-dən böyük və 3-ə bölünən ilk ədədi tapdıqda onu çap et və loop-u break ilə dayandır.
        for(int i=1;i<100;i++){
            if(i>50 && i%3==0){
                System.out.println(i);
                break;
            }
        }
        System.out.println("2 tapsiriq bitti");

//
//        3. İlk bölünən ədədi tap — break(4 xal)
//        findFirstNumber adında metod yarat:
//        start, end, divisor paraemtrlərini qəbul etsin.
//                start-dan end-ə qədər olan ədədlər içərisində divisor-a tam bölünən ilk ədədi qaytarsın.
//                İlk uyğun ədəd tapıldıqdan sonra break istifadə edərək loop-u dayandır.
//                Məsələn:
//        findFirstNumber(10, 50, 7)
//→ 14

        findFirstNumber(10,50,7);
    }

    private static void findFirstNumber(int start, int end, int devisor) {
        for(int i=start;i<end;i++){
            if (i%devisor==0){
                System.out.println(i);
                break;
            }
        }
        System.out.println("3 tapsiriq bitti");

    }

}

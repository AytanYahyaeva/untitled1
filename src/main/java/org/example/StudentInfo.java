package org.example;

public class StudentInfo {
    public static void main(String[] args){
        //StudentInfo adlı bir class yaradın.
        //Bu class-da aşağıdakı primitive dəyişənləri elan edin və dəyərlər verin:
        //
        //Dəyişən adı    Tipi    Təsviri
        //name    String    tələbənin adı (Məsələn: Əli)
        //age    byte    tələbənin yaşı (Məsələn: 21)
        //grade    char    tələbənin qiyməti (‘A’, ‘B’, ‘C’ və s.)
        //isActive    boolean    tələbənin aktiv olub-olmaması
        //averageScore    float    orta balı(Məsələn: 87.2)

//        int secim = 4;
//switch (secim) {
//         case 1:
//               System.out.println("1");
//               case 2:
////                System.out.println("2");
////
////            case 3:
////                System.out.println("3");
////
////            case 4:
////                System.out.println("4");
////            case 5:
////                System.out.println("5");
        int secim = 2; // Deyək ki, seçimimiz 2-dir

        switch (secim) {
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            case 3:
                System.out.println("3");
            case 4:
                System.out.println("4");
            case 5:
                System.out.println("5");
            default:
                System.out.println("Default");
        }


        String name="Əli";
        byte age=21;
        char grade='F';
        boolean isActive=false;
        float averageScore=87.2F;

        System.out.println(name);
        System.out.println(age);
        System.out.println(grade);
        System.out.println(isActive);
        System.out.println(averageScore);


    }
}

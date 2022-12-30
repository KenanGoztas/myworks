package javaworks1;

import java.util.Scanner;

public class TelephoneNummerKontrol {
    public static void main(String[] args) {
        System.out.println("lütfen telefon numarasını giriniz");
        enterNumber();

    }
    public static int enterNumber(){
        int number=0;
        System.out.println("Please enter a number: ");
        while (true){
            try{
                Scanner input= new Scanner(System.in);
                number= input.nextInt();
                break;
            }catch (Exception e){
                System.out.println("Invalid input!! Please enter a number!!!");
            }
        }
        return number;
    }
}

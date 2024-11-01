/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @verni
 */
import java.util.Scanner;

public class kalkulatorBMI {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        
        System.out.println("apakah kamu pria atau wanita? ");
        String jenisKelamin = input.next();
         
        System.out.println("Berat badan kamu berapa? ");
        double berat = input.nextDouble();
         
        //gunakan tanda "," contoh 170cm jadinya 1,70
        System.out.println("Tinggi badan kamu berapa? ");
        double tinggi = input.nextDouble();
         
         
         double bmi = berat / (tinggi * tinggi);
       System.out.printf("BMI kamu adalah: %.2f\n", bmi);
        
        //kategori kesehatan dari hasil BMI
        if (jenisKelamin.equalsIgnoreCase("Pria")) {   
            if (bmi < 18.5) {
                System.out.println("kamu berada dalam kategori kurus bagi pria, jangan lupa makan dan ayo lebih peduli dengan dirimu, ya!");
            } else if (bmi >= 18.5 && bmi < 25.0) {
                System.out.println("kamu berada dalam kategori normal bagi pria");
            } else if (bmi >= 25.0 && bmi < 30.0) {
                System.out.println("kamu berada dalam kategori overweigth bagi pria");
            } else {
                System.out.println("Kamu berada dalam kategori obesitas bagi pria, ayo jaga berat badanmu dan lebih peduli dengan dirimu, ya! ");
            }
        }
        else if (jenisKelamin.equalsIgnoreCase("Wanita")) {
            if (bmi < 17.5) {
                System.out.println("kamu berada pada kategori kurus bagi wanita, jangan lupa makan dan ayo lebih peduli dengan dirimu, ya!");
            } else if (bmi >= 17.5 && bmi < 24.0) {
                System.out.println("kamu berada pada kategori normal bagi wanita");
            } else if (bmi >= 24.0 && bmi < 29.0) {
                System.out.println("kamu berada pada kategori Overweight bagi wanita");
            } else {
                System.out.println("kamu berada pada kategori Obesitas bagi wanita, ayo jaga berat badanmu dan lebih peduli dengan dirimu, ya!");
            }
        }
    input.close();
    }
}

import java.util.Scanner;

public class bmiIndex {
    public static void main(String[] args) {
        Scanner enter= new Scanner(System.in);

        System.out.println("Please enter your weight in Kilograms");
        float weight=enter.nextFloat();

        System.out.println("Please enter your height in Meters");
        float height=enter.nextFloat();

        float bmi = weight/(height*height);
      //  System.out.println(weight+" your height is "+ height+ " bmi "+bmi);
/*
        switch (bmi){
            case bmi<18.5:
                System.out.println("I'm sorry to inform you that you're underweight");
                break;
            case bmi>=18.5 && bmi<24.9:
                System.out.println("Yippee you're of normal weight");
                break;
            case bmi>=25 && bmi<29.9:
                System.out.println("You're overweight honey");
                break;
            case bmi>=30:
                System.out.println("Oh My! you're obese");
                break;
            default:
                System.out.println("Are you sure you're human?!");
                break;
        } */

        if (bmi<18.5){
            System.out.println("I'm sorry to inform you that you're underweight");

        } else if (bmi>=18.5 && bmi<= 24.9){
            System.out.println("Yippee you're of normal weight");

        } else if (bmi>=25 && bmi<= 29.9) {
            System.out.println("You're overweight honey");

        }else if (bmi>=30 ) {
            System.out.println("Oh My! you're obese");
             }
    }
}

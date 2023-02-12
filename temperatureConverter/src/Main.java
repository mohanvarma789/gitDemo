import java.util.*;
class tempConverter{
    static Scanner sc = new Scanner(System.in); // Scanner Class

    static double Celsius_Fahrenheit(double C){
        double F = (C * 9/5) + 32;
        return F;
    }
    static double  Celsius_Kelvin(double C){
        double K = C + 273.15;
        return K;
    }
    static double Fahrenheit_Celsius(double F){
        double C = (F - 32) * 5/9;
        return C;
    }
    static double Fahrenheit_Kelvin(double F){
        double K = (F - 32) * 5/9 + 273.15;
        return K;
    }

    static double Kelvin_Celsius(double K){
        double C = K - 273.15;
        return C;
    }
    static double Kelvin_Fahrenheit(double K){
        double F = (K - 273.15) * 9/5 + 32;
        return F;
    }
    static double input(String word){
        System.out.println("Enter "+word+" value:");
        double val = sc.nextDouble();
        return val;
    }

    static void output(double val, String word){
        System.out.printf("%s value: %.2f",word,val);
    }

    public static void main(String args[]){
        System.out.println("1. Celsius to Fahrenheit\n2. Celsius to Kelvin\n"+
                "3. Fahrenheit to Celsius\n4. Fahrenheit to Kelvin\n"+
                "5. Kelvin to Celsius\n6. Kelvin to Fahrenheit\n7. Exit");
        do{
            System.out.println("\nEnter Choice: ");
            int ch = sc.nextInt();
            double num = 0;
            switch(ch){
                case 1: num = input("Celcius");
                    output(Celsius_Fahrenheit(num), "Fahrenheit");
                    break;
                case 2: num = input("Celcius");
                    output(Celsius_Kelvin(num), "Kelvin");
                    break;
                case 3: num = input("Fahrenheit");
                    output(Fahrenheit_Celsius(num), "Celcius");
                    break;
                case 4: num = input("Fahrenheit");
                    output(Fahrenheit_Kelvin(num), "Kelvin");
                    break;
                case 5: num = input("Kelvin");
                    output(Kelvin_Celsius(num), "Celcius");
                    break;
                case 6: num = input("Kelvin");
                    output(Kelvin_Fahrenheit(num), "Fahrenheit");
                    break;
                case 7: System.exit(0);
                    break;
                default: System.out.println("Invalid Input");
            }
        }while(true);
    }
}
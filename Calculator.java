package java_project;

import java.lang.*;
import java.util.*;

public class Calculator {
    
    private static double solution;
    private static double x;
    private static double y;
    private char operators;
    
    public Calculator(){
    }
    
    public double addition(double x, double y){
        solution = x+y;
        return solution;
    }
    
    public double subtraction(double x, double y){
        solution = x-y;
        return solution;
    }
    
    public double multiplication(double x, double y){
        solution = x*y;
        return solution;
    }
    
    public double division(double x, double y){
        solution = x/y;
        return solution;
    }
    
    public static void CalculatorRun(){
        boolean loop = true;
        
        Scanner sc = new Scanner(System.in );
        System.out.println("Welcome to calculator\n");
        
        while (loop){
        
        System.out.println("What operation do you want to use");
        System.out.println("1: Addition(+)\t2: Subtraction(-)\t3: Multiplication\t4: Division(/)\t0:Exit");
        
        Calculator calc = new Calculator();
        int option = 1;
        
        
        
        try{
        option = sc.nextInt();
        while (option == 0){
            System.out.println("Exiting calculator");
            loop = false;
            break;
        }
        
        switch(option){
            case 1:
                System.out.println("Addition selected");
                System.out.print("Enter first value: ");
                x = sc.nextDouble();
                System.out.print("Enter second value: ");
                y = sc.nextDouble();
                calc.addition(x, y);
                System.out.println("--------------------------------------------");
                System.out.println("Solution: "+solution);
                System.out.println("--------------------------------------------");
                break;
        
            case 2:
                System.out.println("Subtraction selected");
                System.out.print("Enter first value: ");
                x = sc.nextDouble();
                System.out.print("Enter second value: ");
                y = sc.nextDouble();
                calc.subtraction(x, y);
                System.out.println("--------------------------------------------");
                System.out.println("Solution: "+solution);
                System.out.println("--------------------------------------------");
                break;
                
            case 3:
                System.out.println("Multiplication selected");
                System.out.print("Enter first value: ");
                x = sc.nextDouble();
                System.out.print("Enter second value: ");
                y = sc.nextDouble();
                calc.multiplication(x, y);
                System.out.println("--------------------------------------------");
                System.out.println("Solution: "+solution);
                System.out.println("--------------------------------------------");
                break;
                
            case 4:
                System.out.println("Division selected");
                System.out.print("Enter first value: ");
                x = sc.nextDouble();
                System.out.print("Enter second value: ");
                y = sc.nextDouble();
                calc.division(x, y);
                System.out.println("--------------------------------------------");
                System.out.println("Solution: "+solution);
                System.out.println("--------------------------------------------");
                break;
            default:
                System.out.println("Invalid input");
                System.out.println("\n");
            
                 }
                } catch (Exception e){ 
                    System.out.println("Invalid input");
            } 
        }
    }
}


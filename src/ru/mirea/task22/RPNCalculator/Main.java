package ru.mirea.task22.RPNCalculator;

import java.util.Scanner;
import java.util.Stack;

public class Main
{
    public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        String str = scanner.nextLine();

        String[] strings = str.split(" ");

        Stack<Double> stack=new Stack<Double>();

        for (int i=0;i< strings.length;i++){
            if(isNumber(strings[i])){
                stack.push(Double.parseDouble(strings[i]));
            }else{
                double tmp1 = stack.pop();
                double tmp2 = stack.pop();

                switch (strings[i]){

                    case "+":{
                        stack.push(tmp1+tmp2);
                        break;
                    }
                    case "-":{
                        stack.push(tmp1-tmp2);
                        break;
                    }
                    case "*":{
                        stack.push(tmp1*tmp2);
                        break;
                    }
                    case "/":{
                        stack.push(tmp1/tmp2);
                        break;
                    }
                }
            }
        }
        if(!stack.empty()){
            System.out.println(stack.pop());
        }else{
            System.out.println("Mistake!");
        }

    }
    private static boolean isNumber(String string){
        try{
            Double.parseDouble(string);

            return true;
        }catch (NumberFormatException ex){
            return false;
        }
    }
}

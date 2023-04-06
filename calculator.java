package simpleprojects;

//imports
import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        // varible declarations
        float num1;
        float num2;
        float ans;
        String operator;
        operator = " ";

        //print statement
        System.out.println("---------------------------");
        System.out.println("        CALCULATOR        |");
        System.out.println("---------------------------");

        try (Scanner scanner = new Scanner(System.in)) {
            //get input num1 and num2
            System.out.println("Enter the first number: ");
            num1 = scanner.nextFloat();

            System.out.println("Enter the second number: ");
            num2 = scanner.nextFloat();
            
            //operator selection
            while (operator != "+" || operator != "-" || operator != "*" || operator != "/"){
                
                System.out.println("Enter the operator ( + - * /)");
                operator = scanner.nextLine();

                //use of cases to operate
                switch (operator){
                    //addition
                    case "+":
                        ans = num1 + num2;
                        System.out.println("The answer is "+ ans);
                        System.exit(0);

                    //subtraction
                    case "-":
                        ans = num1 - num2;
                        System.out.println("The answer is "+ ans);
                        System.exit(0);
                    //multiplication
                    case "*":
                        ans = num1 * num2;
                        System.out.println("The answer is "+ ans);
                        System.exit(0);
                    //division
                    case "/":
                        //division by 0
                        if (num2 == 0){
                            System.out.println("Error! Cannot divide by zero");
                            System.exit(0);
                        }
                        else{
                            ans = num1 / num2;
                        System.out.println("The answer is "+ ans);
                        System.exit(0);
                        } 
                }
            }
        }
    }
}

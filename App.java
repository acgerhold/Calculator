import java.util.*;

public class App { 
    static final Scanner inputScanner = new Scanner(System.in);
    public static void main(String[] args){
        Calculator calc = new Calculator();

        while(true){
            String operation = menu();
            if(operation.equals("exit")){
                break;
            }
            System.out.println();
            double result = 0;

            String prompt1 = "Enter first number: ";
            String prompt2 = "Enter second number: ";
            double num1 = getDouble(prompt1);
            double num2 = getDouble(prompt2);

            switch(operation){
                case "add":
                    result = calc.add(num1, num2);
                    break;
                case "subtract":
                    result = calc.subtract(num1, num2);
                    break;
                case "multiply":
                    result = calc.multiply(num1, num2);
                    break;
                case "divide":
                    result = calc.divide(num1, num2);
                    break;
                default:
                    throw new UnsupportedOperationException("Invalid operation!");
            }
            System.out.println(String.format("Result: %f",result));
        }                                        
    }
    private static String menu(){
        List<String> options = List.of("add","subtract","multiply","divide");
        String selection = "";
        while(!options.contains(selection)){
            System.out.println();
            System.out.println("What operation would you like to perform?:");
            System.out.println();
            System.out.println("add");
            System.out.println("subract");
            System.out.println("multiply");
            System.out.println("divide");
            System.out.println();
            System.out.println("exit");
            selection = getString("").toLowerCase();
        }
        return selection;
    }
    private static String getString(String prompt){
        System.out.println(prompt);
        String input = inputScanner.nextLine();
        return input;
    }
    private static double getDouble(String prompt){
        System.out.println(prompt);
        double dbl = inputScanner.nextDouble();
        return dbl;
    }
}

// String message = String.format("You want to add "+num1+" and "+num2+". ");
//         System.out.println(message);       
//         double sum = calc.add(num1, num2);
//         double difference = calc.subtract(num1, num2);
//         double product = calc.multiply(num1, num2);
//         double quotient = calc.divide(num1, num2);
//         System.out.println("The sum of your two doubles is: "+sum);
//         System.out.println("The difference of your two numbers is: "+difference);
//         System.out.println("The product of your two numbers is: "+product);
//         System.out.println("The quotient of your two numbers is: "+quotient);
    
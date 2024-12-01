

public class Main {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

      
       Operation addition = OperationFactory.createOperation("Addition");
        System.out.println("Addition Result: " + addition.calculate(num1, num2));
        
        
        Operation subtraction = OperationFactory.createOperation("SUBTRACTION");
        System.out.println("Subtraction Result: " + subtraction.calculate(num1, num2));

        
       
    }
}

interface Operation {
    int calculate(int num1, int num2);
}


class AdditionOperation implements Operation {
   
    public int calculate(int num1, int num2) {
        return num1 + num2;
    }
}



class SubtractionOperation implements Operation {
   
    public int calculate(int num1, int num2) {
        return num1 - num2;
    }
}




class OperationFactory {
   
    public static Operation createOperation(String operationType) {
        if (operationType == null) {
            return null;
        }
        if (operationType.equalsIgnoreCase("SUBTRACTION")) {
            return new SubtractionOperation();
        } else if (operationType.equalsIgnoreCase("ADDITION")) {
            return new AdditionOperation();
        }
        return null;
    }
}





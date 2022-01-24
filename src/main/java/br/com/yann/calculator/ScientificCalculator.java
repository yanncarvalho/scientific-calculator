package br.com.yann.calculator;

import java.util.List;
import java.util.Scanner;

import br.com.yann.calculator.operations.Division;
import br.com.yann.calculator.operations.Modulo;
import br.com.yann.calculator.operations.Multiplication;
import br.com.yann.calculator.operations.Power;
import br.com.yann.calculator.operations.Subtraction;
import br.com.yann.calculator.operations.Sum;
import br.com.yann.calculator.operations.interfaces.Command;



public class ScientificCalculator{

  private List<Command> operations;
 
  public ScientificCalculator() {
    this.operations = List.of(
                              new Sum(),
                              new Subtraction(),
                              new Multiplication(),
                              new Division(),
                              new Modulo(),
                              new Power()
                            );
  }

    
  void iniciar (){
    
    System.out.println("----Scientific Calculator----");
    
    int counter = 1;
    for (Command operation : operations) {

      int latsOcorrencyOfPointInFQN = operation.getClass().getName().lastIndexOf(".");
      String className = operation.getClass().getName().substring(latsOcorrencyOfPointInFQN+1);

      System.out.println(counter +" - "+ className);
      counter++;
    }

    try (Scanner scanner = new Scanner(System.in)) {

      System.out.print("Inform an option: ");
      int operationIndex = scanner.nextInt()-1;

      System.out.print("Inform the 1st number: ");
      double num1 = scanner.nextDouble();

      System.out.print("Inform the 2nd number: ");
      double num2 = scanner.nextDouble();

      double result = operations.get(operationIndex).execute(num1, num2);

      System.out.println("The result of the operation is "+result);
    }

  }

}
package br.dev.yann.scientificcalc;

import java.util.List;
import java.util.Scanner;

import br.dev.yann.scientificcalc.operations.Operation;
import br.dev.yann.scientificcalc.operations.impl.Division;
import br.dev.yann.scientificcalc.operations.impl.Modulo;
import br.dev.yann.scientificcalc.operations.impl.Multiplication;
import br.dev.yann.scientificcalc.operations.impl.Power;
import br.dev.yann.scientificcalc.operations.impl.Subtraction;
import br.dev.yann.scientificcalc.operations.impl.Sum;



public class ScientificCalculator{

  private List<Operation> operations;

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


  void start (){

    System.out.println("----Scientific Calculator----");

    int counter = 1;
    for (Operation operation : operations) {

      int pointLastOcorrencyInFQN = operation.getClass().getName().lastIndexOf(".");
      String className = operation.getClass().getName().substring(pointLastOcorrencyInFQN+1);

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

      double result = operations.get(operationIndex).calculate(num1, num2);

      System.out.println("The result of the operation is "+result);
    }

  }

}
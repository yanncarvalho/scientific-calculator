package br.com.yann.calculator.operations;

import br.com.yann.calculator.operations.interfaces.Command;

public class Power implements Command {

  @Override
  public double execute(double num1, double num2) {
    return Math.pow(num1,num2);
  }
  
}

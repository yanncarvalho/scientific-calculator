package br.com.yann.calculator.operations;

import br.com.yann.calculator.operations.interfaces.Command;

public class Modulo implements Command {

  @Override
  public double execute(double num1, double num2) {
    return num1%num2;
  }
  
}
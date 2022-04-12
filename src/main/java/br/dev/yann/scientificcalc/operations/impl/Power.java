package br.dev.yann.scientificcalc.operations.impl;

import br.dev.yann.scientificcalc.operations.Operation;

public class Power implements Operation {

  @Override
  public double calculate(double num1, double num2) {
    return Math.pow(num1,num2);
  }

}

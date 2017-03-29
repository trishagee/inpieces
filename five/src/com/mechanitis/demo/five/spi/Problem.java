// Fig. 36.x: Problem.java
// Problem superclass that contains information about a math problem.
package com.mechanitis.demo.five.spi;

public abstract class Problem {
   private int leftOperand;
   private int rightOperand;
   private int result;
   private String operation;

   // constructor
   public Problem(int leftOperand, int rightOperand, String operation) {
      this.leftOperand = leftOperand;
      this.rightOperand = rightOperand;
      this.operation = operation;
   }

   // gets the leftOperand
   public int getLeftOperand() {return leftOperand;}

   // gets the rightOperand
   public int getRightOperand() {return rightOperand;}

   // gets the operation
   public String getOperation() {return operation;}

   // gets the result
   public abstract int getResult();
}

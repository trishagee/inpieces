// Fig. 36.x: AdditionProblemProvider.java
// AdditionProblemProvider implementation of interface  
// ProblemProvider for the MathTutor app.
package com.mechanitis.demo.six.additionprovider;


import com.mechanitis.demo.five.spi.Problem;
import com.mechanitis.demo.five.spi.ProblemProvider;

import java.util.Random;

public class AdditionProblemProvider implements ProblemProvider {
    private static Random random = new Random();

    // returns a new addition problem
    @Override
    public Problem getProblem() {
        return new Problem(random.nextInt(10), random.nextInt(10), "+") {
            // override getResult to add the operands
            @Override
            public int getResult() {
                return getLeftOperand() + getRightOperand();
            }
        };
    }
}

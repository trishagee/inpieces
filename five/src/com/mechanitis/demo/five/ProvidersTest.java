// MathTutor.java
// Math tutoring app using ProblemProviders to display math problems.
package com.mechanitis.demo.five;

import com.mechanitis.demo.five.spi.ProblemProvider;

import java.util.List;
import java.util.ServiceLoader;
import java.util.ServiceLoader.Provider;
import java.util.stream.Collectors;

public class ProvidersTest {

   public static void main(String[] args) {
      ServiceLoader<ProblemProvider> serviceLoader =
        ServiceLoader.load(ProblemProvider.class);

      // get the list of service providers
      List<Provider<ProblemProvider>> providersList =
              serviceLoader.stream().collect(Collectors.toList());

   }
}

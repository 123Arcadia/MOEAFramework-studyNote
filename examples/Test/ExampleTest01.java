package Test;

import org.moeaframework.algorithm.NSGAII;
import org.moeaframework.core.NondominatedPopulation;
import org.moeaframework.core.PopulationIO;
import org.moeaframework.core.Problem;
import org.moeaframework.problem.DTLZ.DTLZ2;
import org.moeaframework.problem.misc.Lis;

import java.io.IOException;
import java.util.*;

public class ExampleTest01 {


    public static void main(String[] args) throws IOException {
        // solve the 2-D DTLZ2 problem
        Problem problem = new DTLZ2(2);

        NSGAII algorithm = new NSGAII(problem);
        algorithm.run(10000);

        algorithm.getConfiguration().display();
        //sbx.rate=1.0
        //operator=sbx+pm
        //sbx.swap=true
        //populationSize=100
        //pm.rate=0.09090909090909091
        //pm.distributionIndex=20.0
        //sbx.distributionIndex=15.0
        //sbx.symmetric=false


        NondominatedPopulation result = algorithm.getResult();

//        result.display();


        NondominatedPopulation approximationSet = algorithm.getResult();

        NondominatedPopulation referenceSet = PopulationIO.readReferenceSet("pf/DTLZ2.2D.pf");

//        Indicators indicators = Indicators.all(problem, referenceSet);
//        indicators.apply(approximationSet).display();

    }



}

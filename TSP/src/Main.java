/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ashvin
 */
public class Main {
    public static void main(String[] args) {
        TSP tsp = new TSP(); 
        State[] bestTour = tsp.bestTour;
//        State[] startTour = tsp.startingTour;
//        for(State state: s) {
//            System.out.println(state);
//        }
        double distance = 0.0;
        for(int i = 0; i < bestTour.length-1; i++) {
            distance = distance + bestTour[i].capital().distance(bestTour[i+1].capital());
//            System.out.println(edges[i][0] + ":" + edges[i][1]);
        }
        //distance += bestTour[bestTour.length-1].capital().distance(bestTour[0].capital());
        System.out.println("The Total Tour Length is " + distance + " Kilometers");
    }
}

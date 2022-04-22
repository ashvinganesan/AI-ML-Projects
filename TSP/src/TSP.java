
import java.util.ArrayList;

/*

 */
public class TSP {

    public State[] startingTour;
    public State[][] edges;
    public State[] bestTour;
    public TSP() {
        startingTour = start(States.California);
//        for (int i = 0; i< startingTour.length;i++) {
//            System.out.print("Starting:");
//            System.out.println(startingTour[i]);
//        }
        State[] tour = optimize_ap(startingTour);
        bestTour = tour;
        bestTour = optimize_ap(bestTour);
        bestTour = optimize_ap(bestTour);
        for(int i = 0; i < 27; i++) {
            bestTour = optimize_ap(bestTour);
        }
        for (int i = 0; i< bestTour.length;i++) {
//            System.out.print("Best:    ");
            System.out.println(bestTour[i]);
            //System.out.print("Starting:");
            //System.out.println(startingTour[i]);
        }
    }

    public State[] optimize_ap(State[] tour) {
        edges = new State[States.continentalStates.length][2];
        State[] nTour = new State[States.continentalStates.length +1];
        State[] reverseTour = new State[States.continentalStates.length + 1];
        
//        System.out.println(tour.length);
        for (int i = tour.length - 1 ; i >= 0; i--) {
            reverseTour[tour.length - 1 - i] = tour[i];
        }

        for (int i = 0; i < edges.length; i++) {
            edges[i][0] = tour[i];
            edges[i][1] = tour[(i + 1) % (States.continentalStates.length)];
        }

        for (int j = 0; j < edges.length; j++) {
            for (int l = j + 1; l < edges.length; l++) {
                if (crossing(edges[j][0], edges[j][1], edges[l][0], edges[l][1])) {
                    State A = edges[j][0];
                    State B = edges[j][1];
                    State C = edges[l][0];
                    State D = edges[l][1];
                    
//                    System.out.println(A + " " + B + " " + C + " " + D);
                    
                    int AIndexInForward = findIndex(A, tour);
                    int BIndexInForward = findIndex(B, tour);
                    int CIndexInForward = findIndex(C, tour);
                    int DIndexInForward = findIndex(D, tour);
                    
                    int AIndexInReverse = findIndex(A, reverseTour);
                    int BIndexInReverse = findIndex(B, reverseTour);
                    int CIndexInReverse = findIndex(C, reverseTour);
                    int DIndexInReverse = findIndex(D, reverseTour);
                    
                    boolean top = false;
                    boolean right = false;
                    if ((AIndexInForward + 1) % (tour.length) == BIndexInForward) {
                        top = true;
                    }
                    if ((DIndexInForward + 1) % (tour.length) == CIndexInForward) {
                        right = true;
                    }
                    
                    
                    State N1 = B;
                    State N3 = A;
                    State N2 = D;
                    State N4 = C;
                    if (top) {
                        N1 = A;
                        N3 = B;
                    }
                    if (!right) {
                        N2 = C;
                        N4 = D;
                    }
                    
//                    System.out.println(N1 + " " + N2 + " " + N3 + " " + N4);
                    
                    int N1IndexInForward = findIndex(N1, tour);
                    int N2IndexInReverse = findIndex(N2, reverseTour);
                    int N3IndexInReverse = findIndex(N3, reverseTour);
                    int N4IndexInForward = findIndex(N4, tour);
                    
                    int lenReverseChain = N3IndexInReverse - N2IndexInReverse + 1;
                    
                    for (int i = 0; i < tour.length; i++) {
                        if (i < N1IndexInForward) {
                            nTour[i] = tour[i];
                        }
                        if ((N1IndexInForward < i) && (i < N1IndexInForward + lenReverseChain + 1)) {
                            nTour[i] = reverseTour[N2IndexInReverse + i - N1IndexInForward -1];
                        }
                        else {
                            nTour[i] = tour[i];
                        }
                        
                    }
                
                    return nTour;
                    
                }
            }
        }
        return nTour;
    }

    public static int findIndex(State element, State[] arry) {
        int k = 0;
        while (arry[k] != element) {
            k++;
        }
        return k;
    }

//    public State[] optimize(State[] tour) {
//        edges = new State[States.continentalStates.length][2];
//        for (int i = 0; i < edges.length; i++) {
//            edges[i][0] = tour[i];
//            edges[i][1] = tour[(i + 1) % (States.continentalStates.length)];
//        }
////        for(int i = 0; i < edges.length; i++) {
////            for(int j = 0; j < edges[0].length;j++) {
////                System.out.println(edges[i][j]);
////            }
////        }
////        
//        for (int j = 0; j < edges.length; j++) {
//            for (int l = j + 1; l < edges.length; l++) {
//                if (crossing(edges[j][0], edges[j][1], edges[l][0], edges[l][1])) {
//                    State oneA = edges[j][0];
//                    State oneB = edges[j][1];
//                    State twoA = edges[l][0];
//                    State twoB = edges[l][1];
//
//                    for (int i = 0; i < edges.length; i++) {
//                        if (edges[i][0].equals(oneA)) {
//                            if (edges[i][1].equals(twoB)) {
//                                edges[j][0] = oneA;
//                                edges[j][1] = twoA;
//                                edges[l][0] = oneB;
//                                edges[l][1] = twoB;
//                            } else {
//                                edges[j][0] = oneA;
//                                edges[j][1] = twoB;
//                                edges[l][0] = oneB;
//                                edges[l][1] = twoA;
//                            }
//                        } else if (edges[i][0].equals(oneB)) {
//                            if (edges[i][1].equals(twoA)) {
//                                edges[j][0] = oneA;
//                                edges[j][1] = twoA;
//                                edges[l][0] = oneB;
//                                edges[l][1] = twoB;
//                            } else {
//                                edges[j][0] = oneA;
//                                edges[j][1] = twoB;
//                                edges[l][0] = oneB;
//                                edges[l][1] = twoA;
//                            }
//                        }
//                    }
//                    edges[j][0] = oneA;
//                    edges[j][1] = twoA;
//                    edges[l][0] = oneB;
//                    edges[l][1] = twoB;
//                }
//
//            }
//        }
//        for (int i = 0; i < edges.length; i++) {
//            System.out.println(edges[i][0] + " : " + edges[i][1]);
//
//        }
//        System.out.println("STOP HERE");
//        System.out.println("");
//        System.out.println("");
//        ArrayList<State> newTour = new ArrayList<State>();
//        newTour.add(edges[0][0]);
//        State prev = edges[0][1];
//        System.out.println("prev:" + prev);
//        for (int i = 1; i < States.continentalStates.length; i++) {
//            for (int j = 1; j < edges.length; j++) {
//                if (edges[j][0].equals(prev)) {
//                    if (!newTour.contains(edges[j][1])) {
//                        newTour.add(prev);
//                        System.out.println("prev1:" + prev);
//                        prev = edges[j][1];
//                        System.out.println("prev1:" + prev);
//                    }
//                    if (edges[j][1].equals(States.CA)) {
//                        newTour.add(prev);
//                        prev = edges[j][1];
//
//                    }
//                } else if (edges[j][1].equals(prev)) {
//                    if (!newTour.contains(edges[j][0])) {
//                        newTour.add(prev);
//                        System.out.println("prev2:" + prev);
//                        prev = edges[j][0];
//                        System.out.println("prev2:" + prev);
//                    }
//                    if (edges[j][0].equals(States.CA)) {
//                        newTour.add(prev);
//                        prev = edges[j][0];
//
//                    }
//                }
//            }
//
//        }
//
////        State[] newTour = new State[tour.length];
////        State previous = States.California;
////        for(int i = 0; i < newTour.length; i++) {
////            for(int j = 0; j < edges.length; j++) {
////                if(edges[j][0].equals(previous)) {
////                    newTour[i] = edges[j][0];
////                    i++;
////                    newTour[(i)%States.continentalStates.length] = edges[j][1];
////                    previous = edges[j][1];
////                }
////                
////            }
////            
////                   
////        }
//        State[] nTour = new State[States.continentalStates.length];
//        for (int i = 0; i < newTour.size(); i++) {
//            nTour[i] = newTour.get(i);
//        }
//        return nTour;
//    }

    public boolean crossing(State oneA, State oneB, State twoA, State twoB) {
        City oneACap = oneA.capital();
        City oneBCap = oneB.capital();
        City twoACap = twoA.capital();
        City twoBCap = twoB.capital();
        if (oneA.equals(twoA) || oneA.equals(twoB) || oneB.equals(twoA) || oneB.equals(twoB)) {
            return false;
        }
        double attemptDist = oneACap.distance(oneBCap) + twoACap.distance(twoBCap);
        if ((oneACap.distance(twoACap) + oneBCap.distance(twoBCap)) < attemptDist) {
            return true;
        }
        return false;
    }

    public State[] start(State start) {
        ArrayList<State> Path = new ArrayList<State>();
        Path.add(start);
        State current = start;
        State nearest = States.NY;
        double distance = Double.MAX_VALUE;
        while (Path.size() < States.continentalStates.length) {
            for (State s : States.continentalStates) {
                if (!Path.contains(s)) {
                    if (current.capital().distance(s.capital()) < distance) {
                        nearest = s;
                        distance = current.capital().distance(s.capital());
                    }
                }
            }
            current = nearest;
            Path.add(nearest);
            distance = Double.MAX_VALUE;
        }
        Path.add(start);
        State[] temp = new State[Path.size()];
        for (int i = 0; i < Path.size(); i++) {
            temp[i] = Path.get(i);
        }
        return temp;
    }

}

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import java.util.*;
import java.util.ArrayList;

public class DominoPath {

    private static final int numDominos = 10;
    private static int longestPath = 0;
    private static ArrayList<Domino> dominoBag = new ArrayList<Domino>();
    private static ArrayList<Domino> dominosOnTable = new ArrayList<Domino>();

    /**
     * Creates a bag (an ArrayList, really) of random dominos.
     */
    private static void createDominos() {
        for (int i = 0; i < numDominos; i++) {
            int value1 = (int) (Math.random() * 6.0) + 1;
            int value2 = (int) (Math.random() * 6.0) + 1;
            dominoBag.add(new Domino(value1, value2));
        }
    }

    /**
     * Iterate through every possible starting position from the bag of dominoes,
     * and find the longest possible path from among all of the starting positions.
     * @return The longest path length encountered while evaluating every start position.
     *
     * This N! code can be made faster if you keep track of the current longest path of dominoes and compare paths to that longest path when the new path is created
     */
    private static int findLongestPath() {
        // TODO: Fill this out
        if(dominoBag.size()==0){
            return longestPath;
        }else if(dominosOnTable.size() == 0){
            //for each domino in the initial set, start with value 1
            for(int i=0; i<dominoBag.size(); i++){
                dominosOnTable.add(dominoBag.get(i));
                dominoBag.get(i).play(1);
                dominoBag.remove(i);
                longestPath++;
                findLongestPath();
            }
            //for each domino in the initial set, start with value 2
            for(int i=0; i<dominoBag.size(); i++){
                dominosOnTable.add(dominoBag.get(i));
                dominoBag.get(i).play(2);
                dominoBag.remove(i);
                longestPath++;
                findLongestPath();
            }
        }
        //for every other domino
        for(int i = 0; i<dominoBag.size();i++){
            //if this domino matches the last domino on the table
            if(dominosOnTable.get(dominosOnTable.size()-1).match(dominoBag.get(i))){
                dominosOnTable.add(dominoBag.get(i));
                dominoBag.remove(i);
                longestPath++;
                findLongestPath();
            }
        }

        return longestPath;


        //throw new NotImplementedException();
    }


    /**
     * The main entry point; creates the bag of random dominoes and finds the longest possible path
     * that may be constructed from it.
     * @param args Unused.
     */
    public static void main(String[] args) {
        createDominos();

        int maxLength = findLongestPath();

        System.out.println("Longest path length is " + maxLength + "\n");
    }

}
<<<<<<< HEAD
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import java.util.*;
=======
package com.generalassembly;

>>>>>>> e6ec09bd319f8c11c0120b091579c5c796fffe78
import java.util.ArrayList;

/**
 * A class to compute the longest possible path length from a random bag of Dominos.
 * 
 * @author      Frank Kane (fkane@sundog-soft.com)
 * @version     1.0                 
 * @since       2012-11-05
 */
public class DominoPath {

<<<<<<< HEAD
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
=======
	private static final int numDominos = 10;
	private static int longestPath = 0;
	private static ArrayList<Domino> dominoBag = new ArrayList<Domino>();
	
	/**
	 * Creates a bag (an ArrayList, really) of random dominos.
	 */
	private static void CreateDominos() {
		for (int i = 0; i < numDominos; i++) {
			int value1 = (int) (Math.random() * 6.0) + 1;
			int value2 = (int) (Math.random() * 6.0) + 2;
			dominoBag.add(new Domino(value1, value2));
		}
	}
	
	/**
	 * Recurses down into each valid matched domino for the given domino, 
	 * and keeps track of the max path length as it goes.
	 * @param d The parent domino we are finding matches for and recursing downward from.
	 * @param currentDepth The current depth of recursion, which represents the current
	 * 					   path length.
	 */
	private static void BuildTree(Domino d, int currentDepth) {
		// Check every domino in the bag. Note, this could be sped up
		// by pre-computing valid matches in a HashMap or something.
		for (int i = 0; i < numDominos; i++) {
			
			Domino candidate = dominoBag.get(i);
			
			// Domino's Match method will take care of keeping track of
			// whether this domino has already been played, and whether
			// either end of this domino matches the free end of the input
			// domino.
			if (d.Match(candidate)) {
				// If we found a match, increment the current recursion depth,
				// and recurse into the match.
				currentDepth++;
				BuildTree(candidate, currentDepth);
				// If this recursion depth is a new record, update the max depth.
				if (currentDepth > longestPath) {
					longestPath = currentDepth;
				}
				// Since we've "popped back up" from the recursion now, decrement
				// the recursion depth, and free this domino back up to be played
				// again in other paths.
				currentDepth--;
				candidate.Free();
			}
		}
	}
	
	/**
	 * Iterate through every possible starting position from the bag of dominoes,
	 * and find the longest possible path from among all of the starting positions.
	 * @return The longest path length encountered while evaluating every start position.
	 */
	private static int FindLongestPath() {
		int maxLength = 0;
		
		// For every domino in the bag...
		for (int i = 0; i < numDominos; i++) {
			// First try starting from the domino flipped one way...
			longestPath = 0;
			Domino startDomino = dominoBag.get(i);
			startDomino.Play(1);
			BuildTree(startDomino, 1);
			if (longestPath > maxLength) {
				maxLength = longestPath;
			}
			
			// And then flipped the other way...
			longestPath = 0;
			startDomino.Free();
			startDomino.Play(2);
			BuildTree(startDomino, 1);
			if (longestPath > maxLength) {
				maxLength = longestPath;
			}
		}
		
		return maxLength;
	}
	
	/**
	 * The main entry point; creates the bag of random dominoes and finds the longest possible path
	 * that may be constructed from it.
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		CreateDominos();
		
		int maxLength = FindLongestPath();
		
		System.out.println("Longest path length is " + maxLength + "\n");
	}

}
>>>>>>> e6ec09bd319f8c11c0120b091579c5c796fffe78

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class FibSequence {
    /**
     * Returns the nth fibonacci number, recursively computed.
     * The 0th fibonacci number is 0
     * The 1st is 1
     * The 2nd is 1
     * The 3rd is 2
     * etc
     * @param n The index in the fibonacci sequence to recursively calculate
     * @return The respective fibonacci number
     */
    int fibNumber(int n) {
        if(n == 0 || n==1){
            return n;
        }
        return fibNumber(n-1)+fibNumber(n-2);


        // TODO: Fill out to make FibSequenceTest pass

        //throw new NotImplementedException();
    }

}

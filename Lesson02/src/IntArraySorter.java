public class IntArraySorter {
    public int[] sortArray(int[] array) {
        for(int i=0; i<array.length; i++){

            for(int i2=i+1;i2<array.length;i2++){
                if(array[i2]<array[i]){
                    int iHolder = array[i];
                    array[i] = array[i2];
                    array[i2] = iHolder;
                }
            }

        }

        return array;
    }
}

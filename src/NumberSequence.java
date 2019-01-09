public class NumberSequence {

    public int[] squareSequence(int n){
        int[] numArray = new int[n];
        for(int i = 0; i < n; i++){
            numArray[i] = i*i;
        }

        return numArray;
    }

    public int[] cubeSequence(int n){
        int[] numArray = new int[n];
        for(int i = 0; i < n; i++){
            numArray[i] = i*i*i;
        }

        return numArray;
    }

    public int[] fibSequence(int n){
        int[] numArray = new int[n];


        numArray[0] = 1;
        numArray[1] = 1;

        for(int i=2; i<n; i++){
            numArray[i] = numArray[i-1]+ numArray[i-2];

        }
        return numArray;
    }

    public int[] triSequence(int n){
        int[] numArray = new int[n];
        int counter = 2;
        numArray[0] = 1;
        for(int i = 1; i<n; i++){
            numArray[i] = numArray[i-1] + counter;
            counter++;
        }
        return numArray;
    }
}

public class HelloWorldAgain {
    public static void main(String[] args){
        NumberSequence num = new NumberSequence();
        int[] arr = num.squareSequence(10);
        for(int x: arr){
            System.out.println(x);
        }

        int[] arrCube = num.cubeSequence(10);
        for(int y: arrCube){
            System.out.println(y);
        }

        int[] arrFib = num.fibSequence(10);
        for(int z: arrFib){
            System.out.println(z);
        }

        int[] arrTri = num.triSequence(10);
        for(int s: arrTri){
            System.out.println(s);
        }
    }
}

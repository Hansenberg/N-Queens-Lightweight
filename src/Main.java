public class Main {
    public static int boardSize = 5;
    public static int solutionCounter = 0;
    public static void main(String[] args) {
        Queen[] solution = new Queen[boardSize];
        findSolutions(0, solution);
    }
    public static void findSolutions(int x, Queen[] array){
        if(x > boardSize-1){ printSolution(array); return;}
        for(int y = 1; y <= boardSize; y++){
            boolean collides = false;
            for(int j = 0; j < x; j++){
                if(array[j].collides(x+1, y)) {collides = true; break;}
            }
            if(!collides){
                array[x] = new Queen(x+1, y);
                findSolutions(x+1, array);
            }
            array[x] = null;
        }
    }
    public static void printSolution(Queen[] array){
        //handle solution
        System.out.println("SOLUTION NUMBER " + ++solutionCounter);
        System.out.println("------------------");
        for(int i = 0; i < boardSize; i++){
            System.out.println("Queen " + (i+1) + " " + array[i]);
        }
        System.out.println("------------------");
    }

}

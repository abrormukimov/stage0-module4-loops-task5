package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        for (int y = 1; y <= sideLength; y++) {
            for (int x = 1; x <= sideLength; x++) {
                if (x == 1 || x == sideLength ||
                        y == 1 || y == sideLength) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
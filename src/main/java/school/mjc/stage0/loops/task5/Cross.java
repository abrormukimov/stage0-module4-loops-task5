package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        int midd = (sideLength / 2) + 1;
        for (int y = 1; y <= sideLength; y++) {
            for (int x = 1; x <= sideLength; x++) {
                if (y == midd || x == midd) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");

        }
    }
}
package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        int xCount = 1;
        for (int y = cathetusLength; y >= 1; y--) {
            for (int x = 1; x <= cathetusLength; x++) {
                if (x <= xCount) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
            xCount++;
        }
    }
}
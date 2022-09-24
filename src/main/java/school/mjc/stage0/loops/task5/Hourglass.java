package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int leftInd = 0;
        int rightInd = height + 1;

        for (int y = 1; y <= height; y++) {
            for (int x = 1; x <= height; x++) {
                if (leftInd >= x || rightInd <= x) {
                    System.out.print(" ");
                } else {
                    System.out.print("8");
                }
            }
            System.out.println("");
            if (y <= (height / 2)) {
                leftInd++;
                rightInd--;
            } else {
                leftInd--;
                rightInd++;
            }
        }
    }
}
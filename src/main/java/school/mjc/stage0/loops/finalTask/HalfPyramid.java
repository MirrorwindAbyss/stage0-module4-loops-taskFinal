package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for (int i = 0; i <= cathetusLength; i++) {
            for (int space = 0; space <= cathetusLength - i; space++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

       /* for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 1; j <= cathetusLength; j++) {
                if (j >= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/
    }

}

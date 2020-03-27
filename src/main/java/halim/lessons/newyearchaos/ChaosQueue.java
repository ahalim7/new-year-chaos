/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halim.lessons.newyearchaos;

/**
 *
 * @author AbdElHalim
 */
public class ChaosQueue {

    public static void main(String[] args) {
        minimumBribes(new int[]{2, 5, 1, 3, 4});
    }

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        int brides = 0;
        for (int i = q.length - 1; i >= 0; i--) {
            if (q[i] - (i + 1) > 2) {
                System.out.println("Too chaotic");
                return;
            }
            for (int j = Math.max(0, (q[i] - 2)); j < i; j++) {
                if (q[j] > q[i]) {
                    brides++;
                }
            }
        }
        System.out.println(brides);
    }
}

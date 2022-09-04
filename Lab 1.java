import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        float[] f = new float[10];
        float n = 19;
        for(int i = 0; i <= 9; i++) {
            f[i] = n;
            n -= 2;
        }
        double[] x = new double[15];
        for(int i = 0; i <= 14; i++){
            x[i] = Math.random() * 26 - 10;
        }
        List<Integer> nums = new ArrayList<>(List.of(1, 7, 11, 15, 19));
        double[][] t = new double[10][15];
        for(int i = 0; i <= 9; i++){
            for(int j = 0; j <= 14; j++) {
                if (f[i] == 9) {
                    t[i][j] = Math.tan(0.5 * Math.sin(x[j]));
                }
                else if (nums.contains(f[i])){
                    t[i][j] = Math.pow(((Math.pow(Math.pow(x[j] / 0.25, x[j]), 3 - Math.cos(x[j]))) + 4) / (Math.pow((2 / Math.tan(x[j])), 3)),
                            Math.atan(Math.sin(x[j])));
                }
                else{
                    t[i][j] = Math.tan(Math.asin(Math.exp(Math.cbrt(Math.abs(x[j]) / -2))));
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 14; j++) {
                System.out.printf(" %.2f ", t[i][j]);
            }
            System.out.println();
        }
    }
}

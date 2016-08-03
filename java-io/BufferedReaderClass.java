import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
class BufferedReaderClass {
    public static void main(String[] args) throws IOException {
        long t0 = System.nanoTime();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int i=0;
        int[] v = new int[10000000];
        int N=Integer.parseInt(input.readLine());
        while(N!=0){
          v[i]=N;
          N=Integer.parseInt(input.readLine());
          ++i;
        }
        long t = System.nanoTime();
        System.out.println("Execution Time: "+((t - t0)/1000000)+" ms");
    }
}

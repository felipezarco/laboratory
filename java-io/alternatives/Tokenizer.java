import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

class TokenizerClass {
    public static void main(String[] args) throws IOException {
        long t0 = System.nanoTime();

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(input.readLine());
        int i=0;
        int[] v = new int[10000000];
        int N=Integer.parseInt(tokenizer.nextToken());
        while(N!=0){
          v[i]=N;
          tokenizer = new StringTokenizer(input.readLine());
          N=Integer.parseInt(tokenizer.nextToken());
          ++i;
        }

        long t = System.nanoTime();
        System.out.println("Execution Time: "+((t - t0)/1000000)+" ms");
    }
}

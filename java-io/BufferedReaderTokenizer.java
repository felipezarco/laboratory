import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

class BufferedReaderTokenizer {
    public static void main(String[] args) throws IOException {
        long t0 = System.nanoTime();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(input.readLine());
        int i = 0;
        Data[] v = new Data[10000000];
        String[] line = input.readLine().split(" ");
        int N=Integer.parseInt(tokenizer.nextToken());
        while(N!=0) {
          v[i] = new Data(N,tokenizer.nextToken());
          tokenizer = new StringTokenizer(input.readLine());
          N = Integer.parseInt(tokenizer.nextToken());
          ++i;
        }
        long t = System.nanoTime();
        System.out.println("Execution Time: "+((t - t0)/1000000)+" ms");
    }

    public static class Data {
     int number;
     String text;
     public Data(int n, String t){
       number = n;
       text = t;
     }
   }
}

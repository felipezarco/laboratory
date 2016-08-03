import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
class BufferedReaderMultiple {
    public static void main(String[] args) throws IOException {
        long t0 = System.nanoTime();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        Data[] v = new Data[10000000];
        String[] line = input.readLine().split(" ");
        int N=Integer.parseInt(line[0]);
        while(N!=0){
          v[i] = new Data(N,line[1]);
          line = input.readLine().split(" ");
          N = Integer.parseInt(line[0]);
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

import java.util.Scanner;
class ScannerMultiple {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        Scanner input = new Scanner(System.in);
        int i=0;
        Data[] v = new Data[10000000];
        int N=input.nextInt();
        while(N!=0) {
          v[i] = new Data(N,input.next());
          N = input.nextInt();
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

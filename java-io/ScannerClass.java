import java.util.Scanner;
class ScannerClass {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        Scanner input = new Scanner(System.in);
        int i=0;
        int[] v = new int[10000000];
        int N=input.nextInt();
        while(N!=0){
          v[i]=N;
          N=input.nextInt();
          ++i;
        }
        long t = System.nanoTime();
        System.out.println("Execution Time: "+((t - t0)/1000000)+" ms");
    }
}

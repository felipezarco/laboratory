import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Random;
class RandomizeClass {
  public static void main(String args[]) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    Random rand = new Random();
    for(int i=0;i<10000000;++i) {
      bw.write(Integer.toString(rand.nextInt((1000000000 - 2) + 1) + 2));
      bw.newLine();
    }
    bw.write("0");
    bw.newLine();
    bw.close();
  }
}

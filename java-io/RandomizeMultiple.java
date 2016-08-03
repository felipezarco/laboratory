import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;
class RandomizeMultiple {
  public static void main(String args[]) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    for(int i=0;i<10000000;++i) {
      bw.write(Integer.toString(ThreadLocalRandom.current().nextInt(2,1000000000))+" ");
      for(int j=0;j<ThreadLocalRandom.current().nextInt(1, 10 + 1);++j) bw.write(ThreadLocalRandom.current().nextInt(65, 90 + 1));
      bw.newLine();
    }
    bw.write("0");
    bw.newLine();
    bw.close();
  }
}

import java.util.Arrays;
import java.util.Random;

public class odev50syii {
public static void main(String[] args) {
    int[] sayilar = new int[50];
    Random rastgele = new Random();
    for(int i = 0; i < sayilar.length; i++){
        sayilar[i] = rastgele.nextInt(100);
    }
    Arrays.sort(sayilar);
    for(int s : sayilar){
        System.out.println(s);
    }
  }
}



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<String> degraus = new ArrayList();
        System.out.print("Digite a quantidade de degraus desejados: ");
        int n = entrada.nextInt();

        for(int i = 0; i < n; ++i) {
            String var10001 = " ".repeat(n - i);
            degraus.add(var10001 + "*".repeat(i + 1));
        }

        Iterator var6 = degraus.iterator();

        while(var6.hasNext()) {
            String d = (String)var6.next();
            System.out.println(d);
        }

    }
}

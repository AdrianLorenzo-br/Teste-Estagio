import java.util.ArrayList;
import java.util.List;

public class Primos {

    Boolean e_primo(int n){
        if (n < 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    void primo_Linear(int numero){
        if(numero >= 0) {
            for (int i = 0; i <= numero; i++) {
                if (e_primo(i) == true) {
                    System.out.print(i + " ");
                }
            }
        }else{
            System.out.println("o numero deve ser maior ou igual a zero");
        }
    }


    public List<Integer> primo_Recursivo(int n, int i) {
        if (i > n) {
            return new ArrayList<>();
        }
        List<Integer> primos = primo_Recursivo(n, i + 1);

        if(e_primo(i) == true){
            primos.addFirst(i);
        }
        return primos;
    }


    public static void main(String[] args) {
        Primos teste = new Primos();
        System.out.print(teste.primo_Recursivo(20 , 1));
    }
}

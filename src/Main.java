import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        //Exemplo inicial
        Function<Integer, Integer> vezesDois = n -> n*2;
        Function<Integer, Integer> vezesTres = n -> n*3;

        System.out.println(vezesTres.andThen(vezesDois).apply(10));
        //Qual a ordem?
        //Exemplo com log
        vezesDois = n -> {
            System.out.println("vezesDois");
            return n * 2;
        };

        vezesTres = n -> {
            System.out.println("vezesTres");
            return n * 3;
        };

        System.out.println(vezesTres.andThen(vezesDois).apply(10));


        //Exemplo com corrente
        Function<Integer, Integer> corrente = vezesTres.andThen(vezesDois);
        System.out.println(corrente.apply(10));
    }


}

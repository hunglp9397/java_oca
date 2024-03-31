package building;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;




import static java.lang.Math.*;

public class MainTestAnimal {

    void a() {

    }

    int x;

    public MainTestAnimal() {
        super();
    }

    static double method() {
        return PI;
    }

    public static long square(int x) {
        long y = x * x;
        return y;
    }


    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

//        print(animals, new CheckIfHopper());
        print(animals, (Animal a) -> a.canHop());


    }


    private static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals) {
            if (checker.test(animal)) // the general check
                System.out.print(animal + " ");
        }
        System.out.println();
    }
}



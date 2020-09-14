import ru.ifmo.se.pokemon.*;
import pokemons.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        b.addAlly(new Deoxys("Брукс", 1));
        b.addAlly(new Xatu("Виктор", 2));
        b.addAlly(new Natu("Имануил", 1));
        b.addFoe(new Happiny("Калеб", 3));
        b.addFoe(new Chansey("Тайсон", 1));
        b.addFoe(new Blissey("Корнелиус", 2));

        b.go();
    }
}

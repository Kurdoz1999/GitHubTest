import java.util.ArrayList;
import java.util.Collections;

public class ArrayListF {
    public static void main(String[] args) {
        //Array som vi som udgangspunkt ville gøre brug af kræver at man kender til
        // til det maksimale antal objekter i hvert array:
        String[] fruits = new String[3];
        fruits[0] = "Strawberry";
        fruits[1] = "Mango";
        fruits[2] = "Apple";
        System.out.println(fruits[1]);

        //ArrayList gør det nemt for os at tilføje, udskifte, fjerne og søge efter objekter (mm.) i
        // hvert ArrayList:
        ArrayList<String> fruitss= new ArrayList<String>();
        fruitss.add("Watermelon"); //Tilføjer et objekt til arraylistet
        fruitss.add("Apple");
        fruitss.add("Pear");
        fruitss.add("Mango");
        fruitss.add("Banana");
        System.out.println("Which frutis can i choose from? " + fruitss);
        //Endnu måde til at fremvise objekterne i arraylistet
        System.out.println("Fruits I can choose from:");
        for(int i=0; i<fruitss.size(); i++) {
            System.out.println(fruitss.get(i));
        }
        //Endnu måde til at fremvise objekterne i arraylistet
        System.out.println("Fruits I can choose from:");
        Collections.sort(fruitss); //Sortere i objekterne således at det står i alfabetisk rækkefølge
        for(String i : fruitss){
            System.out.println(i);
        }
        //Forskellige metoder man kan bruge i ArrayList:
        fruitss.set(4,"Grape"); //Skifter et objekt ud med et andet objekt
        fruitss.remove("Watermelon"); //Fjerner et objekt fra arraylistet
        System.out.println("Which fruits can i choose from? " + fruitss);
        String input = "Pineapple";
        System.out.println("Can i choose a "+ input +"? " + fruitss.contains(input));
        fruitss.clear(); //Clearer hele arraylistet
        System.out.println("Which fruits can i choose from? " + fruitss);
        fruitss.add("Raspberry");
        System.out.println("Which fruits can i choose from? " + fruitss);

    }
}

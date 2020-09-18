package blinovtask;

public class Clone {
        public static void main (String [] args) {
            Item ar1 [] = {new Item (1), new Item (2), new Item (3)};
            Item ar2 [] = ar1.clone ();
            ar2 [0].item = 4;
            System.out.println (ar1 [0].item +" " + ar1 [1].item + " " + ar1 [2].item);
        }
    }

// переопределен метод clone(), который производит поэлементное копирование.
//если коптрумый объкет содержит ссылки на другие объекты, то ссылки будут скопированы,
// дубликаты тех объектов не создаются
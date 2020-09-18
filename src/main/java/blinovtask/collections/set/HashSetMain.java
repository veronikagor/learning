package blinovtask.collections.set;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetMain {
    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>(1000);
        words.add("8Y1");
        words.add("2Y2");
        words.add("2Y");
        words.add("8Y1");// одинаковые не добавятся
        words.add("6Y");
        words.add("5Z");
        words.add("4Y4");
        System.out.println(words);
        for( String element : words){
            System.out.println(words.hashCode() + " ");// hashCode в разбросанном порядке
        }
        TreeSet<String> set = new TreeSet<>(words);// можно создать HashSet для добавления, а потом
        // перевести в TreeSet для удобства пользования
    }
}

/* LinkedHashSet, HashSet, TreeSet */
// Интерфейс Set(множество без дубликатов) определяет уникальность хранимых объектов
// с помощью реализации метода equals(), а здесь он не переопределен.

// Set может хранить null(LinkedHashSet, HashSet, но не TreeSet)

// HashSet хранит элементы в произвольном порядке,(упорядочивает по хэшу чтобы быстрее искать) но зато быстро ищет.
// метод equals() hashCode() используется классом HashSet для эффективного размещения объектов, заносимых в коллекцию.
//не синхронизируется.
// порядок вывода элементов  не определен
// не предоставляют индексный доступ к хранимым элементам.
// если 75% коллекции загружено - HashSet уже выделяет допместо

// LinkedHashSet с хранением элементов в порядке добавления, но зато работает медленнее.
//LinkedHashSet наследуется от HashSet и имеет тот же набор конструкторов, что и HashSet;
// не синхронизируется.
//порядок вывода элементов  не определен
// не предоставляют индексный доступ к хранимым элементам.



// TreeSet, в котором объекты хранятся отсортированными по возрастанию в порядке сравнения
// compareTo() для добавления элементов (Интерфейс Comparator)
// реализует Navigable
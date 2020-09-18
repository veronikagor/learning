package blinovtask.inheritance.overriding;

    public class ParentQuest {
        protected ParentQuest(){ //В случае использования private и protected
            // объект класса может быть создан с помощью статического метода класса,
            // который вызывает такой конструктор.
            int i = '1';
            System.out.print(i + " ");
        }
    }

//Применение final или abstract при объявлении конструктора не имеет смысла,
// потому что он не участвует в наследовании
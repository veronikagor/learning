package blinovtask.enums;

public enum MusicType {
    ROCK("Rock"), JAZZ("Jazz"), CLASSIC; // добавляем переиенную realName прямо в конмтруктор

    private String realName;// у элементов перечисления могут быть свои поля

   private MusicType(){
        System.out.println(name() + " " + ordinal());// при запуске программы инициализируются сразу
        // все перечисления даже без явного объявления конструктора
    }

    MusicType(String realName) {
        this.realName = realName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void info(){
        switch (this) {
            case JAZZ:
                System.out.println("this is " + realName);
                break;
            case ROCK:
                System.out.println("this is " + realName);
                break;
            case CLASSIC:
                System.out.println("this is classic");
                break;
            default:
                System.out.println("style out");
        }
    }
}
// перечисление является классом, не наследуются, не бывают абстрактными, но могут содержать абстрактный метод
//В теле перечисления можно объявлять методы, поля и конструкторы.
// Конструктор перечисления определяется без модификатора доступа или с модификатором private.
// Перечисления неявно наследуются от класса java.lang.Enum.
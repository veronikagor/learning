package blinovtask.enums;

public class RunnerMusicType {
    public static void main(String[] args) {
        MusicType type = MusicType.CLASSIC; // 1-ый способ создания перечисления
        MusicType type0 = MusicType.CLASSIC; // 1-ый способ создания перечисления

        MusicType type1 = MusicType.valueOf("ROCK"); // 2-ой способ создания перечисления

        String value = "Rock ";
        MusicType type2 = MusicType.valueOf(value.toUpperCase().trim());// 3-ий способ создания перечисления

        if (type == type0) {
            System.out.print("true ");
        }// можно сравнивать перечисления
        else {
            System.out.print("false ");
        }

        type.info();

        System.out.println(type.compareTo(type1));

    }
}
//output:
//ROCK 0
//JAZZ 1
//CLASSIC 2
//true
// this is classic
package chapter_3;

public class Practice3_3 {
    public static void main(String[] args) {
        int isHungry = 1; // 1: お腹が空いている, 0: お腹が空いていない
        String food = "カレー"; // 食べたいもの

        System.out.println("こんにちは");

        if (isHungry == 0) {
            System.out.println("お腹がいっぱいです");
        } else {
            System.out.println("はらぺこです");
            System.out.println("食べ物は" + food + "です");
            System.out.println("いただきます");
        }
        System.out.println("ごちそうさまでした");
        System.out.println("さようなら");
    }
}
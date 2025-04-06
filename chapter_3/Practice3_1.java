package chapter_3;

public class Practice3_1 {
    public static void main(String[] args) {

        // 設問1
        int weight = 60; // 体重
        if (weight == 60) {
            System.out.println("体重は60kgです。");
        }

        // 設問2
        int age1 = 20; // 年齢
        int age2 = 30; // 年齢
        int sum = age1 + age2; // 年齢の合計
        if (sum * 2 > 60) {
            System.out.println("年齢の合計は60歳を超えています。");
        }

        // 設問3
        int age = 25; // 年齢
        if (age % 2 != 0) {
            System.out.println("年齢は奇数です。");
        }

        // 設問4
        String name = "湊"; // 名前
        if (name.equals("湊")) {
            System.out.println("名前は湊です。");
        }
    }
}

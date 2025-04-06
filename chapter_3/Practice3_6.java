package chapter_3;

public class Practice3_6 {
    public static void main(String[] args) {
        // byte型の範囲は-128~127
        byte chalenge = 5; // チャンスの回数
        byte range = 9; // 数字の範囲(127までの自然数)

        System.out.println("~~数当てゲーム~~");
        System.out.println("1~" + range + "の数字を当ててください。(チャンスは5回です)");
        
        java.util.Random random = new java.util.Random();
        byte ans = (byte) (random.nextInt(range) + 1); // 正解の整数をランダムで生成する

        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            for (byte i = 0; i < chalenge; i++) {
                System.out.print((i+1) + "回目の挑戦: "); // 何回目の挑戦か表示
            
                byte num = scanner.nextByte(); // 1~rangeの数字を入力
                // 入力された数字と正解の数字を比較する
                if (num == ans) {
                    System.out.println("正解です！おめでとう！");
                    break; // 正解したらループを抜ける
                } else if (num < ans) {
                    System.out.println("もっと大きい数字です。");
                } else {
                    System.out.println("もっと小さい数字です。");
                }

                // 残りの挑戦回数を表示する
                if( chalenge - (i+1) > 1) {
                    System.out.println("残り" + (chalenge - (i+1)) + "回の挑戦が可能です。");
                } else if (chalenge - (i+1) == 1) {
                    System.out.println("ラストチャンスです！");
                } else if (chalenge - (i+1) == 0) {
                    // 5回目の挑戦が終わった場合
                    System.out.println("ゲームオーバー！正解は" + ans + "でした。");
                }
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("無効な入力です。1~"+range+"の数字を入力してください。");
        }
    }
}
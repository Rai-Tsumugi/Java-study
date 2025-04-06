package chapter_3.makeSelf;

public class fibonacci { // これはJavaの練習コードです
    public static void main(String[] args) {
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            long startTime = System.currentTimeMillis(); // 開始時間を記録

            System.out.println("計算を行う時間を入力してください。(秒数)"); // ユーザーに入力を促す
            int time = scanner.nextInt(); // ユーザーからの入力を受け取る
            System.out.println("計算を開始します。"); // 計算開始のメッセージを表示

            // フィボナッチ数列の計算
            int i = 0; // カウンタ
            long a = 0, b = 1, c = 0; // フィボナッチ数列の初期値

            i++; // カウンタをインクリメント
            System.out.print(i + " : " + "\t"); // 初期値を表示
            System.out.print(a);
            System.out.println(""); // 改行
            i++; // カウンタをインクリメント
            System.out.print(i + " : " + "\t"); // 初期値を表示
            System.out.print(b);
            System.out.println(""); // 改行

            while (System.currentTimeMillis() - startTime < time * 1000) { // 指定時間内に計算を行う
                i++; // カウンタをインクリメント

                c = a + b; // フィボナッチ数列の計算
                a = b; // 次の値のために更新
                b = c; // 次の値のために更新

                System.out.print(i + " : " + "\t"); // 計算値を表示
                System.out.print(c);
                System.out.println(""); // 改行
            }

            System.out.println(time + "秒で" + i + "個の計算を行いました。"); // 結果を表示

        } catch (Exception e) {
            System.out.println("エラーが発生しました: " + e.getMessage()); // エラーメッセージを表示
        }

    }
}
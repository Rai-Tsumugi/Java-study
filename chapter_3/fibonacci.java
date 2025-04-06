package chapter_3;

import java.math.BigInteger;

/*
 * フィボナッチ数列を計算するプログラム
 * ユーザーが指定した時間内にフィボナッチ数列を計算し、結果を表示します。
 * 目安として、5秒間に約2.2万回, 10秒間に約3.3万回の計算が可能です。
 * BigIntegerを使用しているため、非常に大きな数値も扱うことができます。
 * ただし、数字が非常に大きくなるため、30秒以上の長時間を設定するには注意が必要です。
 */


public class fibonacci { // これはJavaの練習コードです
    public static void main(String[] args) {
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {

            System.out.println("計算を行う時間を入力してください。(秒数)"); // ユーザーに入力を促す
            int time = scanner.nextInt(); // ユーザーからの入力を受け取る
            System.out.println("計算を開始します。"); // 計算開始のメッセージを表示

            // フィボナッチ数列の計算
            long i = 0; // カウンタ
            BigInteger a = BigInteger.ZERO, b = BigInteger.ONE, c = BigInteger.ZERO; // BigIntegerを使用

            i++; // カウンタをインクリメント
            System.out.print(i + " : " + "\t"); // 初期値を表示
            System.out.print(a);
            System.out.println(""); // 改行
            i++; // カウンタをインクリメント
            System.out.print(i + " : " + "\t"); // 初期値を表示
            System.out.print(b);
            System.out.println(""); // 改行

            long startTime = System.currentTimeMillis(); // 開始時間を記録
            while (System.currentTimeMillis() - startTime < time * 1000) { // 指定時間内に計算を行う
                i++; // カウンタをインクリメント

                c = a.add(b); // フィボナッチ数列の計算 (BigIntegerの加算)
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
import java.util.Random;

public class StudySpace {
    public static void main(String[] args) {
        // 開始時間を取得
        long startTime = System.currentTimeMillis();

        int length = 1_000_000; // 配列の長さ
        char[] base = {'A', 'T', 'C', 'G'}; // 塩基の種類
        Random random = new Random();

        /*
         *  10 文字ごとに空白、100 文字ごとに改行を入れるので、
         *  length の要素数に加えて、その分だけ余裕を見たバッファを用意します。
         *  （length/10 個程度の空白 + length/100 個程度の改行 + α ）
         */
        char[] outputBuffer = new char[length + length / 10 + length / 100 + 10];

        // バッファに書き込んだ要素数を数える
        int pos = 0;

        // length 回だけランダム塩基を生成してバッファに格納
        for (int i = 0; i < length; i++) {
            // ランダムで 0..3 の整数を取得し、その塩基を char 配列に書き込む
            outputBuffer[pos++] = base[random.nextInt(4)];

            // 10文字おきに空白、100文字おきに改行を入れる(元コードのロジックを踏襲)
            if (i != 0 && i % 10 == 0) {
                // 100文字ごとかどうか
                if (i % 100 == 0) {
                    outputBuffer[pos++] = '\n';
                } else {
                    outputBuffer[pos++] = ' ';
                }
            }
        }

        // まとめて出力
        System.out.print(new String(outputBuffer, 0, pos));

        // 終了時間を取得
        long endTime = System.currentTimeMillis();
        // 動作時間を計算
        double duration = (endTime - startTime) / 1000.0;
        // 動作時間を表示
        System.out.println();
        System.out.println("動作時間: " + duration + "秒");
    }
}

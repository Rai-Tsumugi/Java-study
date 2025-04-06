package chapter_3;

public class Practice3_5 {
    public static void main(String[] args) {
        int selected; // 選択されたメニュー番号
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            System.out.println("[メニュー] 1:検索 2:登録 3:削除 4:変更>");
            selected = scanner.nextInt(); // メニュー番号を入力
            switch (selected) {
                case 1:
                    System.out.println("検索を実行します。");
                    break;
                case 2:
                    System.out.println("登録を実行します。");
                    break;
                case 3:
                    System.out.println("削除を実行します。");
                    break;
                case 4:
                    System.out.println("変更を実行します。");
                    break;
                default:
                    
                    break;
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("無効な入力です。整数を入力してください。");
            return; // 異常終了
        }       
    }
}
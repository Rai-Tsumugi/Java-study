package chapter_2;

public class Main3 {
    public static void main(String[] args) {
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            System.out.println("ようこそ占いの館へ");
            System.out.println("あなたの名前を教えてください");
            String name = scanner.nextLine();
            System.out.println("あなたの年齢を教えてください");
            String ageString = scanner.nextLine();
            int age = Integer.parseInt(ageString);
            int fortune = new java.util.Random().nextInt(4);
            fortune++;
            System.out.println("占いの結果が出ました！");
            System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です。");
            System.out.println("1:大吉 2:中吉 3:小吉 4:凶");
        } catch (NumberFormatException e) {
            System.out.println("年齢は数字で入力してください。");
        }
    }
}

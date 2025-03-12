public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            // 例外処理を追加
            throw new IllegalArgumentException("0で割ることはできません");
        }
        return a / b;
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2, 3));
        System.out.println(calculator.subtract(5, 2));
        System.out.println(calculator.multiply(4, 6));
        System.out.println(calculator.divide(10, 2));


        // 0 除算のテストケース
        try {
            System.out.println(calculator.divide(5, 0));
        } catch (IllegalArgumentException e) {
            System.out.println("例外が発生しました: " + e.getMessage());
        }

    }
}

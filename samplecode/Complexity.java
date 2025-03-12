public class ComplexExample {

    public int complexMethod(int a, int b, int c) {
        if (a > b) {
            if (b > c) {
                return a + b;
            } else {
                if (a > c) {
                    return a + c;
                } else {
                    return b + c;
                }
            }
        } else {
            if (a > c) {
                return a + b;
            } else {
                if (b > c) {
                    return b + c;
                } else {
                    return a + c;
                }
            }
        }
    }
}

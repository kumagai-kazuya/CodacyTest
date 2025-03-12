public class StringHelper {

    public String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public String reverseStringAnotherWay(String str) { // 重複したロジック
        return new StringBuilder(str).reverse().toString();
    }


    public boolean isPalindrome(String str) {
        String reversed = reverseString(str);
        return str.equals(reversed);
    }
}

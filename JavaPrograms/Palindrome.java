public class Palindrome {
    
    public static void main(String args[]) {
        System.out.println(PalidromicNumber(111 ));
    }

    public static String reverse(String myStr) {
        String str = "";
        for (int i=myStr.length()-1; i>=0; i--) {
            str += myStr.charAt(i);
        }
        return str;
    }

    public static String ensureLength(String myStr) {
        String newStr = myStr;
        while(newStr.length()<3) {
            newStr = "0" + newStr;
        }
        return newStr;
    }

    public static boolean PalidromicNumber(int myNum) {
        
        int finalNum = 0;
        for (int i=0; i<=3; i++) {
            String num = "" + myNum;
            String newNum = ensureLength(num);
            String reverse = reverse(newNum);
            int newOriginal = Integer.parseInt(reverse);
            finalNum += newOriginal;
            System.out.println(finalNum);
            myNum =finalNum;
        }
        String newFinal = "" + finalNum;
        String otherFinal = reverse(newFinal);
        if (otherFinal.equals(newFinal)) {
            return true;
        } else {
            return false;
        }

    



    }
}

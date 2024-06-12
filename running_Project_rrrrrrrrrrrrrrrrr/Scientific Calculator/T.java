import java.util.Scanner;
public class T {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String word: ");
        String str = scanner.nextLine();
        for(int i=0; i<str.length(); i++){
            if(isNumber(str.charAt(i))){
                System.out.println(str.charAt(i) + " is a number");
            }else if(isOperator(str.charAt(i))){
                System.out.println(str.charAt(i) + " is a operator");
            }else{
                System.out.println(str.charAt(i) + " is a character");
            }
        }
    }

    static boolean isNumber(char c) {
        if(c>='0' && c<='9'){
            return true;
        }
        return false;
    }

    static boolean isOperator(char c) {
        if(c=='+' || c=='-' || c=='*' || c=='/' || c=='%'){
            return true;
        }
        return false;
    }
}

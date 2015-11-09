import java.util.Scanner;

/**
 * Created by ycao on 9/11/2015.
 */
public class vowelCounter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int aCounter = 0;
        int eCounter = 0;
        int iCounter = 0;
        int oCounter = 0;
        int uCounter = 0;

        for (int i=0; i<str.length(); i++){
            char  ch = str.charAt(i);
            if (ch == 'a'){
                aCounter ++;
            }
            if (ch == 'e'){
                eCounter ++;
            }
            if (ch == 'i'){
                iCounter ++;
            }
            if (ch == 'o'){
                oCounter ++;
            }
            if (ch == 'u'){
                uCounter ++;
            }
        }
        System.out.println("String: " + str);
        System.out.println("Contains " + aCounter + " A");
        System.out.println("Contains " + eCounter + " E");
        System.out.println("Contains " + iCounter + " I");
        System.out.println("Contains " + oCounter + " O");
        System.out.println("Contains " + uCounter + " U");
    }


}

public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {

    }

    public static String capVowelsLowRest (String string) {
        String ans = "";
        int i = 0;
        while(i < string.length()){
            char ch = string.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                ans = ans + (char)(ch - 32);
            }
            else{
                if (ch >= 65 && ch <= 90 && (ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U')){
                    ans = ans + (char)(ch + 32);
                }
                else{
                    ans = ans + ch;
                }
            }
            i++;
        }
        return ans;
    }

    public static String camelCase (String string) {
        String ans = "";
        int i = 0;
        while(i < string.length()){
            char ch = string.charAt(i);
            if (ch != ' '){
                break;
            }
            i++;
        }
        while(i < string.length() && string.charAt(i) != ' '){
            char ch = string.charAt(i);
            if (ch >= 'A' && ch <= 'Z'){
                ans += (char)(ch + 32);
            }
            else{
                ans += ch;
            }
            i++;
        }
        while(i < string.length()){
            char ch = string.charAt(i);
            if (ch == ' ' && i + 1 < string.length() && string.charAt(i + 1) >= 'a' && string.charAt(i) <= 'z'){
                ans += (char)(string.charAt(i + 1) - 32);
                i++;
            }
            else if(ch == ' ' && i + 1 < string.length() && string.charAt(i + 1) >= 'A' && string.charAt(i) <= 'Z'){
                ans += (char)(string.charAt(i + 1));
                i++;
            }
            else if(ch >= 'A' && ch <= 'Z'){
                ans += (char)(ch + 32);
            }
            else if (ch != ' '){
                ans += ch;
            }
            i++;
        }
        return ans;
    }

    public static int[] allIndexOf (String string, char chr) {
        int count = 0;
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) == chr){
                count++;
            }
        }
        int[] array = new int[count];
        int j = 0;
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) == chr){
                array[j] = i;
                j++;
            }
        }
        return array;
    }
}

// To check Duplicate Characters in the given string.

class duplicate_char_in_String {
    public static void main(String[] args) {

        String str = "beautiful beach";
        char[] carray = str.toCharArray();

        System.out.println("The string is:" + str);
        System.out.print("\nDuplicate Characters in above string are: ");

        for (int i = 0; i < str.length(); i++) 
         {
            for (int j = i + 1; j < str.length(); j++) 
             {
                 if (carray[i] == carray[j]) 
                {
                    System.out.print(carray[j] + " ");
                    break;
                }
            }
        }
    }
}

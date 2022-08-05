public class KeyPadCombination
{

    public static  String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    //function
    public static  void KeypadCombination(String s , int idx , String combination)
    {
        if(idx==s.length())
        {
            System.out.println(combination);
            return ;
        }
        char curr = s.charAt(idx);
        String mapping = keypad[curr - '0'];
        for(int i = 0 ; i<mapping.length() ;i++)
        {
            KeypadCombination(s,idx+1,combination+mapping.charAt(i));
        }

    }

    //main function

    public static void main(String[] args)
    {
        String s = "23" ;
        KeypadCombination(s,0,"");
    }

}

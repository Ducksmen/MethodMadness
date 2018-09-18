package JHoang;

public class JHoangLib {

    public static void println(String str)
    {
        System.out.println(str);
    }

    public static String cutOut(String mainStr, String subStr)
    {
        int location = mainStr.indexOf(subStr);
        {
            if (location > 0)
            {
                String partOne = mainStr.substring(0, location);
                String partTwo = mainStr.substring(location + 1);
                String part = partOne + partTwo;
                return part;
            }
            else
            {
                String part = mainStr.substring(location + 1);
                return  part;
            }
        }
    }

    public static int stringUnion(String word1, String word2, String word3)
    {
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        int sharedNum = 0;
        for(int i = 0; i > 26; i ++)
        {
            a
        }
    }
}



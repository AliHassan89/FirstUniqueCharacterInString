/*

First unique character in string

 */
package firstuniquecharacterinstring;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Ali
 */
public class FirstUniqueCharacterInString 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println(findFirstUniqueCharacter("aaabcdefffghjikl")  == 'b' ? "1. Passed" : "1. Not Passed");
        System.out.println(findFirstUniqueCharacter("abacabaabacaba")    == '_' ? "2. Passed" : "2. Not Passed");
        System.out.println(findFirstUniqueCharacter("z")                 == 'z' ? "3. Passed" : "3. Not Passed");
        System.out.println(findFirstUniqueCharacter("bcccccccb")         == '_' ? "4. Passed" : "4. Not Passed");
        System.out.println(findFirstUniqueCharacter("bcccccccccccccyb")  == 'y' ? "5. Passed" : "5. Not Passed");
        System.out.println(findFirstUniqueCharacter("abcdefghijklmnopqrstuvwxyziflskecznslkjfabe")           == 'd' ? "6. Passed" : "6. Not Passed");
        System.out.println(findFirstUniqueCharacter("zzz")                                                   == '_' ? "7. Passed" : "7. Not Passed");
        System.out.println(findFirstUniqueCharacter("xdnxxlvupzuwgigeqjggosgljuhliybkjpibyatofcjbfxwtalc")   == 'd' ? "8. Passed" : "8. Not Passed");
        System.out.println(findFirstUniqueCharacter("ngrhhqbhnsipkcoqjyviikvxbxyphsnjpdxkhtadltsuxbfbrkof")  == 'g' ? "9. Passed" : "9. Not Passed");
        System.out.println(findFirstUniqueCharacter("ccbbaa")  == '_' ? "10. Passed" : "10. Not Passed");
    }
    
    private static char findFirstUniqueCharacter(String s) 
    {
        
        if (s.length() == 0)
        {
            return '_';
        }
        
        Map<Character, Integer> map = new LinkedHashMap<>();
        
        int temp_count;
        //O(N)
        for(int i=0; i<s.length(); i++)
        {
            temp_count = 0;
            if (map.get(s.charAt(i)) != null)
            {
                temp_count = map.get(s.charAt(i)); 
            }
            temp_count++;
            map.put(s.charAt(i), temp_count);
        }
        
        Iterator it = map.entrySet().iterator();
        char key = '\0';
        //
        while (it.hasNext())
        {
            Map.Entry pair = (Map.Entry)it.next();            
            if ((Integer)pair.getValue() == 1)
            {
                key = (Character)pair.getKey();
                break;
            }
        }
        
        return key == '\0' ? '_' : key;
    }
}

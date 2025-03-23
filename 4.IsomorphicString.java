import java.util.HashMap;
import java.util.HashSet;

class IsomorphicString {
    public static void main(String[] args) {
        String str1="aab";
        String str2="daf";
        System.out.println(isIsomorphic(str1,str2));
    }
    public static boolean isIsomorphic(String s,String t){
        if(s.length()!=t.length()) return false;
        HashMap<Character,Character> mp=new HashMap<>();
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            if(mp.containsKey(ch1)){
                if(mp.get(ch1)!=ch2){
                    return false;
                }
            }else if(hs.contains(ch2)){
                return false;
            }else{
                mp.put(ch1,ch2);
                hs.add(ch2);
            }
        }
        return true;
    }
}

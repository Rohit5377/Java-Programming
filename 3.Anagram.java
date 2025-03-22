import java.util.HashMap;

class Anagram {
    public static void main(String[] args) {
        String str1="anagram";
        String str2="gramana";
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            if(mp.containsKey(ch)){
                mp.put(ch,mp.get(ch)+1);
            }else{
                mp.put(ch,1);
            }
        }
        for(int i=0;i<str2.length();i++){
            char ch=str2.charAt(i);
            if(mp.containsKey(ch)){
                mp.put(ch,mp.get(ch)-1);
                if(mp.get(ch)==0){
                    mp.remove(ch);
                }
            }

        }
        if(mp.isEmpty()){
            System.out.println("Anagram String");
        }else{
            System.out.println("Not Anagram String");
        }
    }
}

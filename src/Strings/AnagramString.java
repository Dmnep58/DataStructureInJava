package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
find the  anagram string present in the array of string
 */
public class AnagramString {

    public List<List<String>> anagram(List<String> word, List<String> chars){
        List<List<String>> s= new ArrayList<>();



        for(int i=0;i<chars.size();i++){
            String ch = chars.get(i);
            List<String> inside = new ArrayList<>();

            for(int j=0;j<word.size();j++){
                if(isanagram(ch,word.get(j)) == true) {
                    inside.add(word.get(j));
                }

            }
            if(inside.size() > 0){
                s.add(inside);
            }

        }

        return s;
    }

    private boolean isanagram(String ch, String s) {


        if(s.length()!=ch.length()){
            return false;
        }
        else {
            char[] ch1 = new char[s.length()];
            char[] ch2 = new char[ch.length()];

            for (int i = 0; i < ch1.length; i++) {
                ch1[i] = s.charAt(i);
                ch2[i] = ch.charAt(i);
            }

            Arrays.sort(ch1);
            Arrays.sort(ch2);


            for (int i = 0; i < ch1.length; i++) {
                if (ch1[i] != ch2[i]) {
                    return false;
                }
            }
        }
return  true;

    }

    public static void main(String[] args) {

        AnagramString a = new AnagramString();
        List<String> word = new ArrayList<>();
        word.add("abc");
        word.add("cba");
        word.add("bca");
        word.add("ramayan");
        word.add("ramanya");

        List<String> ch = new ArrayList<>();
        ch.add("bac");
        ch.add("ahah");
        ch.add("aynamar");

        List<List<String>> s= a.anagram(word,ch);

        System.out.println(s);
    }
}

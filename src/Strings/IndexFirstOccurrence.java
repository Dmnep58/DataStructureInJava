package Strings;

/*
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
or -1 if needle is not part of haystack.
 */
public class IndexFirstOccurrence {
    public int strStr(String haystack, String needle) {

        String rev ="";

        int first;

        for(int i=0;i<haystack.length();i++){
            first=i;
            for(int j=i;j<haystack.length();j++){
                rev+=haystack.charAt(j);
                System.out.println(rev);
                if(rev.length()==needle.length() && (needle.equals(rev))) {
                    return first;
                }
            }
            rev="";
        }

        return -1;
    }

    public static void main(String[] args) {
        IndexFirstOccurrence id = new IndexFirstOccurrence();

        int a = id.strStr("hello","ll");
        System.out.println(a);
    }
}

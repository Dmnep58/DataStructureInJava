package BasicProblems;

public class KeyWordRows {
        public String[] findWords(String[] words) {

            String[] s = new String[words.length];

            String  a ="qwertyuiop";
            String  b = "asdfghjkl";
            String c = "zxcvbnm";

            int j=0 ;

            for(int i=0;i<words.length;i++){
                if(a.contains(words[i]) || b.contains(words[i]) || c.contains(words[i]))
                {
                    s[j] = words[i];
                    j++;
                }
            }
            return s;
        }

    public static void main(String[] args) {
        String[] s =  {"Hello","Alaska","Dad","Peace"};

        KeyWordRows k = new KeyWordRows();

        String[] str = k.findWords(s);

        for(String st : str){

        }

    }

}

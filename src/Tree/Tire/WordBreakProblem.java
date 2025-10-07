package Tree.Tire;

public class WordBreakProblem {
    static class Node{
           Node[] children;
           boolean eow;
           Node(){
               children = new Node[26];
               eow=false;
           }
    }
    static  Node  root = new Node();
    public static void insert(String word){
        word = word.toLowerCase(); // ✅ handle uppercase safely
        Node currt = root;
        for(int i=0;i<word.length();i++){
            int index = word.charAt(i) - 'a';
            Node node = (currt.children[index]);
            if(node == null){
                currt.children[index] = new Node();
            }
            if(i == word.length() -1){
                currt.children[index].eow=true;
            }
            currt = currt.children[index];
        }
    }
    public static  boolean search(String key){
        key = key.toLowerCase(); // ✅ handle uppercase safely
        Node currt = root;
        for(int i=0;i<key.length();i++){
            int index = key.charAt(i)-'a';
            Node node = currt.children[index];
            if(node == null){
                return false;
            }
            if(i == key.length()-1 && node.eow == false){
                return false;
            }
            currt=node;
        }
        return true;
    }
    public static boolean wordBreak(String key){
        if(key.length() == 0){
            return true;
        }
        for(int i=1;i<=key.length();i++){
           String firstPart = key.substring(0,i);//0 to i that mean by not include i th character so 0 only
           String secPart = key.substring(i);
           if(search(firstPart) && wordBreak(secPart)){
               return true;
           }
        }
        return false;
    }
    public static boolean startsWith(String prefix){
          Node curroot = root;
          for(int i=0;i<prefix.length();i++){
              int index = prefix.charAt(i)-'a';
              Node childCheck = curroot.children[index];
              if(childCheck == null){
                  return false;
              }
              if(i == prefix.length()-1){
                  return true;
              }
              curroot = childCheck;
          }
          return false;
    }
    //count unique SubString
    public static int countNode(Node root){
      int count =0;
      if(root == null){
          return 0;
      }
      for(int i=0;i<26;i++){
          if(root.children[i] != null){
              count += countNode(root.children[i]);
          }
      }
        return count +1 ;
    }
    public static String ans="";
    public static void longestWord(Node root,StringBuilder teamp){
        Node cur = root;
        if(root == null){
            return;
        }
        for(int i=0;i<26;i++){
            if(cur.children[i] != null && cur.children[i].eow == true){
                 teamp.append((char)(i+'a'));
                 if(teamp.length() > ans.length()){
                     ans = teamp.toString();
                 }
                 longestWord(cur.children[i],teamp);
                 teamp.deleteCharAt(teamp.length()-1);
            }
        }

    }
    public static void main(String[] args) {
        //Word Break Pobleam
/*        String word[]={"i","like","sam","samsung","ice"};
        String key = "ilikesamsung";  */

        //Starts With
   /*     String word[]={"apple","app","mango","man","women"};
        String prefix = "app";*/

        //Longest Word with all Prefixes that means all prefix present in tire both word
        String word[]={"a","banana","app","appl","ap","apply","apple"}; // ans= apple

        for(int i=0;i<word.length;i++){
            insert(word[i]);
        }
        longestWord(root,new StringBuilder(""));
        System.out.println(ans);



//        System.out.println(startsWith(prefix));
//        System.out.println(search("i"));
//        System.out.println(wordBreak(key));
        //Count unique SubStrings ( vvi ) google and microsoft
        //Given the string of length n of lowercase Alphabet characters, we need to count total number of distinct substrings of the String
/*       //Approach prefix and suffix
        String word="ababa";
        for(int i=0;i<word.length();i++){
            insert(word.substring(i));
        }
        System.out.println(countNode(root));*/

    }
}

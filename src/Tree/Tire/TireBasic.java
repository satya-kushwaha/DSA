package Tree.Tire;

public class TireBasic {
    static class  Node {
        Node[] children;
        boolean endOfWord;
        public Node() {
            children = new Node[26];//a to z when in java all use 256
            endOfWord = false;
        }
    }
     static  Node root = new Node();
        public static void insert(String word){
            Node currt  = root;
            for(int i=0;i<word.length();i++){
                int index = word.charAt(i)-'a';
                if(currt.children[index] == null){
                    //Add new node
                   currt.children[index] =  new Node();
                }
                if(i == word.length()-1){
                    currt.children[index].endOfWord = true;
                }
                currt = currt.children[index];
            }
        }
    public static boolean search(String key){
        Node currt  = root;
            for(int i=0;i<key.length();i++){
                int index = key.charAt(i)-'a';
                Node node = currt.children[index];
                if(node == null){
                    //Add new node
                   return false;
                }
                if(i == key.length()-1 && node.endOfWord == false){
                        return false;
                }
                  currt = node;
//                currt = currt.children[index];
            }
          return true;
    }
    public static void main(String[] args) {
        String word[]= {"the","a","there","their","any"};
        for (int i=0;i< word.length;i++){
            insert(word[i]);
        }
        System.out.println(search("the"));
        System.out.println(search("thre"));
        System.out.println(search("a"));
        System.out.println(search("there"));
        System.out.println(search("their"));
        System.out.println(search("any"));
    }
}

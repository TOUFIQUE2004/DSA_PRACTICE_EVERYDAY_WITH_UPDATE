package Linear_search_and_its_problems;

public class String_search {
    public static boolean search_string(String str,char ch){
        if(str.length()==0){
            return false;
        }
        int position=0;
        for(int i=0;i<str.length();i++){
            if(ch==str.charAt(i)){
                return true;
            }
            position=i;
        }
        return false;
    }
    public static boolean search_string2(String str,char ch,char ri){
        for(char st:str.toCharArray()){
            if(st==ch && st==ri){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        String str="toufique";
        char ch='z';
        char mz='f';
        boolean name=search_string(str,ch);
        System.out.println("the answer is :-"+name);
        System.out.println("the answer is:-"+search_string2(str,mz,ch));





    }
}

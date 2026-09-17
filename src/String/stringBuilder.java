package String;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        for(int j=0;j<26;j++){
            char ch=(char)('a'+j);
            sb.append(ch+" ");
        }
        System.out.println(sb.toString());
    }
}

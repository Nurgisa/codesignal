import java.util.ArrayList;

public class Parentheses {
    public static void main(String[] args) {
        String s = "{";
        System.out.println(isValid(s));
    }

    static boolean isValid(String s){
        ArrayList<String> a = new ArrayList<>();
        for(int i =0;i<s.length();i++){
            if(s.substring(i,i+1).equals("(") || s.substring(i,i+1).equals("[") || s.substring(i,i+1).equals("{")){
                a.add(s.substring(i,i+1));
            }
            else{
                if(a.size()==0){
                    return false;
                }
                if(s.substring(i,i+1).equals(")") && a.get(a.size()-1).equals("("))
                    a.remove(a.size()-1);
                else if(s.substring(i,i+1).equals("]") && a.get(a.size()-1).equals("["))
                    a.remove(a.size()-1);
                else if(s.substring(i,i+1).equals("}") && a.get(a.size()-1).equals("{"))
                    a.remove(a.size()-1);
                else
                    return false;
            }
        }
        return a.size()==0;
    }


}

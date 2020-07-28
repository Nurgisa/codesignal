public class longestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"","b"};
        System.out.println(do_algo(strs));
    }

    static String do_algo(String[] strs) {
        String out = "";String min="";
        int x = 10000000;
        for(String str: strs){
            if(str.length()<x){
                min = str;
                x = min.length();
            }
        }

        if(min.length()==0)
            return "";

        for(int i = 0;i<min.length();i++){
            for(String str: strs){
                if(!str.substring(i,i+1).equals(min.substring(i,i+1))){
                    return out;
                }
            }
            out=min.substring(0,i+1);
        }
        return out;
    }
}

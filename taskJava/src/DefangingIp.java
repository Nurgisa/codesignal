public class DefangingIp {
    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }

    static String defangIPaddr(String address){
        return address.replace(".","[.]");
    }
}

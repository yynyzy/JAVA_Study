package exception_;

public class Exception_ {
    public static void main(String[] args) {
    try {
        int m = 10 / 0;
    }catch (Exception_ e){
        System.out.println(e.getMessage);
    }
    }
}

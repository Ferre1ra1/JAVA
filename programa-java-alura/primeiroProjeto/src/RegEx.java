import java.util.regex.*;
public class RegEx {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("V", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Vai Brasil $$");
        boolean palavraEncontrada = matcher.find();
        if(palavraEncontrada){
            System.out.println("Achei");
        }else{
            System.out.println("Não Achei");
        }
    }
}

import java.util.HashMap;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        HashMap <String, String> cidadeEstado = new HashMap<String, String>();
                         //valor      //chave
        cidadeEstado.put("São Paulo", "São Paulo");
        cidadeEstado.put("Bahia", "Salvador");
        cidadeEstado.put("Minas Gerais", "Belo Horizonte");
        
        System.out.println("Estado da bahia: "+cidadeEstado.get("Bahia"));

        for(String i : cidadeEstado.keySet()){
            JOptionPane.showMessageDialog(null, "Chave:"+i+"\n" + "Valores da chave: "+cidadeEstado.get(i));
        }
        System.out.println("Removendo: "+cidadeEstado.remove("Minas Gerais"));
        System.out.println(cidadeEstado);
        System.out.println();



    }
}
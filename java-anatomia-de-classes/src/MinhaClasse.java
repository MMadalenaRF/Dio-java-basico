public class MinhaClasse {

    public static void main (String [] args){

        String primeiroNome= "Maria";
        String segundoNome ="Madalena";

        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);

        System.out.println(nomeCompleto);

        System.out.println("olá, galera!!!!");

        final String BR = "Brasil";

    }

        public static String nomeCompleto(String primeiroNome, String segundoNome){
            return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);

        }

    
    
}

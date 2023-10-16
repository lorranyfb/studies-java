public class Operadores {
    public static void main(String[] args) {
        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;

        System.out.println(vamosAPraia);

        String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana"; //operador ternário

        System.out.println(mensagem);
    }
}

//Tabela Verdade
//Operador && (AND)
//true && true = true
//true && false = false
//false && true = false
//false && false = false

//Operador || (OR)
//true || true = true
//true || false = true
//false || true = true
//false || false = false
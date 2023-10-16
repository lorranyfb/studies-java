public class Condicionais {
    public static void main(String[] args) {
        int nota = 70;
        //Bloco If - Else
        if (nota >= 70) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Não aprovado!");
        }

        //Bloco If - Else if
        int nota2 = 50;
        //A 80 - B 70 - C 60 - D 0
        if (nota2 >= 80) {
            System.out.println("Graduação A");
        } else if (nota2 < 80 && nota2 >= 70) {
            System.out.println("Graduação B");
        } else if (nota2 < 70 && nota2 <= 60) {
            System.out.println("Graduação C");
        } else if (nota2 < 60 && nota2 >= 0) {
            System.out.println("Graduação D");
        } else {
            System.out.println("Nota inválida!");
        }

        //Bloco switch
        int nota3 = 100;
        String graduacao;

         if (nota3 >= 80) {
            graduacao = "A";
        } else if (nota3 < 80 && nota3 >= 70) {
            graduacao = "B";
        } else if (nota3 < 70 && nota3 <= 60) {
            graduacao = "C";
        } else if (nota3 < 60 && nota3 >= 0) {
            graduacao = "D";
        } else {
            graduacao = "";
        }

        switch (graduacao) {
            case "A":
            case "B":
                System.out.println("Aluno aprovado!");
                break;
            case "C":
            case "D":
                System.out.println("Não aprovado!");
                break;
            default:
                System.out.println("Graduação inválida");
        }
    }
}


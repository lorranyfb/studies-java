//Manipulação de String e Datas

import java.time.LocalDateTime;
import java.time.LocalDate; //para usar o pacote de LocalDate, tem que importar o pacote
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.LocalDate; //importa a datas

public class Manipulação {
    public static void main(String[] args) {
        //Olá, {nome}. Hoje é {dia da semana}, BOM DIA!

        String nome = "Lorrany";
        System.out.println(nome.toUpperCase()); //letra maiuscula
        System.out.println(nome.toLowerCase()); //letra minuscula
        System.out.println(nome.length()); //tamanho da var

        String outroNome = "LORRANY";
        System.out.println(nome.equals(outroNome)); //se são iguais
        System.out.println(nome.equalsIgnoreCase(outroNome));//ignora as diferenças de maiusc. e minusc.

        //ISO 8601 - padrão p data

        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR"); //Locale brasil = new Locale = ()"pt", "BR")

        System.out.println(hoje);
        System.out.println(hoje.getDayOfWeek(). getDisplayName(TextStyle.FULL, brasil));

        String diaDaSemana = (hoje.getDayOfWeek(). getDisplayName(TextStyle.FULL, brasil));

        String saudacao;

        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour() >= 8 && agora.getHour() <12) {
            saudacao = "bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() <18) {
            saudacao = "boa tarde";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "boa noite";
        } else {
            saudacao = "Olá";
        }
        
        System.out.printf('Olá, %s.Hoje é %s, %s.%n', nome, diaDaSemana, saudacao.toUpperCase());
    }
}

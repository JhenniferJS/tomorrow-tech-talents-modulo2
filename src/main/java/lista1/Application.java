package lista1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        Jogador[] time = new Jogador[2];

        for (int i=0; i<2; i++){
            System.out.println("Jogador " + (i+1) + ":");

            System.out.println("Nome: ");
            String nome = sc.nextLine();

            System.out.println("Apelido: ");
            String apelido = sc.nextLine();

            System.out.println("Data de nascimento: ");
            Date dataRecebida = new Date(sc.nextLine());
            String dataNascimento = df.format(dataRecebida);

            System.out.println("Numero: ");
            int numero = sc.nextInt();
            sc.nextLine();

            System.out.println("Posicao: ");
            String posicao = sc.nextLine();

            System.out.println("Qualidade: ");
            int qualidade = sc.nextInt();

            System.out.println("Cartoes amarelos: ");
            int cartoesAmarelos = sc.nextInt();

            System.out.println("Cartao vermelho: ");
            int cartaoVermelho = sc.nextInt();
            sc.nextLine();

            Jogador jogador = new Jogador(nome, apelido, dataNascimento, numero, posicao, qualidade, cartoesAmarelos, cartaoVermelho, false);

            time[i] = jogador;
        }

        System.out.println("Time: ");
        for(Jogador jogador : time){
            System.out.println(jogador);
        }
    }
}

import QuestaoUm.QuestaoUmResposta;
import QuestaoVinte.QuestaoVinteResposta;
import QuestaoVinteCinco.QuestaoVinteCincoResposta;
import QuestaoVinteDois.QuestaoVinteDoisResposta;
import QuestaoVinteNove.QuestaoVinteNoveResposta;
import QuestaoVinteNoveAtualizada.QuestaoVinteNoveRespostaAtualizada;
import QuestaoVinteOito.QuestaoVinteOitoResposta;
import QuestaoVinteQuatro.QuestaoVinteQuatroResposta;
import QuestaoVinteSeis.QuestaoVinteSeisResposta;
import QuestaoVinteSete.QuestaoVinteSeteResposta;
import QuestaoVinteTres.QuestaoVinteTresResposta;
import QuestaoVinteUm.QuestaoVinteUmResposta;
import util.Pessoa;

import java.io.IOException;
import java.util.Scanner;

import QuestaoCinco.QuestaoCincoResposta;
import QuestaoDez.QuestaoDezResposta;
import QuestaoDezenove.QuestaoDezenoveResposta;
import QuestaoDezesseis.QuestaoDezesseisResposta;
import QuestaoDezessete.QuestaoDezesseteResposta;
import QuestaoDezoito.QuestaoDezoitoResposta;
import QuestaoDois.QuestaoDoisResposta;
import QuestaoDoze.QuestaoDozeResposta;
import QuestaoNove.QuestaoNoveResposta;
import QuestaoOito.QuestaoOitoResposta;
import QuestaoOnze.QuestaoOnzeResposta;
import QuestaoQuarenta.QuestaoQuarentaResposta;
import QuestaoQuarentaUm.QuestaoQuarentaUmResposta;
import QuestaoQuatorze.QuestaoQuatorzeResposta;
import QuestaoQuatro.QuestaoQuatroResposta;
import QuestaoQuinze.QuestaoQuinzeResposta;
import QuestaoSeis.QuestaoSeisResposta;
import QuestaoSete.QuestaoSeteResposta;
import QuestaoTres.QuestaoTresResposta;
import QuestaoTrinta.QuestaoTrintaResposta;
import QuestaoTrintaCinco.QuestaoTrintaCincoResposta;
import QuestaoTrintaDois.QuestaoTrintaDoisResposta;
import QuestaoTrintaNove.QuestaoTrintaNoveResposta;
import QuestaoTrintaOito.QuestaoTrintaOitoResposta;
import QuestaoTrintaQuatro.QuestaoTrintaQuatroResposta;
import QuestaoTrintaSeis.QuestaoTrintaSeisReposta;
import QuestaoTrintaSete.QuestaoTrintaSeteResposta;
import QuestaoTrintaTres.QuestaoTrintaTresResposta;
import QuestaoTrintaUm.QuestaoTrintaUmResposta;

public class Principal {
    
    private static Scanner scaner = new Scanner( System.in );
    public static void main(String[] args) throws IOException {

        // Para ver a resposta, basta descomentar e incializar o objeto de acordo com o que a questão pede.

        // QuestaoUmResposta questaoUmResposta = new QuestaoUmResposta();
        // QuestaoDoisResposta questaoDoisResposta = new QuestaoDoisResposta(0, 0, ' ', "");
        // QuestaoTresResposta questaoTresResposta = new QuestaoTresResposta(0, 0);
        // QuestaoQuatroResposta questaoQuatroResposta = new QuestaoQuatroResposta(0, 0, 0);
        // QuestaoCincoResposta questaoCincoResposta = new QuestaoCincoResposta(0, 0, 0);
        // QuestaoSeisResposta questaoSeisResposta = new QuestaoSeisResposta(0, 0, 0);
        // QuestaoSeteResposta questaoSeteResposta = new QuestaoSeteResposta(0, 0);
        // QuestaoOitoResposta questaoOitoResposta = new QuestaoOitoResposta(0, 0);
        // QuestaoNoveResposta questaoNoveResposta = new QuestaoNoveResposta(0);
        // QuestaoDezResposta questaoDezResposta = new QuestaoDezResposta(0);
        // QuestaoOnzeResposta  questaoOnzeResposta = new QuestaoOnzeResposta();
        // QuestaoDozeResposta questaoDozeResposta = new QuestaoDozeResposta(0, 0, 0);
        // QuestaoQuatorzeResposta questaoQuatorzeResposta = new QuestaoQuatorzeResposta(0, 0, 0);
        // QuestaoQuinzeResposta questaoQuinzeResposta = new QuestaoQuinzeResposta(0);
        // QuestaoDezesseisResposta questaoDezesseisResposta = new QuestaoDezesseisResposta(0, 0);
        // QuestaoDezesseteResposta questaoDezesseteResposta = new QuestaoDezesseteResposta(0, 0);
        // QuestaoDezoitoResposta questaoDezoitoResposta = new QuestaoDezoitoResposta();
        // QuestaoDezenoveResposta questaoDezenoveResposta = new QuestaoDezenoveResposta(0);
        // QuestaoVinteResposta questaoVinteResposta = new QuestaoVinteResposta(0, 0, 0, 0);
        // QuestaoVinteUmResposta questaoVinteUmResposta = new QuestaoVinteUmResposta(0);
        // QuestaoVinteDoisResposta questaoVinteDoisResposta = new QuestaoVinteDoisResposta(0, 0);
        // QuestaoVinteTresResposta questaoVinteTresResposta = new QuestaoVinteTresResposta(0);
        // QuestaoVinteQuatroResposta questaoVinteQuatroResposta = new QuestaoVinteQuatroResposta();
        // QuestaoVinteCincoResposta questaoVinteCincoResposta = new QuestaoVinteCincoResposta();
        // QuestaoVinteSeisResposta questaoVinteSeisResposta = new QuestaoVinteSeisResposta();
        // QuestaoVinteSeteResposta questaoVinteSeteResposta = new QuestaoVinteSeteResposta(0);
        // QuestaoVinteOitoResposta questaoVinteOitoResposta = new QuestaoVinteOitoResposta(0);
        // QuestaoVinteNoveResposta questaoVinteNoveResposta = new QuestaoVinteNoveResposta(0);
        // QuestaoVinteNoveRespostaAtualizada questaoVinteNoveRespostaAtualizada = new QuestaoVinteNoveRespostaAtualizada(null, 0);
        // QuestaoTrintaResposta questaoTrintaResposta = new QuestaoTrintaResposta(null);
        // QuestaoTrintaUmResposta questaoTrintaUmResposta = new QuestaoTrintaUmResposta();
        // QuestaoTrintaDoisResposta questaoTrintaDoisResposta = new QuestaoTrintaDoisResposta();
        // QuestaoTrintaTresResposta questaoTrintaTresResposta = new QuestaoTrintaTresResposta(null);
        // QuestaoTrintaQuatroResposta questaoTrintaQuatroResposta = new QuestaoTrintaQuatroResposta(null);
        // QuestaoTrintaCincoResposta questaoTrintaCincoResposta = new QuestaoTrintaCincoResposta(null);
        // QuestaoTrintaSeisReposta questaoTrintaSeisReposta = new QuestaoTrintaSeisReposta(0);
        // QuestaoTrintaSeteResposta questaoTrintaSeteResposta = new QuestaoTrintaSeteResposta(0, 0);
        // QuestaoTrintaOitoResposta questaoTrintaOitoResposta = new QuestaoTrintaOitoResposta(null);
        // QuestaoTrintaNoveResposta questaoTrintaNoveResposta = new QuestaoTrintaNoveResposta();
        // QuestaoQuarentaResposta questaoQuarentaResposta = new QuestaoQuarentaResposta(null);
        // QuestaoQuarentaUmResposta questaoQuarentaUmResposta = new QuestaoQuarentaUmResposta();
    }
}

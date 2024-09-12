package com.brunosalata;

import com.brunosalata.aparelho.IPhone;
import com.brunosalata.funcionalidades.player.ReprodutorMusical;
import com.brunosalata.funcionalidades.player.saida.AutoFalante;
import com.brunosalata.funcionalidades.player.saida.Fone;
import com.brunosalata.funcionalidades.telefone.AparelhoTelefonico;

/**
 * @author Bruno Salata Lima - 16/05/2023
 * github.com/Brunosalata
 * @version 2.0.3
 * @project mBioLabv3
 */
public class Main {
    public static void main(String[] args) {
        ReprodutorMusical player = new IPhone();
        player.selecionarMusica("Bee Gees");

        ReprodutorMusical fone = new Fone();
        fone.tocar();

        ReprodutorMusical aparelho = new AutoFalante();
        aparelho.pausar();

        AparelhoTelefonico myPhone = new IPhone();
        myPhone.ligar("11 1234 5678");

    }
}
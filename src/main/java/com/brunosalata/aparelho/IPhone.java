package com.brunosalata.aparelho;

import com.brunosalata.funcionalidades.navegador.NavegadorInternet;
import com.brunosalata.funcionalidades.player.ReprodutorMusical;
import com.brunosalata.funcionalidades.telefone.AparelhoTelefonico;

/**
 * @author Bruno Salata Lima - 16/05/2023
 * github.com/Brunosalata
 * @version 2.0.3
 * @project mBioLabv3
 */
public class IPhone implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical {

    @Override
    public void exibirPagina(String url) {
        System.out.println("EXIBINDO PAGINA " + url + "PELO IPHONE");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO ABA PELO IPHONE");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PAGINA PELO IPHONE");
    }

    @Override
    public void tocar() {
        System.out.println("TOCANDO MUSICA PELO IPHONE");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO MUSICA PELO IPHONE");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("MUSICA " + musica + " SELECIONADA PELO IPHONE");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("LIGANDO PARA " + numero + " PELO IPHONE");
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO PELO IPHONE");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ PELO IPHONE");
    }
}

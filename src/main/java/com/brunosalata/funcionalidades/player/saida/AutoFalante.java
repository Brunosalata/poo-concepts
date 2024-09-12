package com.brunosalata.funcionalidades.player.saida;

import com.brunosalata.funcionalidades.player.ReprodutorMusical;

/**
 * @author Bruno Salata Lima - 16/05/2023
 * github.com/Brunosalata
 * @version 2.0.3
 * @project mBioLabv3
 */
public class AutoFalante implements ReprodutorMusical {
    @Override
    public void tocar() {
        System.out.println("TOCANDO MUSICA PELO APARELHO");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO MUSICA PELO APARELHO");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("MUSICA" + musica + " SELECIONADA PELO APARELHO");
    }

}

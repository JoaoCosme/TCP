package orquestrador;

import tela.Interface;
import tocador.AdaptadorJfugue;

public class Orquestrador {
    public static void orquestrar(){
        final var tocadorMusica = new AdaptadorJfugue();
        final var interfaceUsuario = new Interface(tocadorMusica);
        interfaceUsuario.abrirTela();
    }
}

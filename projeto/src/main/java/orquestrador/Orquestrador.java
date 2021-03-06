package orquestrador;

import decodificadores.DecodificadorTexto;
import decodificadores.validadores.ValidadorDeComando;
import enums.Comando;
import jdk.swing.interop.SwingInterOpUtils;
import tela.Interface;

import tocador.AdaptadorJfugue;
import tocador.ControladorMusical;
import tocador.TradutorJfugue;
import decodificadores.tradutores.TradutorTextoParaComando;

public class Orquestrador {
    private final ControladorMusical controladorMusical;
    private final DecodificadorTexto decodificadorTexto;

    public Orquestrador(){
        final var tocadorMusica = new AdaptadorJfugue(new TradutorJfugue());

        controladorMusical = new ControladorMusical(tocadorMusica, new ValidadorDeComando());

        decodificadorTexto = new DecodificadorTexto(new TradutorTextoParaComando());
    }


    public void orquestrar(String textoUsuario, boolean salvaMusica){
        final var musica = decodificadorTexto.traduzTexto(textoUsuario);
        controladorMusical.executaMusica(musica,salvaMusica);
    }

    public void defineInstrumento(Comando comando){
        controladorMusical.defineInstrumento(comando);
    }
}

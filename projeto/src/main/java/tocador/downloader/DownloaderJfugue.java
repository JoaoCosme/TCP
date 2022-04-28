package tocador.downloader;

import org.jfugue.midi.MidiFileManager;
import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;
import tela.popup.DownloadPopup;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.management.MemoryUsage;

public class DownloaderJfugue {

    public static final String EXTENSAO_MIDI = ".midi";

    public void downloadMusica(Pattern musicaABaixar) throws IOException {
        final var nomeDoArquivo = DownloadPopup.solicitaArquivo();
        final var player = new Player();
        final var sequence = player.getSequence(musicaABaixar);

        MidiFileManager.save(sequence,new File(nomeDoArquivo+EXTENSAO_MIDI));
    }
}

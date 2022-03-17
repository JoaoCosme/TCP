package tocador;

import org.jfugue.player.Player;
import projeto.src.main.java.enums.Comando;


public class AdaptadorJfugue implements AdaptadorMusical {


    @Override
    public void tocarNota(Comando comando) {
        Player player = new Player();
        String music = "C4q D4q E4q F4q G4q A4q B4q C4q";
        player.play(music);
    }

    @Override
    public void aumentarOitava() {

    }

    @Override
    public void reduzirOitava() {

    }

    @Override
    public void aumentarVolume() {

    }

    @Override
    public void reduzirVolume() {

    }
}

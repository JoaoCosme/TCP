package tocador;

import projeto.src.main.java.enums.Comando;

public interface AdaptadorMusical {
    void tocarNota(Comando comando);
    void aumentarOitava();
    void reduzirOitava();
    void aumentarVolume();
    void reduzirVolume();
}
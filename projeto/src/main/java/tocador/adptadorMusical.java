package projeto.src.main.java.tocador;

import projeto.src.main.java.enums.Comando;

public interface adptadorMusical {
    void tocarNota(Comando comando);
    void aumentarOitava();
    void reduzirOitava();
    void aumentarVolume();
    void reduzirVolume();
}

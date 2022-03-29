package decodificadores.validadores;

import enums.Comando;

public class ValidadorDeComando {
    public Boolean eNota(Comando comando){
     return false;
    }
    public Boolean eComandoDeVolume(Comando comando){
        return false;
    }
    public Boolean eComandoDeBPM(Comando comando){
        return false;
    }
    public Boolean eComandoDeOitava(Comando comando){
        return false;
    }
    public Boolean eComandoDeInstrumento(Comando comando){
        return false;
    }
}

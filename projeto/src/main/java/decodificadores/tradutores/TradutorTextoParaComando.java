package decodificadores.tradutores;

import enums.Comando;

import static enums.Comando.*;

public class TradutorTextoParaComando implements TradutorTextoComando{
    private Character ultimoCaracter = ' ';
    @Override
    public Comando traduz(Character caracter) {
        switch (caracter){
            case 'A':
                return La;
            case 'B':
                return Si;
            case 'C':
                return Do;
            case 'E':
                return Mi;
            case 'D':
                return Re;
            case 'F':
                return Fa;
            case 'G':
                return Sol;
            default:
                return null;
        }
    }

    public void setUltimoCaracter(Character ultimoCaracter) {
        this.ultimoCaracter = ultimoCaracter;
    }
}

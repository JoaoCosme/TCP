package decodificadores.tradutores;

import enums.Comando;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static enums.Comando.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class TradutorTextoParaComandoTest {
    @InjectMocks
    private TradutorTextoParaComando tradutorTextoParaComando;
    private Character caracterATraduzir;
    private Comando comandoTraduzido;

    @Test
    void deveTraduzirNotaComum(){
        dadoCaracter('A');
        quandoTraduzir();
        entaoComandoE(La);
    }

    @Test
    void deveTraduzirLetraNotaMinusculaOndeUltimoComandoEraNota(){
        dadoCaracter('a');
        dadoUltimoCaracter('D');
        quandoTraduzir();
        entaoComandoE(Re);
    }

    @Test
    void deveTraduzirLetraNotaMinusculaOndeUltimoComandoNaoEraNota(){
        dadoCaracter('a');
        dadoUltimoCaracter(',');
        quandoTraduzir();
        entaoComandoE(Silencio);
    }

    private void dadoCaracter(final Character caracter){
        caracterATraduzir = caracter;
    }

    private void dadoUltimoCaracter(final Character caracter){
        tradutorTextoParaComando.defineUltimoCaracter(caracter);
    }

    private void quandoTraduzir(){
        comandoTraduzido = tradutorTextoParaComando.traduz(caracterATraduzir);
    }

    private void entaoComandoE(final Comando comando){
        assertEquals(comando,comandoTraduzido);
    }


}
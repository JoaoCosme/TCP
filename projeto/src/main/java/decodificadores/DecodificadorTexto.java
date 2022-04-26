package decodificadores;

import entidades.Musica;
import entidades.VisaoDeComando;
import enums.Comando;
import decodificadores.tradutores.TradutorTextoComando;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;

import static java.util.stream.Collectors.*;

public class DecodificadorTexto {
    private final TradutorTextoComando tradutorTextoComando;

    public DecodificadorTexto(TradutorTextoComando tradutorTextoComando) {
        this.tradutorTextoComando = tradutorTextoComando;
    }

    public Musica traduzTexto(String textoATraduzir){

        final var listaDeCaracter = stringParaLista(textoATraduzir).stream();
//                .map(paraVisaoDeComandoComando())
//                .collect(toList());

        final List<VisaoDeComando> listaDeVisaoDeComando = new ArrayList<>();

        listaDeCaracter.forEach( caracter -> {
            final var comando = tradutorTextoComando.traduz(caracter);
            tradutorTextoComando.defineUltimoCaracter(caracter);
                    if (!listaDeVisaoDeComando.isEmpty() && getUltimaVisao(listaDeVisaoDeComando).getComando() == comando){
                getUltimaVisao(listaDeVisaoDeComando).incRepeticao();
            }else{
                listaDeVisaoDeComando.add(new VisaoDeComando(comando));
            }
        }
        );

        return new Musica(listaDeVisaoDeComando);
    }

    private VisaoDeComando getUltimaVisao(List<VisaoDeComando> listaDeVisaoDeComando) {
        return listaDeVisaoDeComando.get(listaDeVisaoDeComando.size() - 1);
    }

    private Function<Character, VisaoDeComando> paraVisaoDeComandoComando() {
        return character -> {
            final var comando = tradutorTextoComando.traduz(character);
            tradutorTextoComando.defineUltimoCaracter(character);
            return new VisaoDeComando(comando);
        };
    }

    private List<Character> stringParaLista(String textoATraduzir) {
        return textoATraduzir.chars().mapToObj(intParaChar()).collect(toList());
    }

    private IntFunction<Character> intParaChar() {
        return letra -> (char) letra;
    }

    ;
}

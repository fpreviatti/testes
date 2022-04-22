import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AvaliadorTest {

    private Avaliador leiloeiro;
    private Usuario joao;
    private Usuario jose;
    private Usuario maria;

    //@Before não irá instanciar corretamente neste caso. BeforeEach utiliza a biblioteca JUnit5 que é a que estamos utilizando
    @BeforeEach
    public void criaAvaliador() {
        //método criaAvaliador será chamado 3 vezes pois temos 3 testes diferentes
        System.out.println("chamou método criaAvaliador:" );
        this.leiloeiro = new Avaliador();
        this.joao = new Usuario("João");
        this.jose = new Usuario("José");
        this.maria = new Usuario("Maria");
    }

    @Test
    public void deveEncontrarOsTresMaioresLances() {
        Leilao leilao = new Leilao("Playstation 3 Novo");
        leilao.propoe(new Lance("joao", 100.0));
        leilao.propoe(new Lance("maria", 200.0));
        leilao.propoe(new Lance("joao", 300.0));
        leilao.propoe(new Lance("maria", 400.0));
        leiloeiro.avalia(leilao);
        List<Lance> maiores = leiloeiro.getTresMaiores();
        assertEquals(3, maiores.size());
        assertEquals(400, maiores.get(0).getValor(), 0.00001);
        assertEquals(300, maiores.get(1).getValor(), 0.00001);
        assertEquals(200, maiores.get(2).getValor(), 0.00001);
    }
    @Test
    public void deveEntenderLeilaoComApenasUmLance() {
// usa os atributos joao, jose, maria e leiloeiro.
    }

    @Test
    public void deveEncontrarOsTresMenoresLances() {
// usa os atributos joao, jose, maria e leiloeiro.
    }
}
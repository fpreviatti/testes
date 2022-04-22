import java.util.ArrayList;
import java.util.List;

public class Leilao {
    List<Lance> lances = new ArrayList<>();
    public Leilao(String produto){

    }

    public void propoe(Lance lance){
        lances.add(lance);
    }

    public List<Lance> getLances() {
        return lances;
    }

    public void setLances(List<Lance> lances) {
        this.lances = lances;
    }
}

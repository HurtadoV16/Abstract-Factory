package Factorias;
import Partes.Arquero;
import Partes.ArqueroMujer;
import Partes.Atacante;
import Partes.Defensor;
import Partes.AtacanteMujer;
import Partes.DefensorMujer;

public class EquipoFemeninoFactory extends EquipoFactory {
    public Arquero crearArquero(){
        return new ArqueroMujer();
    }
    public Defensor crearDefensor(){
        return new DefensorMujer();
    }
    public Atacante crearAtacante(){
        return new AtacanteMujer();
    }
}

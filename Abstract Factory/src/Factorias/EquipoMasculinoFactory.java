package Factorias;
import Partes.DefensorHombre;
import Partes.AtacanteHombre;
import Partes.ArqueroHombre;
import Partes.Arquero;
import Partes.Atacante;
import Partes.Defensor;
public class EquipoMasculinoFactory extends EquipoFactory {
    public Arquero crearArquero(){
        return new ArqueroHombre();
    }
    public Defensor crearDefensor(){
        return new DefensorHombre();
    }
    public Atacante crearAtacante(){
        return new AtacanteHombre();
    }
}

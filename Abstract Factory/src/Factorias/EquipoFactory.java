package Factorias;

import Partes.Arquero;
import Partes.Atacante;
import Partes.Defensor;

public abstract class EquipoFactory {
    public abstract Arquero crearArquero();
    public abstract Defensor crearDefensor();
    public abstract Atacante crearAtacante();
}

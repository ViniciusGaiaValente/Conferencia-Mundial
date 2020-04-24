package interfaces.services;

import helpers.enums.TipoDePatrocinio;
import models.domain.Palestra;
import models.domain.Palestrante;
import models.domain.Patrocinador;

import java.util.ArrayList;

public interface IPalestraService {

    ArrayList<Palestra> indexPalestras();

    ArrayList<Palestra>  indexPalestras(int quantidade);

    Palestra createPalestra(Palestra palestra);

    Palestra updatePalestra(Palestra palestra);

    Palestra deletePalestra(String idPalestra);

    Palestra addPalestrante(String idPalestra, Palestrante palestrante);

    Palestra addParticipante(String idPalestra, Patrocinador patrocinador);

    Palestra addPatrocinador(String idPalestra, Patrocinador patrocinador, TipoDePatrocinio tipoDePatrocinio);
}

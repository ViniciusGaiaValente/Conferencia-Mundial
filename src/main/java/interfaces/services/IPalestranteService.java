package interfaces.services;

import models.domain.Palestrante;
import java.util.ArrayList;

public interface IPalestranteService {

    ArrayList<Palestrante> indexPalestrantes();

    ArrayList<Palestrante> indexPalestrantes(int quantidade);

    Palestrante createPalestrante(Palestrante palestrante);

    Palestrante updatePalestrante(Palestrante palestrante);

    Palestrante deletePalestrante(String idPalestrante);
}

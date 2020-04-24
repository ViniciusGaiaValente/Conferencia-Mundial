package interfaces.services;

import models.domain.Patrocinador;

import java.util.ArrayList;

public interface IPatrocinadorService {

    ArrayList<Patrocinador> indexPatrocinadores();

    ArrayList<Patrocinador> indexPatrocinadores(int quantidade);

    Patrocinador createPatrocinador(Patrocinador atrocinador);

    Patrocinador updatePatrocinador(Patrocinador atrocinador);

    Patrocinador deletePatrocinador(String idPatrocinador);
}

package interfaces.services;

import models.domain.Patrocinador;

import java.util.ArrayList;

public interface IPatrocinadorService {

    ArrayList<Patrocinador> indexPatrocinadores();

    ArrayList<Patrocinador> indexPatrocinadores(int quantidade);

    Patrocinador createPatrocinador(Patrocinador patrocinador);

    Patrocinador updatePatrocinador(Patrocinador patrocinador);

    Patrocinador deletePatrocinador(String idPatrocinador);
}

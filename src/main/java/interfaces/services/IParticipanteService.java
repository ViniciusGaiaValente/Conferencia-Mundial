package interfaces.services;

import models.domain.Participante;

import java.util.ArrayList;

public interface IParticipanteService {

    ArrayList<Participante> indexParticipantes();

    ArrayList<Participante> indexParticipantes(int quantidade);

    Participante createParticipante(Participante participante);

    Participante updateParticipante(Participante participante);

    Participante deleteParticipante(String idParticipante);
}

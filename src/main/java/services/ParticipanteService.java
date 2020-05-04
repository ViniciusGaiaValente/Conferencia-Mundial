package services;

import aplication.DAOFactory;
import dao.ParticipanteDAO;
import interfaces.services.IParticipanteService;
import models.domain.Participante;
import models.vo.ParticipanteVO;

import java.util.ArrayList;

public class ParticipanteService implements IParticipanteService {

    private ParticipanteDAO participanteDAO;

    public ParticipanteService() {
        this.participanteDAO = DAOFactory.participante();
    }

    @Override
    public ArrayList<Participante> indexParticipantes() {

        final ArrayList<Participante> participantes = new ArrayList<>();

        participanteDAO.index().forEach((participante) -> {
            participantes.add(new Participante(participante));
        });

        return participantes;
    }

    @Override
    public ArrayList<Participante> indexParticipantes(int quantidade) {
        return null;
    }

    @Override
    public Participante createParticipante(Participante participante) {

        ParticipanteVO participanteVO = new ParticipanteVO(participante);

        participanteVO = participanteDAO.save(participanteVO);

        return new Participante(participanteVO);
    }

    @Override
    public Participante updateParticipante(Participante participante) {
        return null;
    }

    @Override
    public Participante deleteParticipante(int idParticipante) {
        ParticipanteVO participanteVO = participanteDAO.searchById(idParticipante);

        participanteVO = participanteDAO.delete(participanteVO);

        return new Participante(participanteVO);
    }

}

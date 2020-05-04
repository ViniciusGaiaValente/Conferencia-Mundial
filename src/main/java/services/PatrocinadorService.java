package services;

import aplication.DAOFactory;
import dao.PatrocinadorDAO;
import interfaces.services.IPatrocinadorService;
import models.domain.Patrocinador;
import models.vo.PatrocinadorVO;

import java.util.ArrayList;

public class PatrocinadorService implements IPatrocinadorService {

    PatrocinadorDAO patrocinadorDAO;

    public PatrocinadorService() {
        this.patrocinadorDAO = DAOFactory.patrocinador();
    }

    @Override
    public ArrayList<Patrocinador> indexPatrocinadores() {

        ArrayList<Patrocinador> patrocinadores = new ArrayList<Patrocinador>();

        patrocinadorDAO.index().forEach((patrocinadorVO -> {

            patrocinadores.add(new Patrocinador(patrocinadorVO));

        }));

        return patrocinadores;
    }

    @Override
    public ArrayList<Patrocinador> indexPatrocinadores(int quantidade) {
        return null;
    }

    @Override
    public Patrocinador createPatrocinador(Patrocinador patrocinador) {

        PatrocinadorVO patrocinadorVO = new PatrocinadorVO(patrocinador);

        patrocinadorVO = patrocinadorDAO.save(patrocinadorVO);

        return new Patrocinador(patrocinadorVO);
    }

    @Override
    public Patrocinador updatePatrocinador(Patrocinador patrocinador) {
        return null;
    }

    @Override
    public Patrocinador deletePatrocinador(String idPatrocinador) {
        return null;
    }

}

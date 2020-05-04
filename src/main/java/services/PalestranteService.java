package services;

import aplication.DAOFactory;
import dao.PalestranteDAO;
import interfaces.services.IPalestranteService;
import models.domain.Palestrante;
import models.vo.PalestranteVO;

import java.util.ArrayList;

public class PalestranteService implements IPalestranteService {

    private PalestranteDAO palestranteDAO;

    public PalestranteService() { this.palestranteDAO = DAOFactory.palestrante(); }

    @Override
    public ArrayList<Palestrante> indexPalestrantes() {
        ArrayList<Palestrante> palestrantes = new ArrayList<Palestrante>();

        palestranteDAO.index().forEach((palestrante) -> {
            palestrantes.add(new Palestrante(palestrante));
        });

        return palestrantes;
    }

    @Override
    public ArrayList<Palestrante> indexPalestrantes(int quantidade) {
        return null;
    }

    @Override
    public Palestrante createPalestrante(Palestrante palestrante) {

        PalestranteVO palestranteVO = new PalestranteVO(palestrante);

        palestranteVO = palestranteDAO.save(palestranteVO);

        return new Palestrante(palestranteVO);

    }

    @Override
    public Palestrante updatePalestrante(Palestrante palestrante) {
        return null;
    }

    @Override
    public Palestrante deletePalestrante(String idPalestrante) {
        return null;
    }

}

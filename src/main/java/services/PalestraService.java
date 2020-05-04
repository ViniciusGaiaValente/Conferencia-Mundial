package services;

import aplication.DAOFactory;
import dao.PalestraDAO;
import dao.ParticipanteDAO;
import dao.PatrocinadorDAO;
import helpers.enums.TipoDePatrocinio;
import interfaces.services.IPalestraService;
import models.domain.*;

import java.util.ArrayList;

public class PalestraService implements IPalestraService {

    private PalestraDAO palestraDAO;
    private ParticipanteDAO participanteDAO;
    private PatrocinadorDAO patrocinadorDAO;

    public PalestraService() {
        this.palestraDAO = DAOFactory.palestra();
        this.participanteDAO = DAOFactory.participante();
        this.patrocinadorDAO = DAOFactory.patrocinador();
    }

    @Override
    public ArrayList<Palestra> indexPalestras() {

        ArrayList<Palestra> palestras = new ArrayList<Palestra>();

        palestraDAO.index().forEach((palestraVO) -> {

            Palestra palestra = new Palestra(palestraVO);

            ArrayList<Participante> participantes;

            palestraVO.participantes.forEach((palestraParticipanteVO) -> {

                palestra.participantes.add(new Participante(palestraParticipanteVO.participante));

            });

            palestraVO.palestrantes.forEach((palestraPalestranteVO) -> {

                palestra.palestrantes.add(new Palestrante(palestraPalestranteVO.palestrante));

            });

            palestraVO.patrocinadores.forEach((palestraPatrocinadorVO) -> {

                Patrocinio patrocinio = new Patrocinio();

                switch (palestraPatrocinadorVO.tipoPatrocinio) {
                    case "Ouro":
                        patrocinio.tipo = TipoDePatrocinio.Ouro;
                        break;
                    case "Prata":
                        patrocinio.tipo = TipoDePatrocinio.Prata;
                        break;
                    case "Bronze":
                        patrocinio.tipo = TipoDePatrocinio.Bronze;
                        break;
                    default:
                        //TODO TRATAR ERRO
                        break;
                }

                patrocinio.patrocinador = new Patrocinador(palestraPatrocinadorVO.patrocinador);

                palestra.patrocinios.add(patrocinio);

            });

            palestras.add(palestra);

        });

        return palestras;
    }

    @Override
    public ArrayList<Palestra> indexPalestras(int quantidade) {
        return null;
    }

    @Override
    public Palestra createPalestra(Palestra palestra) {
        return null;
    }

    @Override
    public Palestra updatePalestra(Palestra palestra) {
        return null;
    }

    @Override
    public Palestra deletePalestra(String idPalestra) {
        return null;
    }

    @Override
    public Palestra addPalestrante(String idPalestra, Palestrante palestrante) {
        return null;
    }

    @Override
    public Palestra addParticipante(String idPalestra, Patrocinador patrocinador) {
        return null;
    }

    @Override
    public Palestra addPatrocinador(String idPalestra, Patrocinador patrocinador, TipoDePatrocinio tipoDePatrocinio) {
        return null;
    }

}

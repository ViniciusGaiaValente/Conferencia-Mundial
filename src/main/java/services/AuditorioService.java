package services;

import aplication.DAOFactory;
import dao.AuditorioDAO;
import interfaces.services.IAuditorioService;
import models.domain.Auditorio;
import models.vo.AuditorioVO;

import java.util.ArrayList;

public class AuditorioService implements IAuditorioService {

    private AuditorioDAO auditorioDAO;

    public AuditorioService() { this.auditorioDAO = DAOFactory.auditorio(); }

    @Override
    public ArrayList<Auditorio> indexAuditorios() {

        ArrayList<Auditorio> auditorios = new ArrayList<Auditorio>();

        auditorioDAO.index().forEach((auditorio) -> {
            auditorios.add(new Auditorio(auditorio));
        });

        return auditorios;
    }

    @Override
    public ArrayList<Auditorio> indexAuditorios(int quantidade) {
        return null;
    }

    @Override
    public Auditorio createAuditorio(Auditorio auditorio) {

        AuditorioVO auditorioVO = new AuditorioVO(auditorio);

        auditorioVO = auditorioDAO.save(auditorioVO);

        return new Auditorio(auditorioVO);
    }

    @Override
    public Auditorio deleteAuditorio(String idPAuditorio) {
        return null;
    }

}

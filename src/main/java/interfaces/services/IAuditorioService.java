package interfaces.services;

import models.domain.Auditorio;

import java.util.ArrayList;

public interface IAuditorioService {

    ArrayList<Auditorio> indexAuditorios();

    ArrayList<Auditorio> indexAuditorios(int quantidade);

    Auditorio createAuditorio(Auditorio auditorio);

    Auditorio deleteAuditorio(String idPAuditorio);
}

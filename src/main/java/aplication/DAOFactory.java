package aplication;

import dao.*;

public class DAOFactory {

    private AuditorioDAO auditorioDAO;
    private PalestranteDAO palestranteDAO;
    private PalestraDAO palestraDAO;
    private ParticipanteDAO participanteDAO;
    private PatrocinadorDAO patrocinadorDAO;

    private static DAOFactory instance = new DAOFactory();

    private DAOFactory() {
        this.auditorioDAO = new AuditorioDAO();
        this.palestranteDAO = new PalestranteDAO();
        this.palestraDAO = new PalestraDAO();
        this.participanteDAO = new ParticipanteDAO();
        this.patrocinadorDAO = new PatrocinadorDAO();
    }

    public static AuditorioDAO auditorio() {
        return instance.auditorioDAO;
    }

    public static PalestranteDAO palestrante() {
        return instance.palestranteDAO;
    }

    public static PalestraDAO palestra() {
        return instance.palestraDAO;
    }

    public static ParticipanteDAO participante() {
        return instance.participanteDAO;
    }

    public static PatrocinadorDAO patrocinador() {
        return instance.patrocinadorDAO;
    }
}

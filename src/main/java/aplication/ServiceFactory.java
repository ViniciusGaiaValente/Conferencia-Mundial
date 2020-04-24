package aplication;

import interfaces.services.*;
import services.*;

public class ServiceFactory {

    private IAuditorioService auditorioService;
    private IPalestranteService palestranteService;
    private IPalestraService palestraService;
    private IParticipanteService participanteService;
    private IPatrocinadorService patrocinadorService;

    private static ServiceFactory instance = new ServiceFactory();

    private ServiceFactory() {
        this.participanteService = new ParticipanteService();
    }

    public static IAuditorioService auditorio() {
        return instance.auditorioService;
    }

    public static IPalestranteService palestrante() {
        return instance.palestranteService;
    }

    public static IPalestraService palestra() {
        return instance.palestraService;
    }

    public static IParticipanteService participante() {
        return instance.participanteService;
    }

    public static IPatrocinadorService patrocinador() {
        return instance.patrocinadorService;
    }

}

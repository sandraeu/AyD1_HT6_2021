/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso;

import Objetos.Carrera;
import Objetos.RegistroAcademico;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
/**
 *
 * @author sandr
 */
public class SANDRAEUNICEJIMENEZRODAS {
    
    @InjectMocks
    private AsignarHorario asignarHorario;

    @Mock
    private Horario horario;
    
    @Mock
    private RegistroAcademico carnet;

    @Mock
    private Carrera carrera;
    
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void getCodigoHorario() {
        when(carnet.cheequearCarnet()).thenReturn(true);
        when(carrera.procesarCarrera()).thenReturn(1);
        when(carnet.getAnio()).thenReturn(2014);

        asignarHorario = new AsignarHorario();

        assertEquals(828, asignarHorario.generarHorario(carrera, registroAcademico).getCodigoHorario());
    }
    
    @Test
    public void getDescripcion() {
        when(carnet.cheequearCarnet()).thenReturn(true);
        when(carrera.procesarCarrera()).thenReturn(1);
        when(carnet.getAnio()).thenReturn(ArgumentMatchers.anyInt());

        asignarHorario = new AsignarHorario();

        assertEquals("Ingenieria", asignarHorario.generarHorario(carrera, registroAcademico).getDescripcion());
    }
    
}

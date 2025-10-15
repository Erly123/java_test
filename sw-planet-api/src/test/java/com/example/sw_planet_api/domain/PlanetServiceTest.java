package com.example.sw_planet_api.domain;

import static com.example.sw_planet_api.common.PlanetConstants.PLANET;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

@ExtendWith(MockitoExtension.class)
// @SpringBootTest(classes = PlanetService.class)
public class PlanetServiceTest {
    // @Autowired
    @InjectMocks
    private PlanetService planetService;

    // @MockitoBean
    @Mock 
    private PlanetRepository planetRepository;
    // operacao_esatado_returno
    @Test
    public void createPlanet_WithValidData_ReturnsPlanet() {
        //AAA
        // Arrange : agrupa los datos para el test
        when(planetRepository.save(PLANET)).thenReturn(PLANET);
        
        // Act : se raliza la operacion real que se quiere testar
        // system under test
        Planet sut = planetService.create(PLANET);

        // Assert: lo que se espera del sistema 
        assertThat(sut).isEqualTo(PLANET);

    }    
}

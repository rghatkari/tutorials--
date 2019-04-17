package com.rghatkari;

import com.rghatkari.controller.ShipwreckController;
import com.rghatkari.model.Shipwreck;
import com.rghatkari.repository.ShipwreckRepository;
import static org.junit.Assert.*;

import org.hamcrest.Matcher;
import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matcher.*;

public class ShipwreckControllerTest {

    @InjectMocks
    private ShipwreckController sc;

    @Mock
    private ShipwreckRepository shipwreckRepository;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testShipwreckGet(){
        Shipwreck sw = new Shipwreck();
        sw.setId(1l);
        Mockito.when(shipwreckRepository.findOne(1l)).thenReturn(sw);

        Shipwreck wreck = sc.get(1L);
        Mockito.verify(shipwreckRepository).findOne(1L);
//        assertEquals(1l, wreck.getId().longValue());

        assertThat(wreck.getId(), Is.is(1l));
    }
}

package com.softwareinstitute.rt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TilesTest {


    @Test
    void testing_tiles_isUntouched(){

        Tiles tiles = new Tiles();

        assertTrue(tiles.isUntouched(),"Tile should be untouched when created");

    }

    @Test
    void testing_tiles_setUntouched(){

        Tiles tiles = new Tiles();

        tiles.setUntouched(false);

        assertFalse(tiles.isUntouched(),"Tile should be touched as it has been set to false");

    }



}

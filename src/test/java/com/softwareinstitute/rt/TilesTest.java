package com.softwareinstitute.rt;

import com.softwareinstitute.rt.data.tiles.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TilesTest {

    @Test
    void testing_tiles_isUntouched(){

        Tiles tiles = new CleanTiles();

        assertTrue(tiles.isUntouched(),"Tile should be untouched when created");

    }

    @Test
    void testing_tiles_setUntouched(){

        Tiles tiles = new CleanTiles();

        tiles.setUntouched(false);

        assertFalse(tiles.isUntouched(),"Tile should be touched as it has been set to false");

    }




}

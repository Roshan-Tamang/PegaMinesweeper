package com.softwareinstitute.rt;

import com.softwareinstitute.rt.data.Difficulty;
import com.softwareinstitute.rt.data.Settings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SettingsTest {

    @Test
    void testing_settings_height(){
        Settings settings = new Settings();

        settings.setHeight(5);

        assertEquals(5,settings.getHeight(),"The height should match");
    }

    @Test
    void testing_settings_width(){

        Settings settings = new Settings();

        settings.setWidth(5);

        assertEquals(5,settings.getWidth(),"The width should match");


    }

    @Test
    void testing_settings_difficulty(){

        Settings settings = new Settings();

        settings.setDifficulty(Difficulty.MEDIUM);

        assertEquals(Difficulty.MEDIUM,settings.getDifficulty(),"The difficulty level should match");


    }


}

package game;/*
 * Created by evanknox on 2015-10-27.
 */

import robot.navigation.Motors;
import robot.display.Display;
import robot.navigation.Odometer;

/**
 * The purpose of this class is to start up all the threads and make sure that the robot can execute all the functions
 * without invalid sensor mode errors and instantiation errors
 */
public class Loader {
    /**
     * this method loads up all the classes when the game begins!
     */
    public void load() {
        try {
//          final Class<Odometer> aClass = Class.forName(Odometer);
            Odometer.getInstance();
            Display.getInstance();
            Motors.getInstance();
        }catch (Exception e){

        }

    }
}

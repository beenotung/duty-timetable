package dutytimetable.launcher;


import dutytimetable.view.MainViewLauncher;
import javafx.application.Application;
import myutils.debug.Debug;

/**
 * Created by beenotung on 6/8/15.
 */
public class Launcher_Release {
    public static void main(String [] args){
        Debug.MODE=Debug.MODE_RELEASE;
        Application.launch(MainViewLauncher.class,args);
    }
}

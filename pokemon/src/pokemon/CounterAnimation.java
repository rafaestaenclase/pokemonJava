package pokemon;

import GUI.CombatWindow;
import java.util.TimerTask;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;
import pokemon.main;

class CounterAnimation extends TimerTask {
    int seconds = 3;
    
public void run() {
       seconds = seconds -1;
       System.out.println(seconds);
       main.animationTimeTest(seconds);
    }

  public static void main(String [] args){

  }
  
  public void start(){
      Timer timer = new Timer();
      timer.schedule(new CounterAnimation(), 0, 1000);
  }


}
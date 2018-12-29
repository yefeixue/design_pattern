package 观察者模式.Observer;

import 观察者模式.Subject;

public abstract class Observer {
   protected Subject subject;
   public abstract void update();
}
package 观察者模式;

import 观察者模式.Observer.BinaryObserver;
import 观察者模式.Observer.HexaObserver;
import 观察者模式.Observer.OctalObserver;

public class ObserverPatternDemo {
   public static void main(String[] args) {
      Subject subject = new Subject();

      new HexaObserver(subject);
      new OctalObserver(subject);
      new BinaryObserver(subject);

      System.out.println("First state change: 15");    
      subject.setState(15);
      System.out.println("Second state change: 10");    
      subject.setState(10);
   }
}
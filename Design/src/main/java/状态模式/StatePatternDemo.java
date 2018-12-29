package 状态模式;

/**
 * 我们创建表示各种状态的对象和一个行为随着状态对象改变而改变的 context 对象。
 */
public class StatePatternDemo {
   public static void main(String[] args) {
      Context context = new Context();

      StartState startState = new StartState();
      startState.doAction(context);

      System.out.println(context.getState().toString());

      StopState stopState = new StopState();
      stopState.doAction(context);

      System.out.println(context.getState().toString());
   }
}
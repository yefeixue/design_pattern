package 桥接模式.Shape;

import 桥接模式.DrawAPI.DrawAPI;

public abstract class Shape {
   protected DrawAPI drawAPI;
   protected Shape(DrawAPI drawAPI){
      this.drawAPI = drawAPI;
   }
   public abstract void draw();    
}
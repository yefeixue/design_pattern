package 工厂模式_抽象.Factory;

import 工厂模式_抽象.Color.Color;
import 工厂模式_抽象.Shape.Shape;

public abstract class AbstractFactory {
   public abstract Color getColor(String color);
   public abstract Shape getShape(String shape) ;
}
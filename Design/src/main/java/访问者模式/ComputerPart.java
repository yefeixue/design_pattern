package 访问者模式;

public interface ComputerPart {
   public void accept(ComputerPartVisitor computerPartVisitor);
}
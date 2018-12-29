package 迭代器模式;

import 迭代器模式.Container.NameRepository;
import 迭代器模式.Iterator.Iterator;

public class IteratorPatternDemo {
    
   public static void main(String[] args) {
      NameRepository namesRepository = new NameRepository();

      for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
         String name = (String)iter.next();
         System.out.println("Name : " + name);
      }     
   }
}
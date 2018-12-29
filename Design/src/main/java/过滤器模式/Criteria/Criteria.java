package 过滤器模式.Criteria;

import 过滤器模式.Person;

import java.util.List;

public interface Criteria {
   public List<Person> meetCriteria(List<Person> persons);
}
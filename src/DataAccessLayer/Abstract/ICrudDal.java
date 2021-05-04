package DataAccessLayer.Abstract;

public interface ICrudDal<T> {
     T get(T t);
     void update(T t);
     void delete(T t);
     void add(T t);
}

package Bussines.Abstract;

public interface ICrudService<T> {

    void add(T t);
    void delete(T t);
    void update(T t);
    void get(T t);
}

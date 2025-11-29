package DataAccess.DataAccessObject;

import java.util.List;

public interface ISimpleAccess <T, Id>{
    boolean insert(T t);
    boolean update(Id id, T t);
    boolean delete(Id id);
    T select(Id id);
    List<T> selectAll();
}

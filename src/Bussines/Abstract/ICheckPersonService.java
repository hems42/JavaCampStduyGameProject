package Bussines.Abstract;

import Entities.Concrete.User;

public interface ICheckPersonService {

    boolean isValidPerson(User user);
}

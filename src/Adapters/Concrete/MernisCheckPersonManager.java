package Adapters.Concrete;

import Bussines.Abstract.ICheckPersonService;
import Entities.User;

public class MernisCheckPersonManager implements ICheckPersonService {
    @Override
    public boolean isValidPerson(User user) {
        return true;
    }
}

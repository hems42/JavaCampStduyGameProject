package Adapters;

import Bussines.Abstract.ICheckPersonService;
import Entities.Concrete.User;

public class MernisCheckPersonManager implements ICheckPersonService {
    @Override
    public boolean isValidPerson(User user) {

        System.out.println(user.getName()+ " "+user.getSurname()+ " isimli kullanıcının" +
                " kişi tanımlaması başarılı" );
        return true;
    }
}

package DataAccessLayer.Hibernate;

import DataAccessLayer.Abstract.IUserDal;
import Entities.Concrete.User;

public class HibernateUserDal implements IUserDal {
    @Override
    public User get(User user) {
        User userr= new User(1,"Abuziddin","Telkadayıf","00000000","abuuzii");

        return userr;
    }

    @Override
    public void update(User user) {

        System.out.println(user.getName()+" "+ user.getSurname()+ " isimli kullanıcı  güncellendi");
    }

    @Override
    public void delete(User user) {
        System.out.println(user.getName()+" "+ user.getSurname()+ " isimli kullanıcı  silindi");

    }

    @Override
    public void add(User user) {
        System.out.println(user.getName()+" "+ user.getSurname()+ " isimli kullanıcı  eklendi");

    }
}

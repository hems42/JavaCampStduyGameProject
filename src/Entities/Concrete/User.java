package Entities.Concrete;

import Entities.Abstract.IEntity;

public class User  implements IEntity {
    private  int id;
    private  String name;
    private  String surname;
    private  String natioanelIdentityNumber;
    private  String nickName;

    public User(int id, String name, String surname, String natioanelIdentityNumber, String nickName) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.natioanelIdentityNumber = natioanelIdentityNumber;
        this.nickName = nickName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return name+" "+surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNatioanelIdentityNumber() {
        return natioanelIdentityNumber;
    }

    public void setNatioanelIdentityNumber(String natioanelIdentityNumber) {
        this.natioanelIdentityNumber = natioanelIdentityNumber;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}

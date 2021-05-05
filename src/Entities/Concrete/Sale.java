package Entities.Concrete;

import Entities.Abstract.IEntity;

public class Sale implements IEntity {
    private  int id;
    private User user;
    private Game game;
    private String detail;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public String getDetail() {
        String det="SATIŞ ÖZETİ: "+getGame().getName()+ " isimli oyunun "+ getUser().getName()+ " " + getUser().getSurname()+"  isimli kullanıcıya "+ game.getPrice()+" satışı";
        return det;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}

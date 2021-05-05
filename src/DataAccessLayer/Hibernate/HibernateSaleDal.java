package DataAccessLayer.Hibernate;

import DataAccessLayer.Abstract.ISaleDal;
import Entities.Concrete.Sale;

public class HibernateSaleDal implements ISaleDal {

    @Override
    public Sale get(Sale sale) {

        return sale;
    }

    @Override
    public void update(Sale sale) {

        System.out.println(sale.getDetail()+ " güncellendi");
    }

    @Override
    public void delete(Sale sale) {
        System.out.println(sale.getDetail()+ " silindi");

    }

    @Override
    public void add(Sale sale) {
        System.out.println(sale.getDetail()+ " eklendi");

    }
}

package pro.sky.skyproworkwitnspring.data;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class BasketImpl implements Basket {
    private final List<Integer> idGood;

    public BasketImpl(List<Integer> good) {
        this.idGood = new ArrayList<>();
    }

    @Override
    public List<Integer> getIdOfGood() {
        return idGood;
    }

    @Override
    public List<Integer> setIdOfGood(List<Integer> good) {
        idGood.addAll(good);
        return good;
    }

    @Override
    public String toString() {
        return "{" + " IDGood=" + getIdOfGood() +
                '}';
    }

}

package pro.sky.skyproworkwitnspring.data;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Component
@SessionScope
public class BasketImpl implements Basket {
    private List<Integer> idGood;
    private int idClient;

    public BasketImpl(int idClient, List<Integer> idGood) {
        this.idClient = idClient;
        this.idGood = idGood;
    }

    @Override
    public List<Integer> getIdOfGood() {
        return idGood;
    }

    @Override
    public List<Integer> setIdOfGood(List<Integer> idGood) {
        return this.idGood = idGood;
    }

    @Override
    public int getIdClient() {
        return idClient;
    }

    @Override
    public int setIdClient(int idClient) {
        return this.idClient = idClient;
    }

    @Override
    public String toString() {
        return "{" + " IDClient='" + getIdClient() + '\'' +
                " IDGood=" + getIdOfGood() +
                '}';
    }

}

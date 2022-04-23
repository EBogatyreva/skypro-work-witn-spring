package pro.sky.skyproworkwitnspring.data;

import org.springframework.context.annotation.Scope;

public class BasketImpl implements Basket {
    private int idGood;
    private int idClient;

    public BasketImpl(int idClient, int idGood) {
        this.idClient = idClient;
        this.idGood = idGood;
    }

    @Override
    public int getIdOfGood() {
        return idGood;
    }

    @Override
    public int setIdOfGood(int idGood) {
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

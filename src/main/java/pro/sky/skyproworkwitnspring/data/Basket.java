package pro.sky.skyproworkwitnspring.data;

import java.util.List;

public interface Basket {

    List<Integer> getIdOfGood();

    List<Integer> setIdOfGood(List<Integer> idGood);

    int getIdClient();

    int setIdClient(int id);

}

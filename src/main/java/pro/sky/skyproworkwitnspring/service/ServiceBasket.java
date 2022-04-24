package pro.sky.skyproworkwitnspring.service;

import java.util.List;

public interface ServiceBasket {
   // ArrayList<BasketImpl> getAllGoods();
    //String getAllGoods();
    List<Integer> getAllGoods();

    String addNewGood(List<Integer> idGood);


}

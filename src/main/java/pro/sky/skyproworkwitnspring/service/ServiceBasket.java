package pro.sky.skyproworkwitnspring.service;

import pro.sky.skyproworkwitnspring.data.BasketImpl;

import java.util.ArrayList;
import java.util.List;

public interface ServiceBasket {
    ArrayList<BasketImpl> getAllGoods();

    String addNewGood(int IdClient, List<Integer> idGood);

}

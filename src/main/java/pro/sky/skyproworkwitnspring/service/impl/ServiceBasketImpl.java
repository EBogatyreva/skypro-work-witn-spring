package pro.sky.skyproworkwitnspring.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.skyproworkwitnspring.data.BasketImpl;
import pro.sky.skyproworkwitnspring.service.ServiceBasket;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceBasketImpl implements ServiceBasket {
    private BasketImpl basket;
    private ArrayList<BasketImpl> listOfGoods = new ArrayList<>();

    @Override
    public ArrayList<BasketImpl> getAllGoods() {
        return listOfGoods;
    }

    @Override
    public String addNewGood(int idClient, List<Integer> idGood) {
        basket = new BasketImpl(idClient, idGood);
        listOfGoods.add(basket);
        return basket + " Good is added ";
    }
}

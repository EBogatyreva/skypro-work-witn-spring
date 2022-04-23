package pro.sky.skyproworkwitnspring.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.skyproworkwitnspring.data.BasketImpl;
import pro.sky.skyproworkwitnspring.service.ServiceBasket;

import java.util.ArrayList;

@Service
public class ServiceBasketImpl implements ServiceBasket {
    private BasketImpl basket;

    ArrayList<BasketImpl> listOfGoods = new ArrayList<>();

//конструктор создать?

    @Override
    public String getAllGoods() {
        return " Список товаров в корзине " + listOfGoods;
    }

    @Override
    public String addNewGood(int idClient, int idGood) {
        basket = new BasketImpl(idClient, idGood);//перенести в контекст
        listOfGoods.add(basket);
        return basket + " Good is added ";
    }
}

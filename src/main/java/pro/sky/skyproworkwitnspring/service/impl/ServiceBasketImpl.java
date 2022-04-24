package pro.sky.skyproworkwitnspring.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.skyproworkwitnspring.data.Basket;
import pro.sky.skyproworkwitnspring.data.BasketImpl;
import pro.sky.skyproworkwitnspring.service.ServiceBasket;

import java.util.Collections;
import java.util.List;

@Service
public class ServiceBasketImpl implements ServiceBasket {

    private final Basket basket;

    public ServiceBasketImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public List<Integer> getAllGoods() {
        return basket.getIdOfGood();
    }

    @Override
    public String addNewGood(List<Integer> idGood) {
        basket.setIdOfGood(idGood);
        return basket + " Good is added ";
    }
}

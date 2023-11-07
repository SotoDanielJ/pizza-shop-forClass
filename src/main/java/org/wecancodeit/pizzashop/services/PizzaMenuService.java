package org.wecancodeit.pizzashop.services;

import org.springframework.stereotype.Service;
import org.wecancodeit.pizzashop.Dto.PizzaMenuDto;
import org.wecancodeit.pizzashop.models.PizzaMenuModel;
import org.wecancodeit.pizzashop.repositories.PizzaMenuRepository;

import jakarta.annotation.Resource;

@Service
public class PizzaMenuService {

    @Resource
    PizzaMenuRepository pizzaMenuRepository;

    public PizzaMenuService(PizzaMenuRepository pizzaMenuRepository) {
        this.pizzaMenuRepository = pizzaMenuRepository;
    }

    public PizzaMenuModel createMenu(PizzaMenuDto dto) {
        return this.createMenu(dto);
    }

    public PizzaMenuDto getMenu(long id){
        return pizzaMenuRepository.getMenu(id);
    }

}

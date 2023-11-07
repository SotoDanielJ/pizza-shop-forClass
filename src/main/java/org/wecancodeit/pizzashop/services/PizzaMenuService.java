package org.wecancodeit.pizzashop.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.wecancodeit.pizzashop.dto.PizzaMenuDto;
import org.wecancodeit.pizzashop.models.PizzaMenuModel;
import org.wecancodeit.pizzashop.repositories.PizzaMenuRepository;

import jakarta.annotation.Resource;

@Service
public class PizzaMenuService {

 
    PizzaMenuRepository pizzaMenuRepository;

    public PizzaMenuService() {
        this.pizzaMenuRepository = new PizzaMenuRepository();
    }

    public PizzaMenuModel createMenu(PizzaMenuDto dto) {
        return pizzaMenuRepository.createMenu(dto);
    }

    public PizzaMenuDto getMenu(long id){
        /// id exists
        return pizzaMenuRepository.getMenu(id);
    }
    public List<PizzaMenuDto> listMenus(){
        return pizzaMenuRepository.listMenu();
    }

}

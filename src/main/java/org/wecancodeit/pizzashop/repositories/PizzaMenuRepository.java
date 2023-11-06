package org.wecancodeit.pizzashop.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.wecancodeit.pizzashop.Dto.PizzaMenuDto;
import org.wecancodeit.pizzashop.models.PizzaMenuModel;

public class PizzaMenuRepository {
   
    private Map<Long,PizzaMenuModel> table = new HashMap<>();

    public PizzaMenuModel createMenu(PizzaMenuDto dto){
        PizzaMenuModel pizzaMenuModel = dto.convertToMenu();
        table.put(pizzaMenuModel.getId(), pizzaMenuModel);
        return pizzaMenuModel;
    }

    public List<PizzaMenuDto> listMenu(){
        ArrayList<PizzaMenuDto> returnValue = new ArrayList<>();
        for(PizzaMenuModel model: table.values()){
            returnValue.add(new PizzaMenuDto(model));
        }
        return returnValue;
    }

    public PizzaMenuDto getMenu(long id){
        return new PizzaMenuDto(table.get(id));
    }
    
    public PizzaMenuModel updateMenu(PizzaMenuDto dto){
          PizzaMenuModel pizzaMenuModel = dto.convertToMenu();
        table.put(pizzaMenuModel.getId(), pizzaMenuModel);
        return pizzaMenuModel;
    }

     public void deleteMenu(long id){
        table.remove(id);
     }
}

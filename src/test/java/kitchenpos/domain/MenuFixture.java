package kitchenpos.domain;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public class MenuFixture {

    public static Menu Menu(String name, int price, UUID menuGroupId, MenuProduct... menuProducts) {
        Menu menu = new Menu();
        menu.setName(name);
        menu.setPrice(BigDecimal.valueOf(price).setScale(2));
        menu.setMenuGroupId(menuGroupId);
        menu.setMenuProducts(List.of(menuProducts));
        return menu;
    }

    public static Menu MenuWithUUIDAndMenuGroup(String name, int price, MenuGroup menuGroup, MenuProduct... menuProducts) {
        Menu menu = Menu(name, price, menuGroup.getId(), menuProducts);
        menu.setId(UUID.randomUUID());
        menu.setMenuGroup(menuGroup);
        return menu;
    }
}
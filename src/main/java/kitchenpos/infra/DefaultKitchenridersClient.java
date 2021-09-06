package kitchenpos.infra;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.UUID;

@Component
public class DefaultKitchenridersClient implements KitchenridersClient {
    @Override
    public void requestDelivery(UUID orderId, BigDecimal amount, String deliveryAddress) {
    }
}
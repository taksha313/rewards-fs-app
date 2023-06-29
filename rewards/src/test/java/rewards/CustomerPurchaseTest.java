package rewards;

import com.mycart.rewards.entity.CustomerPurchase;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CustomerPurchaseTest {

    private CustomerPurchase customerPurchase;

    @Before
    public void setup() {
        customerPurchase = new CustomerPurchase();
    }

    @Test
    public void testSetAndGetId() {
        long id = 1;
        customerPurchase.setId(id);
        assertEquals(id, customerPurchase.getId());
    }

    @Test
    public void testSetAndGetCustomerId() {
        String customerId = "ABC123";
        customerPurchase.setCustomerId(customerId);
        assertEquals(customerId, customerPurchase.getCustomerId());
    }

    @Test
    public void testSetAndGetAmount() {
        float amount = 100.0f;
        customerPurchase.setAmount(amount);
        assertEquals(amount, customerPurchase.getAmount(), 0.0);
    }

    @Test
    public void testSetAndGetPurchaseDate() {
        Date purchaseDate = new Date();
        customerPurchase.setPurchaseDate(purchaseDate);
        assertEquals(purchaseDate, customerPurchase.getPurchaseDate());
    }

    @Test
    public void testSetAndGetReward() {
        int reward = 10;
        customerPurchase.setReward(reward);
        assertEquals(reward, customerPurchase.getReward());
    }

    @Test
    public void testObjectCreation() {
        assertNotNull(customerPurchase);
    }
}

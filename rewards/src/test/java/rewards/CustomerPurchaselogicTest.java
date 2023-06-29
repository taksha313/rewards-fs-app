package rewards;



import org.junit.Assert;
import org.junit.Test;




import com.mycart.rewards.entity.CustomerPurchase;


public class CustomerPurchaselogicTest {

    @Test
    public void testRewardPointsFor120Purchase() {
        CustomerPurchase purchase = new CustomerPurchase();
        purchase.setAmount(120);

        int rewardPoints = calculateRewardPoints(purchase.getAmount());

        Assert.assertEquals(90, rewardPoints);
    }


    private int calculateRewardPoints(float amount) {
        int reward = 0;
        if(amount <= 50) {
            return reward;
        }
        else if(amount > 50 && amount <=100){
            reward += (amount - 50);
        }
        else if(amount > 100)
        {
            reward += 50;
            reward += (amount-100)*2;
        }
        return reward;
    }
}



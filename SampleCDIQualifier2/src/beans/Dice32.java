package beans;

import java.io.Serializable;
import java.util.Random;

import javax.enterprise.context.RequestScoped;

@Maximum(value=32)
@RequestScoped
public class Dice32 implements Dice, Serializable {

	@Override
	public Integer playDice() {
		return new Random().nextInt(32) + 1;
	}

}

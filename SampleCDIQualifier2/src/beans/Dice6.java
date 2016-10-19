package beans;

import java.io.Serializable;
import java.util.Random;

import javax.enterprise.context.RequestScoped;

@Maximum(value=6)
@RequestScoped
public class Dice6 implements Dice, Serializable {

	@Override
	public Integer playDice() {
		return new Random().nextInt(6) + 1;
	}

}

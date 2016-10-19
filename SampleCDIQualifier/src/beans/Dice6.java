package beans;

import java.io.Serializable;
import java.util.Random;

import javax.enterprise.context.Dependent;

@Max6
@Dependent
public class Dice6 implements Dice, Serializable {

	@Override
	public Integer playDice() {
		return new Random().nextInt(6) + 1;
	}

}

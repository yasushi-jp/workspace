package beans;

import java.io.Serializable;
import java.util.Random;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Alternative;

@Alternative
@RequestScoped
public class Dice52 implements Dice, Serializable {

	@Override
	public Integer playDice() {
		return new Random().nextInt(52) + 1;
	}

}

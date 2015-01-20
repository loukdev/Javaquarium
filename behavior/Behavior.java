/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaquarium.behavior;

import java.util.Random;
import javaquarium.Aquarium;
import javaquarium.LivingBeing;

/**
 *
 * @author louka
 */
public abstract class Behavior implements IBehavior {
	protected Random r = new Random();

	@Override
	public void age(LivingBeing entity, Aquarium aquarium) {
		if(entity.isAlive())
			this.evolve(entity, aquarium);
	}
	protected abstract void evolve(LivingBeing entity, Aquarium aquarium);
}

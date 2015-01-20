/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaquarium.behavior;

import javaquarium.Aquarium;
import javaquarium.LivingBeing;
import javaquarium.Sex;

/**
 *
 * @author louka
 */
public class Hermaphrodism extends Behavior implements IBreeding {

	@Override
	protected void evolve(LivingBeing entity, Aquarium aquarium) {
		LivingBeing other = aquarium.getLivingBeing(r.nextInt(), entity.getKind());
		if(other == null)
			return;

		this.adapt(entity, other);
		if(this.canBreed(entity, other))
			aquarium.add(entity.reproduce());
	}

	@Override
	public void adapt(LivingBeing first, LivingBeing second) {
		if(first.getSex() != second.getSex())
			first.setSex(Sex.reverse(first.getSex()));
	}

	@Override
	public boolean canBreed(LivingBeing first, LivingBeing second) {
		return first.getKind() == second.getKind() && !first.isHungry();
	}
	
}

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
public class TimeVariableSexism extends Behavior implements IBreeding {

	@Override
	protected void evolve(LivingBeing entity, Aquarium aquarium) {

	}

	@Override
	public void adapt(LivingBeing first, LivingBeing second) {
		if(first.getAge() == 10)
			first.setSex(Sex.reverse(first.getSex()));
	}

	@Override
	public boolean canBreed(LivingBeing first, LivingBeing second) {
		return first.getKind() == second.getKind() &&
				first.getSex() == Sex.reverse(second.getSex());
	}
}

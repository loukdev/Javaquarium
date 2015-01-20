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
public class Unisexism extends Behavior implements IBreeding {

	@Override
	protected void evolve(LivingBeing entity, Aquarium aquarium) {

	}

	@Override
	public void adapt(LivingBeing first, LivingBeing second) {}

	@Override
	public boolean canBreed(LivingBeing first, LivingBeing second) {
		return first.getSex() == Sex.reverse(second.getSex());
	}
	
}

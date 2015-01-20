/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaquarium.behavior;

import javaquarium.Aquarium;
import javaquarium.LivingBeing;

/**
 *
 * @author louka
 */
public interface IBehavior {

	public void age(LivingBeing entity, Aquarium aquarium);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaquarium.behavior;

import javaquarium.LivingBeing;

/**
 *
 * @author louka
 */
public interface IBreeding extends IBehavior {

	public void		adapt(LivingBeing first, LivingBeing second);

	public boolean	canBreed(LivingBeing first, LivingBeing second);
}

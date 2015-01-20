/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaquarium;

/**
 *
 * @author louka
 */
public enum Sex {
	MALE, FEMALE, NONE;

	public static Sex reverse(Sex sex) {
		if(sex != NONE) {
			if(sex == FEMALE)
				return MALE;
			else
				return FEMALE;
		}
		else
			return NONE;
	}
}

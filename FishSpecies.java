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
public enum FishSpecies {
	TUNA("tuna"), CARP("carp"), SOLE("sole");

	private final String _species;

	FishSpecies(String species) {
		_species = species;
	}

	@Override
	public String toString() {
		return _species;
	}
}

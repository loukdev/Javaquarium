/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaquarium;

import java.util.List;

/**
 *
 * @author louka
 */
public class Aquarium {
	protected List<LivingBeing> _fishes;
	protected List<LivingBeing> _seaweeds;

	public void Aquarium() {
		
	}

	public void run(int nyears){
		for(int i = 0 ; i < nyears ; i++) {
			System.out.println("Pouet : " + i);
		}
	}

	public List<LivingBeing> getFishes() {
		return _fishes;
	}
	public List<LivingBeing> getSeaweeds() {
		return _seaweeds;
	}
	public LivingBeing getLivingBeing(int i, Kind kind) {
		if(kind == Kind.FISH)
			return _fishes.get(i);
		else if(kind == Kind.SEAWEED)
			return _seaweeds.get(i);
		else
			return null;
	}

	public void add(LivingBeing entity) {
		if(entity.getKind() == Kind.FISH)
			_fishes.add(entity);
		else if(entity.getKind() == Kind.SEAWEED)
			_seaweeds.add(entity);
	}
}

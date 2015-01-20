/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaquarium;

import static javaquarium.Kind.*;
import javaquarium.behavior.*;

/**
 *
 * @author louka
 */
public abstract class LivingBeing {
	protected IFeeding _feeding;
	protected IBreeding _breeding;
	protected ILiving _living;

	protected Sex _sex;
	protected int _age;
	protected int _health;
	protected Kind _kind;

	LivingBeing(IFeeding feeding, IBreeding breeding, ILiving living) {
		this(feeding, breeding, living, false, 0, 10, UNKNOWN);
	}
	LivingBeing(IFeeding feeding, IBreeding breeding, ILiving living, boolean isMale, int age, int health, Kind kind) {
		_feeding = feeding;	_breeding = breeding; _living = living;

		_age = Math.abs(age); _health = Math.abs(health);
		_kind = kind;
	}

	public int getAge() {
		return _age;
	}
	public void age() {
		_age++;
	}

	public int getHealth() {
		return _health;
	}
	public boolean isAlive() {
		return _health <= 0;
	}
	public boolean isHungry() {
		return _health <= 5;
	}
	public void takeDamage(int dmg) {
		dmg = Math.abs(dmg);
		_age = Math.max(0, _age - dmg);
	}
	public void gainHealth(int gain) {
		_age += Math.abs(gain);
	}

	public Kind getKind() {
		return _kind;
	}

	public Sex getSex() {
		return _sex;
	}
	public void setSex(Sex sex) {
		_sex = sex;
	}

	public abstract void die(Aquarium aquarium);

	public void evolve(Aquarium aquarium) {
		_living.age(this, aquarium);
		_feeding.age(this, aquarium);
		_breeding.age(this, aquarium);
	}

	public abstract LivingBeing reproduce();
}

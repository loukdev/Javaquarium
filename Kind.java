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
public enum Kind {
	SEAWEED("seaweed"), FISH("fish"), UNKNOWN("unknown");

	private final String _kind;

	Kind(String kind) {
		_kind = kind;
	}

	@Override
	public String toString() {
		return _kind;
	}
}

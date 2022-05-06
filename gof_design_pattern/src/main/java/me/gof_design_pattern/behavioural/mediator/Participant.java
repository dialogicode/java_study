package me.gof_design_pattern.behavioural.mediator;

public abstract class Participant {
	protected Mediator mediator;

	public Participant(Mediator mediator) {
		this.mediator = mediator;
	}
}

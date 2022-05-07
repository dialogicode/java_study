package me.study.behavioural.mediator;

public class HeatBoiler extends Participant {
	private boolean bOff = true;

	public HeatBoiler(Mediator mediator) {
		super(mediator);
	}

	public void on() {
		if (!bOff) return;
		bOff = false;
		mediator.participantChanged(this);
	}

	public void off() {
		if (bOff) return;
		bOff = true;
		mediator.participantChanged(this);
	}

	public boolean isRunning() {
		return !bOff;
	}

	@Override
	public String toString() {
		return "# 보일러: " + (bOff ? "꺼짐" : "켜짐");
	}
}

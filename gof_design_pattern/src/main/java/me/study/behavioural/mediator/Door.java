package me.study.behavioural.mediator;

public class Door extends Participant {
	private boolean bClosed = true;

	public Door(Mediator mediator) {
		super(mediator);
	}

	public void open() {
		if (!bClosed) return;
		bClosed = false;
		mediator.participantChanged(this);
	}

	public void close() {
		if (bClosed) return;
		bClosed = true;
		mediator.participantChanged(this);
	}

	public boolean isbClosed() {
		return bClosed;
	}

	@Override
	public String toString() {
		return "# 문: " + (bClosed ? "닫힘" : "열림");
	}
}

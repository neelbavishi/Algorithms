package com.interview.ooad.elevatorsystem;

public class GoToFloorCommand extends CommandBase {
	private int floor = 1;

	public GoToFloorCommand(Lift lift, long time, boolean isExternal, int floor) {
		super(lift, time, isExternal);
		floor(floor);
	}

	public GoToFloorCommand(Lift lift, long time, int floor) {
		super(lift, time);
		floor(floor);
	}

	protected void doIt() {
		Lift lift = lift();
		int curr = lift.floor();
		if (floor == curr) {
			System.out.println("Invalid GoToFloorCommand: Floor request is the same as current floor. Issue OpenDoorCommand instead.");
			return;
		}
		// Upper floor
		if (floor > curr) {
			lift.enqueueFloorUpward(curr);
			return;
		}
		// Lower floor
		lift.enqueueFloorDownward(curr);
	}

	public int floor() {
		return floor;
	}

	private void floor(int floor) {
		if (floor < 1) {
			System.err.println("floor must be greater than or equal to 1");
			throw new IllegalArgumentException();
		}
		this.floor = floor;
	}
}

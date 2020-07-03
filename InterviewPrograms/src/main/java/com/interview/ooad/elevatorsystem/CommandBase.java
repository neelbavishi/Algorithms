package com.interview.ooad.elevatorsystem;

public abstract class CommandBase {
	private Lift lift = null;
	private long time = 0;
	private boolean isExternal = false;
	
	public CommandBase(Lift lift, long time, boolean isExternal) {
		this(lift, time);
		isExternal(isExternal);
	}
	
	public CommandBase(Lift lift, long time) {
		lift(lift);
		time(time);
	}

	public void execute() {
		if (isIllegalOperation()) {
			System.err.println("Illegal operation: command aborted");
			return;
		}
		doIt();
	}

	abstract protected void doIt();

	public Lift lift() {
		return lift;
	}

	public void lift(Lift lift) {
		if (lift == null) {
			System.err.println("lift must not be null");
			throw new IllegalArgumentException();
		}
		this.lift = lift;
	}

	public long time() {
		return time;
	}

	public void time(long time) {
		if (time < 0) {
			System.err.println("time must be greater than or equal to zero");
			throw new IllegalArgumentException();
		}
		this.time = time;
	}

	public boolean isExternal() {
		return isExternal;
	}

	public void isExternal(boolean isExternal) {
		this.isExternal = isExternal;
	}

	private boolean isIllegalOperation() {
		if (isExternal && lift.isMaintenanceState()) {
			System.err.println("A lift does not accept external commands in MAINTENANCE state.");
			return true;
		}
		return false;
	}

}

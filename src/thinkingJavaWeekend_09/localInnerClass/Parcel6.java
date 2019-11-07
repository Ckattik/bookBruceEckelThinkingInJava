package thinkingJavaWeekend_09.localInnerClass;

public class Parcel6 {

	public Parcel6() {
		// TODO Auto-generated constructor stub
	}

	private void internalTracking(boolean b) {
		if (b) {
			class TrackingSlip {
				private String id;

				public TrackingSlip(String s) {
					// TODO Auto-generated constructor stub
					id = s;
				}

				public String getSlip() {
					return id;
				}

				TrackingSlip ts = new TrackingSlip("slip");
				String s = ts.getSlip();
			}

			// Здесь использовать нельзя !Вне области действия
			// TrackingSlip ts = new TrackingSlip("x");
		}

	}

	public void track() {
		internalTracking(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel6 p = new Parcel6();
		p.track();
	}
}

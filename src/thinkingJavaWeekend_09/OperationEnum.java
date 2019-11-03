package thinkingJavaWeekend_09;

public enum OperationEnum {

	
	
	SUM{
		public int action(int x, int y) {
			return x + y;
		}
	},
	MINUS{
		public int action(int x, int y) {
			return x - y;
		}
	},
	MULTYPLY{
		public int action(int x, int y) {
			return x * y;
		}
	};
	public abstract int action(int x, int y);
	
}

public class Counter {
	int currentState;
	int upperBound;
	int bottomBound;
	public String errorCode;
	
	public Counter() {
		this.currentState = 0;
		this.upperBound = 10;
		this.bottomBound = 0;
	}
	
	public Counter(int x, int minValue, int maxValue) {
		int border = Math.min(minValue, maxValue);
		
		if(border != minValue) {
			maxValue = minValue;
			minValue = border;
		}
		
		if(currentState < minValue || currentState > maxValue) {
			this.currentState = minValue;
		}else {
			this.currentState = currentState;
		}
		
		this.bottomBound = minValue;
		this.upperBound = maxValue;
	}
	
	public int getCounter() {
		return this.currentState;
	}
	
	public int State(){
		return getCounter();
	}
	
	public void Increase() {
		this.currentState++;
		
		if(this.currentState > this.upperBound) {
			this.currentState = this.upperBound;
			this.errorCode = "Превышено допустимое значение";
		}
	}
	
	public void Reduce() {
		this.currentState--;
		
		if(this.currentState < this.bottomBound) {
			this.currentState = this.bottomBound;
			this.errorCode = "Превышено допустимое значение";
		}
	}
}

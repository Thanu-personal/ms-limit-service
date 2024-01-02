package learn.microservice.limitservice.bean;

public class Limit {

	private Integer minimum;
	private Integer maximum;

	public Limit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Limit(Integer minimum, Integer maximum) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
	}

	public Integer getMinimum() {
		return minimum;
	}

	public void setMinimum(Integer minimum) {
		this.minimum = minimum;
	}

	public Integer getMaximum() {
		return maximum;
	}

	public void setMaximum(Integer maximum) {
		this.maximum = maximum;
	}

	@Override
	public String toString() {
		return "Limit [minimum=" + minimum + ", maximum=" + maximum + "]";
	}

}

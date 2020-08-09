package questionone.src.main.java.com.java.interview;

import questionone.src.main.java.com.java.interview.Engine;

public class GasEngine implements Engine {

	String EngineType = "gas";

	public String getType() {
		return this.EngineType;
	}

	public void setType(String type) {
		this.EngineType = type;
	}

}

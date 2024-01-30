package VariableScope;

public class SimpleInterst {
	float interest (int p, float t, float r) { // time in yrs and rate in % as 7.5%
		int principle = 1000000;
		float time = 5;
		float rate = 0.05f;
		float i = (principle*time*rate)/100;
		return i;
	}

}

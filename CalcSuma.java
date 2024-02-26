package github;

import java.util.Objects;

public class CalcSuma {
	private int a;
	private int b;
	private int res;
	
	public CalcSuma(int a, int b) {
		this.a=a;
		this.b=b;
		res=this.a+this.b;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	@Override
	public int hashCode() {
		return Objects.hash(a, b, res);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CalcSuma other = (CalcSuma) obj;
		return a == other.a && b == other.b && res == other.res;
	}

	@Override
	public String toString() {
		return "CalcSuma [a=" + a + ", b=" + b + ", res=" + res + "]";
	}
	
	
	/*comentarios actualizados*/
	/*más comentarios*/
	
	
	
}

package net.vin.box.form;

import javax.persistence.Entity;

@Entity
public class SearchFilterField {
	String key;
	String value1;
	String value2;
	String operator;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue1() {
		return value1;
	}

	public void setValue1(String value1) {
		this.value1 = value1;
	}

	public String getValue2() {
		return value2;
	}

	public void setValue2(String value2) {
		this.value2 = value2;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String toSqlString() {
		StringBuilder str = new StringBuilder();

		if (key == null || operator == null || value1 == null) {
			System.err.println("Error - Key, Type and Value1 is required");
		}

		str.append(key);
		str.append(" = ?");

		return str.toString();
	}

	@Override
	public String toString() {
		return "[key:" + key + ", operator:" + operator + ", value1:" + value1
				+ ", value2:" + value2 + "]";
	}

}

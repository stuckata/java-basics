package org.stu.homework03;
import java.math.BigDecimal;

class Product implements Comparable<Product> {

	private String name;

	private BigDecimal price;

	private BigDecimal quantity;

	public Product(String line) {
		super();

		this.name = line.replaceAll("[^a-z]", "");
		this.price = new BigDecimal(line.replaceAll("[^.0-9]", ""));

	}

	public Product(String line, boolean isQty) {
		super();

		this.name = line.replaceAll("[^a-z]", "");
		if (isQty) {
			this.quantity = new BigDecimal(line.replaceAll("[^.0-9]", ""));
		} else {
			this.price = new BigDecimal(line.replaceAll("[^.0-9]", ""));
		}

	}

	public BigDecimal multiply(BigDecimal qty) {
		return getPrice().multiply(qty);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public int compareTo(Product product) {
		return getPrice().compareTo(product.getPrice());
	}

	@Override
	public String toString() {
		return getPrice() + " " + getName();
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

}

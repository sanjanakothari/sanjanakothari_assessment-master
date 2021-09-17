package com.qa.ims.persistence.domain;

public class Item {

	private Long id;
	private Double value;
	private String name;

	public Item(String name, Double value) {
		this.setName(name);
		this.setValue(value);
	}

	public Item(Long id, String name, Double value) {
		this.setId(id);
		this.setName(name);
		this.setValue(value);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	@Override
	public String toString() {
		String toReturn = String.format("Item-ID: %-3d | Name: %-20s | Value: £%-4.2f", id, name, value);
		return toReturn;
	}

	@Override
	public int hashCode() {
		final int prime = 7;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (name == null) {
			if (other.getName() != null)
				return false;
		} else if (!getName().contentEquals(other.getName())) {
			return false;
		}
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.getId()))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.getValue())) {
			return false;
		}
		return true;
	}
}

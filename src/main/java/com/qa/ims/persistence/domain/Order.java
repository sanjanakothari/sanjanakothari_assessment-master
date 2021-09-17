package com.qa.ims.persistence.domain;

public class Order {

	protected Long orderID, customerID, itemID, quantity;

	public Order(Long customerID, Long itemID, Long quantity) {
		this.setCustomerID(customerID);
    this.setItemID(itemID);
    this.setQuantity(quantity);
	}

	public Order(Long orderID, Long customerID, Long itemID, Long quantity) {
		this.setOrderID(orderID);
    this.setCustomerID(customerID);
    this.setItemID(itemID);
    this.setQuantity(quantity);
	}

	public Long getOrderID() {
		return orderID;
	}

	public void setOrderID(Long orderID) {
		this.orderID = orderID;
	}

	public Long getCustomerID() {
		return customerID;
	}

	public void setCustomerID(Long customerID) {
		this.customerID = customerID;
	}

  public Long getItemID() {
    return itemID;
  }

  public void setItemID(Long itemID) {
    this.itemID = itemID;
  }

  public Long getQuantity(){
    return quantity;
  }

  public void setQuantity(Long itemID) {
    this.quantity = quantity;
  }

	@Override
	public String toString() {
		return "Order ID:" + orderID + " Customer ID:" + customerID + " | itemID:" + itemID + " | quantity:" + quantity;
	}

	@Override
	public int hashCode() {
		final int prime = 7;
		int result = 1;
		result = prime * result + ((orderID == null) ? 0 : Long.hashCode(orderID));
		result = prime * result + ((customerID == null) ? 0 : Long.hashCode(customerID));
    result = prime * result + ((itemID == null) ? 0 : Long.hashCode(itemID));
    result = prime * result + ((quantity == null) ? 0 : Long.hashCode(quantity));
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
		Order other = (Order) obj;
		// Compare Order-ID
    if (getOrderID() == null) {
			if (other.getOrderID() != null)
				return false;
		} else if (!orderID.equals(other.getOrderID()))
				return false;
		// Compare Customer-ID
		if (getCustomerID() == null) {
			if (other.getCustomerID() != null)
				return false;
		} else if (!getCustomerID().equals(other.getCustomerID()))
			return false;
      if (getItemID() == null) {
  			if (other.getItemID() != null)
  				return false;
  		} else if (!itemID.equals(other.getItemID()))
  			return false;
      if (getQuantity() == null) {
        if (other.getQuantity() != null)
          return false;
      } else if (!quantity.equals(other.getQuantity()))
        return false;
		return true;
	}
}

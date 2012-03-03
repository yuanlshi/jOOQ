/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "CustomerAddress", schema = "Sales", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"CustomerID", "AddressID"})
})
public class CustomerAddress implements java.io.Serializable {

	private static final long serialVersionUID = -1172647811;

	private java.lang.Integer  CustomerID;
	private java.lang.Integer  AddressID;
	private java.lang.Integer  AddressTypeID;
	private java.lang.String   rowguid;
	private java.sql.Timestamp ModifiedDate;

	@javax.persistence.Column(name = "CustomerID", nullable = false)
	public java.lang.Integer getCustomerID() {
		return this.CustomerID;
	}

	public void setCustomerID(java.lang.Integer CustomerID) {
		this.CustomerID = CustomerID;
	}

	@javax.persistence.Column(name = "AddressID", nullable = false)
	public java.lang.Integer getAddressID() {
		return this.AddressID;
	}

	public void setAddressID(java.lang.Integer AddressID) {
		this.AddressID = AddressID;
	}

	@javax.persistence.Column(name = "AddressTypeID", nullable = false)
	public java.lang.Integer getAddressTypeID() {
		return this.AddressTypeID;
	}

	public void setAddressTypeID(java.lang.Integer AddressTypeID) {
		this.AddressTypeID = AddressTypeID;
	}

	@javax.persistence.Column(name = "rowguid", nullable = false)
	public java.lang.String getrowguid() {
		return this.rowguid;
	}

	public void setrowguid(java.lang.String rowguid) {
		this.rowguid = rowguid;
	}

	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return this.ModifiedDate;
	}

	public void setModifiedDate(java.sql.Timestamp ModifiedDate) {
		this.ModifiedDate = ModifiedDate;
	}
}

/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "Location", schema = "Production")
public class Location implements java.io.Serializable {

	private static final long serialVersionUID = 90465316;

	private java.lang.Short      LocationID;
	private java.lang.String     Name;
	private java.math.BigDecimal CostRate;
	private java.math.BigDecimal Availability;
	private java.sql.Timestamp   ModifiedDate;

	@javax.persistence.Id
	@javax.persistence.Column(name = "LocationID", unique = true, nullable = false)
	public java.lang.Short getLocationID() {
		return this.LocationID;
	}

	public void setLocationID(java.lang.Short LocationID) {
		this.LocationID = LocationID;
	}

	@javax.persistence.Column(name = "Name", nullable = false)
	public java.lang.String getName() {
		return this.Name;
	}

	public void setName(java.lang.String Name) {
		this.Name = Name;
	}

	@javax.persistence.Column(name = "CostRate", nullable = false)
	public java.math.BigDecimal getCostRate() {
		return this.CostRate;
	}

	public void setCostRate(java.math.BigDecimal CostRate) {
		this.CostRate = CostRate;
	}

	@javax.persistence.Column(name = "Availability", nullable = false)
	public java.math.BigDecimal getAvailability() {
		return this.Availability;
	}

	public void setAvailability(java.math.BigDecimal Availability) {
		this.Availability = Availability;
	}

	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return this.ModifiedDate;
	}

	public void setModifiedDate(java.sql.Timestamp ModifiedDate) {
		this.ModifiedDate = ModifiedDate;
	}
}

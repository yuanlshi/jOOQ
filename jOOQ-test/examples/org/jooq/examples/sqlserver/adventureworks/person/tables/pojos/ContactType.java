/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.person.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "ContactType", schema = "Person")
public class ContactType implements java.io.Serializable {

	private static final long serialVersionUID = 1577140314;

	private java.lang.Integer  ContactTypeID;
	private java.lang.String   Name;
	private java.sql.Timestamp ModifiedDate;

	@javax.persistence.Id
	@javax.persistence.Column(name = "ContactTypeID", unique = true, nullable = false)
	public java.lang.Integer getContactTypeID() {
		return this.ContactTypeID;
	}

	public void setContactTypeID(java.lang.Integer ContactTypeID) {
		this.ContactTypeID = ContactTypeID;
	}

	@javax.persistence.Column(name = "Name", nullable = false)
	public java.lang.String getName() {
		return this.Name;
	}

	public void setName(java.lang.String Name) {
		this.Name = Name;
	}

	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return this.ModifiedDate;
	}

	public void setModifiedDate(java.sql.Timestamp ModifiedDate) {
		this.ModifiedDate = ModifiedDate;
	}
}

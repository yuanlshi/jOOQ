/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables;

/**
 * This class is generated by jOOQ.
 */
public class UnitMeasure extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.UnitMeasure> {

	private static final long serialVersionUID = 196262958;

	/**
	 * The singleton instance of Production.UnitMeasure
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.production.tables.UnitMeasure UnitMeasure = new org.jooq.examples.sqlserver.adventureworks.production.tables.UnitMeasure();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.production.tables.records.UnitMeasure> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.production.tables.records.UnitMeasure.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.production.tables.records.UnitMeasure> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.UnitMeasure, java.lang.String> UnitMeasureCode = createField("UnitMeasureCode", org.jooq.impl.SQLDataType.NCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.UnitMeasure, java.lang.String> Name = createField("Name", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.UnitMeasure, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * No further instances allowed
	 */
	private UnitMeasure() {
		super("UnitMeasure", org.jooq.examples.sqlserver.adventureworks.production.Production.Production);
	}

	/**
	 * No further instances allowed
	 */
	private UnitMeasure(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.production.Production.Production, org.jooq.examples.sqlserver.adventureworks.production.tables.UnitMeasure.UnitMeasure);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.UnitMeasure> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_UnitMeasure_UnitMeasureCode;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.UnitMeasure>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.UnitMeasure>>asList(org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_UnitMeasure_UnitMeasureCode);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.production.tables.UnitMeasure as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.production.tables.UnitMeasure(alias);
	}
}

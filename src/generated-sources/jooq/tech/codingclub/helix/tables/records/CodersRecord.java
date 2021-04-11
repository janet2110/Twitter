/*
 * This file is generated by jOOQ.
*/
package tech.codingclub.helix.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;

import tech.codingclub.helix.tables.Coders;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CodersRecord extends TableRecordImpl<CodersRecord> implements Record2<Long, String> {

    private static final long serialVersionUID = 1760983510;

    /**
     * Setter for <code>twitter.coders.age</code>.
     */
    public void setAge(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>twitter.coders.age</code>.
     */
    public Long getAge() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>twitter.coders.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>twitter.coders.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Coders.CODERS.AGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Coders.CODERS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getAge();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getAge();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CodersRecord value1(Long value) {
        setAge(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CodersRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CodersRecord values(Long value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CodersRecord
     */
    public CodersRecord() {
        super(Coders.CODERS);
    }

    /**
     * Create a detached, initialised CodersRecord
     */
    public CodersRecord(Long age, String name) {
        super(Coders.CODERS);

        set(0, age);
        set(1, name);
    }
}

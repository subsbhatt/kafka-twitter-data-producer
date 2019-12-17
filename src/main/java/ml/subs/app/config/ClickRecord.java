package ml.subs.app.config;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class ClickRecord extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
    private static final long serialVersionUID = 4134365027792852721L;
    public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ClickRecord\",\"fields\":[{\"name\":\"session_id\",\"type\":\"string\"},{\"name\":\"browser\",\"type\":[\"string\",\"null\"]},{\"name\":\"campaign\",\"type\":[\"string\",\"null\"]},{\"name\":\"channel\",\"type\":\"string\"},{\"name\":\"referrer\",\"type\":[\"string\",\"null\"],\"default\":\"None\"},{\"name\":\"ip\",\"type\":[\"string\",\"null\"]}]}");
    public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
    @Deprecated public java.lang.CharSequence session_id;
    @Deprecated public java.lang.CharSequence browser;
    @Deprecated public java.lang.CharSequence campaign;
    @Deprecated public java.lang.CharSequence channel;
    @Deprecated public java.lang.CharSequence referrer;
    @Deprecated public java.lang.CharSequence ip;

    /**
     * Default constructor.  Note that this does not initialize fields
     * to their default values from the schema.  If that is desired then
     * one should use <code>newBuilder()</code>.
     */
    public ClickRecord() {}

    /**
     * All-args constructor.
     * @param session_id The new value for session_id
     * @param browser The new value for browser
     * @param campaign The new value for campaign
     * @param channel The new value for channel
     * @param referrer The new value for referrer
     * @param ip The new value for ip
     */
    public ClickRecord(java.lang.CharSequence session_id, java.lang.CharSequence browser, java.lang.CharSequence campaign, java.lang.CharSequence channel, java.lang.CharSequence referrer, java.lang.CharSequence ip) {
        this.session_id = session_id;
        this.browser = browser;
        this.campaign = campaign;
        this.channel = channel;
        this.referrer = referrer;
        this.ip = ip;
    }

    public org.apache.avro.Schema getSchema() { return SCHEMA$; }
    // Used by DatumWriter.  Applications should not call.
    public java.lang.Object get(int field$) {
        switch (field$) {
            case 0: return session_id;
            case 1: return browser;
            case 2: return campaign;
            case 3: return channel;
            case 4: return referrer;
            case 5: return ip;
            default: throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    // Used by DatumReader.  Applications should not call.
    @SuppressWarnings(value="unchecked")
    public void put(int field$, java.lang.Object value$) {
        switch (field$) {
            case 0: session_id = (java.lang.CharSequence)value$; break;
            case 1: browser = (java.lang.CharSequence)value$; break;
            case 2: campaign = (java.lang.CharSequence)value$; break;
            case 3: channel = (java.lang.CharSequence)value$; break;
            case 4: referrer = (java.lang.CharSequence)value$; break;
            case 5: ip = (java.lang.CharSequence)value$; break;
            default: throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    /**
     * Gets the value of the 'session_id' field.
     * @return The value of the 'session_id' field.
     */
    public java.lang.CharSequence getSessionId() {
        return session_id;
    }

    /**
     * Sets the value of the 'session_id' field.
     * @param value the value to set.
     */
    public void setSessionId(java.lang.CharSequence value) {
        this.session_id = value;
    }

    /**
     * Gets the value of the 'browser' field.
     * @return The value of the 'browser' field.
     */
    public java.lang.CharSequence getBrowser() {
        return browser;
    }

    /**
     * Sets the value of the 'browser' field.
     * @param value the value to set.
     */
    public void setBrowser(java.lang.CharSequence value) {
        this.browser = value;
    }

    /**
     * Gets the value of the 'campaign' field.
     * @return The value of the 'campaign' field.
     */
    public java.lang.CharSequence getCampaign() {
        return campaign;
    }

    /**
     * Sets the value of the 'campaign' field.
     * @param value the value to set.
     */
    public void setCampaign(java.lang.CharSequence value) {
        this.campaign = value;
    }

    /**
     * Gets the value of the 'channel' field.
     * @return The value of the 'channel' field.
     */
    public java.lang.CharSequence getChannel() {
        return channel;
    }

    /**
     * Sets the value of the 'channel' field.
     * @param value the value to set.
     */
    public void setChannel(java.lang.CharSequence value) {
        this.channel = value;
    }

    /**
     * Gets the value of the 'referrer' field.
     * @return The value of the 'referrer' field.
     */
    public java.lang.CharSequence getReferrer() {
        return referrer;
    }

    /**
     * Sets the value of the 'referrer' field.
     * @param value the value to set.
     */
    public void setReferrer(java.lang.CharSequence value) {
        this.referrer = value;
    }

    /**
     * Gets the value of the 'ip' field.
     * @return The value of the 'ip' field.
     */
    public java.lang.CharSequence getIp() {
        return ip;
    }

    /**
     * Sets the value of the 'ip' field.
     * @param value the value to set.
     */
    public void setIp(java.lang.CharSequence value) {
        this.ip = value;
    }

    /**
     * Creates a new ClickRecord RecordBuilder.
     * @return A new ClickRecord RecordBuilder
     */
    public static ClickRecord.Builder newBuilder() {
        return new ClickRecord.Builder();
    }

    /**
     * Creates a new ClickRecord RecordBuilder by copying an existing Builder.
     * @param other The existing builder to copy.
     * @return A new ClickRecord RecordBuilder
     */
    public static ClickRecord.Builder newBuilder(ClickRecord.Builder other) {
        return new ClickRecord.Builder(other);
    }

    /**
     * Creates a new ClickRecord RecordBuilder by copying an existing ClickRecord instance.
     * @param other The existing instance to copy.
     * @return A new ClickRecord RecordBuilder
     */
    public static ClickRecord.Builder newBuilder(ClickRecord other) {
        return new ClickRecord.Builder(other);
    }

    /**
     * RecordBuilder for ClickRecord instances.
     */
    public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ClickRecord>
            implements org.apache.avro.data.RecordBuilder<ClickRecord> {

        private java.lang.CharSequence session_id;
        private java.lang.CharSequence browser;
        private java.lang.CharSequence campaign;
        private java.lang.CharSequence channel;
        private java.lang.CharSequence referrer;
        private java.lang.CharSequence ip;

        /** Creates a new Builder */
        private Builder() {
            super(SCHEMA$);
        }

        /**
         * Creates a Builder by copying an existing Builder.
         * @param other The existing Builder to copy.
         */
        private Builder(ClickRecord.Builder other) {
            super(other);
            if (isValidValue(fields()[0], other.session_id)) {
                this.session_id = data().deepCopy(fields()[0].schema(), other.session_id);
                fieldSetFlags()[0] = true;
            }
            if (isValidValue(fields()[1], other.browser)) {
                this.browser = data().deepCopy(fields()[1].schema(), other.browser);
                fieldSetFlags()[1] = true;
            }
            if (isValidValue(fields()[2], other.campaign)) {
                this.campaign = data().deepCopy(fields()[2].schema(), other.campaign);
                fieldSetFlags()[2] = true;
            }
            if (isValidValue(fields()[3], other.channel)) {
                this.channel = data().deepCopy(fields()[3].schema(), other.channel);
                fieldSetFlags()[3] = true;
            }
            if (isValidValue(fields()[4], other.referrer)) {
                this.referrer = data().deepCopy(fields()[4].schema(), other.referrer);
                fieldSetFlags()[4] = true;
            }
            if (isValidValue(fields()[5], other.ip)) {
                this.ip = data().deepCopy(fields()[5].schema(), other.ip);
                fieldSetFlags()[5] = true;
            }
        }

        /**
         * Creates a Builder by copying an existing ClickRecord instance
         * @param other The existing instance to copy.
         */
        private Builder(ClickRecord other) {
            super(SCHEMA$);
            if (isValidValue(fields()[0], other.session_id)) {
                this.session_id = data().deepCopy(fields()[0].schema(), other.session_id);
                fieldSetFlags()[0] = true;
            }
            if (isValidValue(fields()[1], other.browser)) {
                this.browser = data().deepCopy(fields()[1].schema(), other.browser);
                fieldSetFlags()[1] = true;
            }
            if (isValidValue(fields()[2], other.campaign)) {
                this.campaign = data().deepCopy(fields()[2].schema(), other.campaign);
                fieldSetFlags()[2] = true;
            }
            if (isValidValue(fields()[3], other.channel)) {
                this.channel = data().deepCopy(fields()[3].schema(), other.channel);
                fieldSetFlags()[3] = true;
            }
            if (isValidValue(fields()[4], other.referrer)) {
                this.referrer = data().deepCopy(fields()[4].schema(), other.referrer);
                fieldSetFlags()[4] = true;
            }
            if (isValidValue(fields()[5], other.ip)) {
                this.ip = data().deepCopy(fields()[5].schema(), other.ip);
                fieldSetFlags()[5] = true;
            }
        }

        /**
         * Gets the value of the 'session_id' field.
         * @return The value.
         */
        public java.lang.CharSequence getSessionId() {
            return session_id;
        }

        /**
         * Sets the value of the 'session_id' field.
         * @param value The value of 'session_id'.
         * @return This builder.
         */
        public ClickRecord.Builder setSessionId(java.lang.CharSequence value) {
            validate(fields()[0], value);
            this.session_id = value;
            fieldSetFlags()[0] = true;
            return this;
        }

        /**
         * Checks whether the 'session_id' field has been set.
         * @return True if the 'session_id' field has been set, false otherwise.
         */
        public boolean hasSessionId() {
            return fieldSetFlags()[0];
        }


        /**
         * Clears the value of the 'session_id' field.
         * @return This builder.
         */
        public ClickRecord.Builder clearSessionId() {
            session_id = null;
            fieldSetFlags()[0] = false;
            return this;
        }

        /**
         * Gets the value of the 'browser' field.
         * @return The value.
         */
        public java.lang.CharSequence getBrowser() {
            return browser;
        }

        /**
         * Sets the value of the 'browser' field.
         * @param value The value of 'browser'.
         * @return This builder.
         */
        public ClickRecord.Builder setBrowser(java.lang.CharSequence value) {
            validate(fields()[1], value);
            this.browser = value;
            fieldSetFlags()[1] = true;
            return this;
        }

        /**
         * Checks whether the 'browser' field has been set.
         * @return True if the 'browser' field has been set, false otherwise.
         */
        public boolean hasBrowser() {
            return fieldSetFlags()[1];
        }


        /**
         * Clears the value of the 'browser' field.
         * @return This builder.
         */
        public ClickRecord.Builder clearBrowser() {
            browser = null;
            fieldSetFlags()[1] = false;
            return this;
        }

        /**
         * Gets the value of the 'campaign' field.
         * @return The value.
         */
        public java.lang.CharSequence getCampaign() {
            return campaign;
        }

        /**
         * Sets the value of the 'campaign' field.
         * @param value The value of 'campaign'.
         * @return This builder.
         */
        public ClickRecord.Builder setCampaign(java.lang.CharSequence value) {
            validate(fields()[2], value);
            this.campaign = value;
            fieldSetFlags()[2] = true;
            return this;
        }

        /**
         * Checks whether the 'campaign' field has been set.
         * @return True if the 'campaign' field has been set, false otherwise.
         */
        public boolean hasCampaign() {
            return fieldSetFlags()[2];
        }


        /**
         * Clears the value of the 'campaign' field.
         * @return This builder.
         */
        public ClickRecord.Builder clearCampaign() {
            campaign = null;
            fieldSetFlags()[2] = false;
            return this;
        }

        /**
         * Gets the value of the 'channel' field.
         * @return The value.
         */
        public java.lang.CharSequence getChannel() {
            return channel;
        }

        /**
         * Sets the value of the 'channel' field.
         * @param value The value of 'channel'.
         * @return This builder.
         */
        public ClickRecord.Builder setChannel(java.lang.CharSequence value) {
            validate(fields()[3], value);
            this.channel = value;
            fieldSetFlags()[3] = true;
            return this;
        }

        /**
         * Checks whether the 'channel' field has been set.
         * @return True if the 'channel' field has been set, false otherwise.
         */
        public boolean hasChannel() {
            return fieldSetFlags()[3];
        }


        /**
         * Clears the value of the 'channel' field.
         * @return This builder.
         */
        public ClickRecord.Builder clearChannel() {
            channel = null;
            fieldSetFlags()[3] = false;
            return this;
        }

        /**
         * Gets the value of the 'referrer' field.
         * @return The value.
         */
        public java.lang.CharSequence getReferrer() {
            return referrer;
        }

        /**
         * Sets the value of the 'referrer' field.
         * @param value The value of 'referrer'.
         * @return This builder.
         */
        public ClickRecord.Builder setReferrer(java.lang.CharSequence value) {
            validate(fields()[4], value);
            this.referrer = value;
            fieldSetFlags()[4] = true;
            return this;
        }

        /**
         * Checks whether the 'referrer' field has been set.
         * @return True if the 'referrer' field has been set, false otherwise.
         */
        public boolean hasReferrer() {
            return fieldSetFlags()[4];
        }


        /**
         * Clears the value of the 'referrer' field.
         * @return This builder.
         */
        public ClickRecord.Builder clearReferrer() {
            referrer = null;
            fieldSetFlags()[4] = false;
            return this;
        }

        /**
         * Gets the value of the 'ip' field.
         * @return The value.
         */
        public java.lang.CharSequence getIp() {
            return ip;
        }

        /**
         * Sets the value of the 'ip' field.
         * @param value The value of 'ip'.
         * @return This builder.
         */
        public ClickRecord.Builder setIp(java.lang.CharSequence value) {
            validate(fields()[5], value);
            this.ip = value;
            fieldSetFlags()[5] = true;
            return this;
        }

        /**
         * Checks whether the 'ip' field has been set.
         * @return True if the 'ip' field has been set, false otherwise.
         */
        public boolean hasIp() {
            return fieldSetFlags()[5];
        }


        /**
         * Clears the value of the 'ip' field.
         * @return This builder.
         */
        public ClickRecord.Builder clearIp() {
            ip = null;
            fieldSetFlags()[5] = false;
            return this;
        }

        @Override
        public ClickRecord build() {
            try {
                ClickRecord record = new ClickRecord();
                record.session_id = fieldSetFlags()[0] ? this.session_id : (java.lang.CharSequence) defaultValue(fields()[0]);
                record.browser = fieldSetFlags()[1] ? this.browser : (java.lang.CharSequence) defaultValue(fields()[1]);
                record.campaign = fieldSetFlags()[2] ? this.campaign : (java.lang.CharSequence) defaultValue(fields()[2]);
                record.channel = fieldSetFlags()[3] ? this.channel : (java.lang.CharSequence) defaultValue(fields()[3]);
                record.referrer = fieldSetFlags()[4] ? this.referrer : (java.lang.CharSequence) defaultValue(fields()[4]);
                record.ip = fieldSetFlags()[5] ? this.ip : (java.lang.CharSequence) defaultValue(fields()[5]);
                return record;
            } catch (Exception e) {
                throw new org.apache.avro.AvroRuntimeException(e);
            }
        }
    }

    private static final org.apache.avro.io.DatumWriter
            WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

    @Override public void writeExternal(java.io.ObjectOutput out)
            throws java.io.IOException {
        WRITER$.write(this, SpecificData.getEncoder(out));
    }

    private static final org.apache.avro.io.DatumReader
            READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

    @Override public void readExternal(java.io.ObjectInput in)
            throws java.io.IOException {
        READER$.read(this, SpecificData.getDecoder(in));
    }

}
/**
 * AclEntries.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class AclEntries  implements java.io.Serializable {
    private com.hannonhill.www.ws.ns.AssetOperationService.AclEntry[] aclEntry;

    public AclEntries() {
    }

    public AclEntries(
           com.hannonhill.www.ws.ns.AssetOperationService.AclEntry[] aclEntry) {
           this.aclEntry = aclEntry;
    }


    /**
     * Gets the aclEntry value for this AclEntries.
     * 
     * @return aclEntry
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.AclEntry[] getAclEntry() {
        return aclEntry;
    }


    /**
     * Sets the aclEntry value for this AclEntries.
     * 
     * @param aclEntry
     */
    public void setAclEntry(com.hannonhill.www.ws.ns.AssetOperationService.AclEntry[] aclEntry) {
        this.aclEntry = aclEntry;
    }

    public com.hannonhill.www.ws.ns.AssetOperationService.AclEntry getAclEntry(int i) {
        return this.aclEntry[i];
    }

    public void setAclEntry(int i, com.hannonhill.www.ws.ns.AssetOperationService.AclEntry _value) {
        this.aclEntry[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AclEntries)) return false;
        AclEntries other = (AclEntries) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.aclEntry==null && other.getAclEntry()==null) || 
             (this.aclEntry!=null &&
              java.util.Arrays.equals(this.aclEntry, other.getAclEntry())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAclEntry() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAclEntry());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAclEntry(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AclEntries.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "acl-entries"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aclEntry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "aclEntry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "aclEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

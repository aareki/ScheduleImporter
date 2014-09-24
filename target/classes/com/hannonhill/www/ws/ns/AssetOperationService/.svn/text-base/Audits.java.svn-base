/**
 * Audits.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class Audits  implements java.io.Serializable {
    private com.hannonhill.www.ws.ns.AssetOperationService.Audit[] audit;

    public Audits() {
    }

    public Audits(
           com.hannonhill.www.ws.ns.AssetOperationService.Audit[] audit) {
           this.audit = audit;
    }


    /**
     * Gets the audit value for this Audits.
     * 
     * @return audit
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.Audit[] getAudit() {
        return audit;
    }


    /**
     * Sets the audit value for this Audits.
     * 
     * @param audit
     */
    public void setAudit(com.hannonhill.www.ws.ns.AssetOperationService.Audit[] audit) {
        this.audit = audit;
    }

    public com.hannonhill.www.ws.ns.AssetOperationService.Audit getAudit(int i) {
        return this.audit[i];
    }

    public void setAudit(int i, com.hannonhill.www.ws.ns.AssetOperationService.Audit _value) {
        this.audit[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Audits)) return false;
        Audits other = (Audits) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.audit==null && other.getAudit()==null) || 
             (this.audit!=null &&
              java.util.Arrays.equals(this.audit, other.getAudit())));
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
        if (getAudit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAudit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAudit(), i);
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
        new org.apache.axis.description.TypeDesc(Audits.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "audits"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "audit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "audit"));
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

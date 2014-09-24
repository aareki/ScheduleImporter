/**
 * FieldValues.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class FieldValues  implements java.io.Serializable {
    private com.hannonhill.www.ws.ns.AssetOperationService.FieldValue[] fieldValue;

    public FieldValues() {
    }

    public FieldValues(
           com.hannonhill.www.ws.ns.AssetOperationService.FieldValue[] fieldValue) {
           this.fieldValue = fieldValue;
    }


    /**
     * Gets the fieldValue value for this FieldValues.
     * 
     * @return fieldValue
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.FieldValue[] getFieldValue() {
        return fieldValue;
    }


    /**
     * Sets the fieldValue value for this FieldValues.
     * 
     * @param fieldValue
     */
    public void setFieldValue(com.hannonhill.www.ws.ns.AssetOperationService.FieldValue[] fieldValue) {
        this.fieldValue = fieldValue;
    }

    public com.hannonhill.www.ws.ns.AssetOperationService.FieldValue getFieldValue(int i) {
        return this.fieldValue[i];
    }

    public void setFieldValue(int i, com.hannonhill.www.ws.ns.AssetOperationService.FieldValue _value) {
        this.fieldValue[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FieldValues)) return false;
        FieldValues other = (FieldValues) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fieldValue==null && other.getFieldValue()==null) || 
             (this.fieldValue!=null &&
              java.util.Arrays.equals(this.fieldValue, other.getFieldValue())));
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
        if (getFieldValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFieldValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFieldValue(), i);
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
        new org.apache.axis.description.TypeDesc(FieldValues.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "fieldValues"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "fieldValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "fieldValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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

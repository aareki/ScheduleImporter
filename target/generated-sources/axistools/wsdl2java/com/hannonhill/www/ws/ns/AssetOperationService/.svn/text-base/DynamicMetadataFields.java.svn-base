/**
 * DynamicMetadataFields.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class DynamicMetadataFields  implements java.io.Serializable {
    private com.hannonhill.www.ws.ns.AssetOperationService.DynamicMetadataField[] dynamicField;

    public DynamicMetadataFields() {
    }

    public DynamicMetadataFields(
           com.hannonhill.www.ws.ns.AssetOperationService.DynamicMetadataField[] dynamicField) {
           this.dynamicField = dynamicField;
    }


    /**
     * Gets the dynamicField value for this DynamicMetadataFields.
     * 
     * @return dynamicField
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.DynamicMetadataField[] getDynamicField() {
        return dynamicField;
    }


    /**
     * Sets the dynamicField value for this DynamicMetadataFields.
     * 
     * @param dynamicField
     */
    public void setDynamicField(com.hannonhill.www.ws.ns.AssetOperationService.DynamicMetadataField[] dynamicField) {
        this.dynamicField = dynamicField;
    }

    public com.hannonhill.www.ws.ns.AssetOperationService.DynamicMetadataField getDynamicField(int i) {
        return this.dynamicField[i];
    }

    public void setDynamicField(int i, com.hannonhill.www.ws.ns.AssetOperationService.DynamicMetadataField _value) {
        this.dynamicField[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DynamicMetadataFields)) return false;
        DynamicMetadataFields other = (DynamicMetadataFields) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dynamicField==null && other.getDynamicField()==null) || 
             (this.dynamicField!=null &&
              java.util.Arrays.equals(this.dynamicField, other.getDynamicField())));
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
        if (getDynamicField() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDynamicField());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDynamicField(), i);
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
        new org.apache.axis.description.TypeDesc(DynamicMetadataFields.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "dynamicMetadataFields"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dynamicField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "dynamicField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "dynamicMetadataField"));
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

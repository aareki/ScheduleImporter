/**
 * DynamicMetadataFieldDefinitions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class DynamicMetadataFieldDefinitions  implements java.io.Serializable {
    private com.hannonhill.www.ws.ns.AssetOperationService.DynamicMetadataFieldDefinition[] dynamicMetadataFieldDefinition;

    public DynamicMetadataFieldDefinitions() {
    }

    public DynamicMetadataFieldDefinitions(
           com.hannonhill.www.ws.ns.AssetOperationService.DynamicMetadataFieldDefinition[] dynamicMetadataFieldDefinition) {
           this.dynamicMetadataFieldDefinition = dynamicMetadataFieldDefinition;
    }


    /**
     * Gets the dynamicMetadataFieldDefinition value for this DynamicMetadataFieldDefinitions.
     * 
     * @return dynamicMetadataFieldDefinition
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.DynamicMetadataFieldDefinition[] getDynamicMetadataFieldDefinition() {
        return dynamicMetadataFieldDefinition;
    }


    /**
     * Sets the dynamicMetadataFieldDefinition value for this DynamicMetadataFieldDefinitions.
     * 
     * @param dynamicMetadataFieldDefinition
     */
    public void setDynamicMetadataFieldDefinition(com.hannonhill.www.ws.ns.AssetOperationService.DynamicMetadataFieldDefinition[] dynamicMetadataFieldDefinition) {
        this.dynamicMetadataFieldDefinition = dynamicMetadataFieldDefinition;
    }

    public com.hannonhill.www.ws.ns.AssetOperationService.DynamicMetadataFieldDefinition getDynamicMetadataFieldDefinition(int i) {
        return this.dynamicMetadataFieldDefinition[i];
    }

    public void setDynamicMetadataFieldDefinition(int i, com.hannonhill.www.ws.ns.AssetOperationService.DynamicMetadataFieldDefinition _value) {
        this.dynamicMetadataFieldDefinition[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DynamicMetadataFieldDefinitions)) return false;
        DynamicMetadataFieldDefinitions other = (DynamicMetadataFieldDefinitions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dynamicMetadataFieldDefinition==null && other.getDynamicMetadataFieldDefinition()==null) || 
             (this.dynamicMetadataFieldDefinition!=null &&
              java.util.Arrays.equals(this.dynamicMetadataFieldDefinition, other.getDynamicMetadataFieldDefinition())));
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
        if (getDynamicMetadataFieldDefinition() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDynamicMetadataFieldDefinition());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDynamicMetadataFieldDefinition(), i);
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
        new org.apache.axis.description.TypeDesc(DynamicMetadataFieldDefinitions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "dynamic-metadata-field-definitions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dynamicMetadataFieldDefinition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "dynamicMetadataFieldDefinition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "dynamicMetadataFieldDefinition"));
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
